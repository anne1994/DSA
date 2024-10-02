package ArraysAndStrings;
/* Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false */
import java.util.Arrays;


public class CheckPermutation {
        public Boolean checkPermuation(String s1, String s2) {
            char[] content1 = s1.toCharArray();
            char[] content2 = s2.toCharArray();
            Arrays.sort(content1); Arrays.sort(content2);
            String s1Sorted = new String (content1);
            String s2Sorted = new String (content2);
            return (s1Sorted.equalsIgnoreCase(s2Sorted));
        }

}
