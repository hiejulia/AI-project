(ROOT|sentiment=1|prob=0.606
  (NP|sentiment=2|prob=0.484
    (JJ|sentiment=2|prob=0.631 Self-driving)
    (NP|sentiment=2|prob=0.511
      (NN|sentiment=2|prob=0.994 car)
      (NNS|sentiment=2|prob=0.631 companies)))
  (S|sentiment=1|prob=0.577
    (VP|sentiment=2|prob=0.457
      (VP|sentiment=2|prob=0.587
        (MD|sentiment=2|prob=0.998 should)
        (RB|sentiment=1|prob=0.974 not))
      (VP|sentiment=1|prob=0.703
        (VB|sentiment=2|prob=0.994 be)
        (VP|sentiment=1|prob=0.614
          (VBN|sentiment=2|prob=0.969 allowed)
          (S|sentiment=2|prob=0.724
            (TO|sentiment=2|prob=0.990 to)
            (VP|sentiment=2|prob=0.557
              (VB|sentiment=2|prob=0.887 investigate)
              (NP|sentiment=2|prob=0.823
                (PRP|sentiment=2|prob=0.997 their)
                (NP|sentiment=2|prob=0.873
                  (JJ|sentiment=2|prob=0.996 own)
                  (NNS|sentiment=2|prob=0.631 crashes))))))))
    (.|sentiment=2|prob=0.997 .)))





# architecture in depth 

- SentimentMain
    - Initializes CoreNLP (the SentimentDetector class), and starts the TwitterStream, RedditStream, and NewsStream threads.

- SentimentDetector

- Twitter Stream 
    - detects sentiment on each matching tweet.


- RedditStream
    - JRAW library) to search for certain terms periodically, then extracts the matching post and all comments; all extracted text is sent for sentiment detection
    - parallel 



- NewsStream
    - body is extracted with Crux from the original source, and this text is sent for sentiment detection



## Gate platform 


## Continuos evaluation ( research proof of concept )
- CoreNLP sentiment detector is trained on movie reviews, which might not match the syntax and word usage found in tweets, Reddit posts and comments, and news articles. It takes considerable effort to retrain the CoreNLP sentiment detector on more representative examples

## Retraining CoreNLP sentiment models ()

- model's training examples
- training examples' labels
- machine learning algorithm

- sentimental label 
- CoreNLP's sentence parser to create the tree structure.

`java -cp ejml-0.23.jar:stanford-corenlp-3.9.1.jar:stanford-corenlp-3.9.1-models.jar -Xmx8g \
  edu.stanford.nlp.pipeline.StanfordCoreNLP \
  -annotators tokenize,ssplit,parse -file mysentences.txt`



  -> Add more examples to training dataset that fit to the use case (Twitter stream, Reddit data, etc) and retrain the model 
 


## Lib/ Dependency
- https://mvnrepository.com/artifact/edu.stanford.nlp/stanford-corenlp

- https://mislove.org/twittermood/
