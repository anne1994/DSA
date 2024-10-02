package ArraysAndStrings;

public class Urlify {

    public String UrlifyString(String s, int trueLength) {

        char[] s_array = s.toCharArray();
        System.out.println(s_array.length); //17
        System.out.println(s.length()); //17
        //count spaces in the string
        int spaceCount = 0, index , i = 0;
        for (i = 0; i < trueLength ; i++) {
            if (s_array[i] == ' '){
                spaceCount++;
            }
        }
        System.out.println("SpaceCount : " +  spaceCount);

       index = trueLength + spaceCount * 2;
       System.out.println("Index : " + index);

       if( trueLength < s_array.length) {
           s_array[trueLength] = '\0' ;
       }



       for(i = trueLength - 1; i >= 0; i--){
           if (s_array[i] == ' ') {
               s_array[index-1] = '0';
               s_array[index-2] = '2';
               s_array[index-3] = '%';
               index = index-3;
           } else {
               s_array[index-1] = s_array[i];
               index--;
           }
       }

        return new String(s_array);
    }
}
