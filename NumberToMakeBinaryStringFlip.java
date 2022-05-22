public class NumberToMakeBinaryStringFlip {
    public static void main(String[] args){
        String s = "0101";
        int count1 = 0;
        int count2 = 0;
       for( int i = 0 ; i < s.length() ; i++){

           if( i%2 == 0 && s.charAt(i) % 2 == 0){
               count1++;
           }
           if( i%2 != 0 && s.charAt(i) % 2 != 0){
               count1++;
           }
           if( i%2 == 0 && s.charAt(i) % 2 != 0){
               count2++;
           }
           if( i%2 != 0 && s.charAt(i) % 2 == 0){
               count2++;
           }

       }
        System.out.println("count1------>  "+ count1 + " .....  count2---->  "+ count2  );
       int max = Math.min(count1,count2);
        System.out.println(max);


    }

}
