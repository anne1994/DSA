import ArraysAndStrings.ContainsDuplicate;
import ArraysAndStrings.PalindromePermutation;
import ArraysAndStrings.Urlify;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



/* isUnique */
        String inputString = "abcdeffff" ;
        ArraysAndStrings.IsUnique objt = new ArraysAndStrings.IsUnique();
        Boolean isUniqueString = objt.isUnique(inputString);
        System.out.println(isUniqueString);

/* checkPermutation */
        String checkPermutationString1 = "abc";
        String checkPermutationString2= "cab";
        ArraysAndStrings.CheckPermutation cp = new ArraysAndStrings.CheckPermutation();
        Boolean checkPermuationOutput = cp.checkPermuation(checkPermutationString1, checkPermutationString2);
        System.out.println(checkPermuationOutput);

 /* containsDuplicate */
        int[] arrayName = new int[]{1,2,3,4,5};
        ContainsDuplicate cd = new ContainsDuplicate();
        Boolean containsDuplicateOutput = cd.containsDuplicate(arrayName);
        System.out.println(containsDuplicateOutput);


//        DebuggingCode dc = new DebuggingCode();
//        dc.showResult();


/* URLIFY */
        Urlify url = new Urlify();
        String res = url.UrlifyString("Mr John Smith    ", 13);
        System.out.println("result string: " + res);

/* Palindrom Permutation */

        PalindromePermutation pp = new PalindromePermutation();
        Boolean isPP = pp.isPalindromePermutation("atcoo cT"); //tact coa
        System.out.println("result palindrome permutation: " + isPP);
    }
}