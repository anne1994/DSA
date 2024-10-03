package ArraysAndStrings;

import java.util.HashMap;

public class PalindromePermutation {

    public Boolean isPalindromePermutation(String str) {

        //remove spaces from string and convert to lowercase
        str = str.replaceAll("\\s","").toLowerCase();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++ ) {
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            } else {
                hm.put(str.charAt(i), 1);
            }

        }
        System.out.println(hm);
        // no more than one char should have odd count
        int oddCount = 0;
        for( int num : hm.values()) {
            if (num % 2 !=0) {
                oddCount++;
            }
        }

        System.out.println("oddCount : " + oddCount);
        if(oddCount > 1) {
            return false;
        }
        return true;
    }
}
