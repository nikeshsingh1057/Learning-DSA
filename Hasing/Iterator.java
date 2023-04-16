// Java Program to Iterate over a HashMap

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

class Main {
  public static void main(String[] args) {

    // Creating a HashMap
    HashMap<String, String> languages = new HashMap<>();
    languages.put("Java", "Enterprise");
    languages.put("Python", "ML/AI");
    languages.put("JavaScript", "Frontend");

    // iterating through key/value mappings
    for(Entry<String, String> entry: languages.entrySet()) {
      System.out.print(entry+" ");
    }
    System.out.println();
    
    //iterating through key and value mappings
    for (Map.Entry<String, String> e :languages.entrySet()) {    //  Map.Entry<Integer,Integer> kahi kahi kewal  Entry<Integer,Integer> use hota hai.
        String key=e.getKey();
        String val=e.getValue();
        System.out.print(key+">"+val);
    }
    System.out.println();
    
    // iterating through keys
    for(String key: languages.keySet()) {
      System.out.print(key+" ");
    }
    System.out.println();
    
    // iterating through values
    for(String value: languages.values()) {
      System.out.print(value+" ");
    }
  }
}
// note kahi khai Map.Entry<Integer,Integer> use hota hai to kahi kahi kewal Entry<Integer,Integer> use hota hai for each loop mt to iska dhayan rakhana (kewal 'Map' ki batt kar rahe hai)
