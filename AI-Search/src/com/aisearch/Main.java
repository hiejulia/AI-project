package com.aisearch;
import java.util.Map;
import jpl.Query;
import jpl.JPL;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // TODO code application logic here
        String t1 = "consult('/Users/admin/Documents/NetBeansProjects/JPLwJava/family.pl')";
        System.out.println(t1 + " " + (Query.hasSolution(t1) ? "succeeded" : "failed"));
        String t2 = "child(sonny, vito)";
        System.out.println(t2 + " " + (Query.hasSolution(t2) ? "provable" : "not provable"));
        String t3 = "grandfather(vito, anthony)";
        System.out.println(t3 + " " + (Query.hasSolution(t3) ? "provable" : "not provable"));


    }
}
