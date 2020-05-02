public static String respondPrereqs(NLGFactory nlgFactory, Realiser realiser, String course, List<String> prereqs) {

  // If no prereqs, return immediately
  if(prereqs.get(0).equals("[]")) {
    return course.toUpperCase() + " has no prerequisites.";
  }


  // Create clause
  SPhraseSpec p = nlgFactory.createClause();
  NPPhraseSpec subject = nlgFactory.createNounPhrase("the", "prerequisite");

  // if multiple prereq subsets, make sure "prerequisites"
  // is plural and the verb is "are" instead of "is"
  if(prereqs.size() > 1) {
    subject.setPlural(true);
    p.setPlural(true);
  }

  // Create preposition phase
  PPPhraseSpec prep = nlgFactory.createPrepositionPhrase("for", nlgFactory.createNounPhrase(course.toUpperCase()));

  // set the sentence subject to "the prerequisite",
  // and add a pre-modifier that says "for [course]",
  // resulting in "the prerequisite for [course]"
  p.setSubject(subject);
  p.addPreModifier(prep);
  p.setVerb("is");

  // Build a disjunction ("or") between subsets of courses
  CoordinatedPhraseElement prereqOptions = new CoordinatedPhraseElement();
  prereqOptions.setFeature(Feature.CONJUNCTION, "or");

  // for each course mentioned in the subset
  Pattern coursePattern = Pattern.compile("([a-z]{4}[0-9]{3})");

  // show at most 3 subsets
  for(int i = 0; i < Math.min(prereqs.size(), 3); i++) {
    String pr = prereqs.get(i);

    // start a conjunction ("and") for the course list
    CoordinatedPhraseElement prereqsConj = new CoordinatedPhraseElement();

    // extract each course
    Matcher prMatcher = coursePattern.matcher(pr);
    int count = 0;
    while(prMatcher.find()) {
      prereqsConj.addCoordinate(prMatcher.group(1).toUpperCase());
      count++;
    }

    // if we have multiple courses, say "all of ..."
    // or "both ..."
    if(count > 2) {
      prereqsConj.addPreModifier("all of");
    } else if(count == 2) {
      prereqsConj.addPreModifier("both");
    }
    prereqOptions.addCoordinate(prereqsConj);
  }

  // if we had lots of prereq subsets, just summarize the rest
  if(prereqs.size() > 3) {
    prereqOptions.addCoordinate(nlgFactory.createNounPhrase((prereqs.size() - 3) + " more options"));
  }

  // the object of the sentence is the list of courses
  p.setObject(prereqOptions);
  return realiser.realiseSentence(p);
}