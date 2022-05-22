public class ConvertSentanceInToEquivalentMoblieNum {

    public static void main(String[]args){
         String str = "bhushan patil";
         String[] arr = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","88","9","99","999","9999"};
        System.out.println(KeyCombi(str,arr));
    }
    public static String KeyCombi(String str , String[] arr){

        int n = str.length();
        String number =  "";
        for(int i = 0 ; i < n; i++){
            char currchar = str.charAt(i);
            if( currchar == ' ' ){
                number = number+ "0";
            }
            else{
                int position  = currchar - 'a';
                number = number + arr[position];
            }
        }
        return  number;
    }
}
