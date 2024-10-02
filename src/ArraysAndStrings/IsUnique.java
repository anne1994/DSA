package ArraysAndStrings;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// implement a algorithm to determine if a string has all unique characters.
// What if i cannot use additional data structures?
// difference between ascii string , unicode string

import java.util.HashSet;

public class IsUnique {
    //using a HashSet
    public boolean isUnique(String x) {

        //HashSet basic approach
//        HashSet<Character> charsSet = x.chars()
//                .mapToObj(e -> (char) e)
//                .collect(Collectors.toCollection(HashSet::new));
////        System.out.println(charsSet);
//        return (charsSet.toArray().length != x.length());

        //using HashMap

        //Brute force

        //other solutions
        HashSet<Character> charSet = new HashSet<>();
        for (char c : x.toCharArray()) {
            if(!charSet.add(c)){
                return false;
            }
        }
        return true;


    }



}


