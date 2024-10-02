public class DebuggingCode {


    public void showResult() {
        int[] letters = new int[128];
        String s = "abcd";
        for(char c: s.toCharArray()) {
            System.out.println(c);
            System.out.println((int)c);
            System.out.println(letters[c]);
            letters[c]++;
            System.out.println(letters[c]);
        }
    }

}
