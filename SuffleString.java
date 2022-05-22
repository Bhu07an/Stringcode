import java.util.*;

public class SuffleString {
    public static void main(String[] args){                 // wrong have to work on it
        String first = "patil";
        String second = "bhushanpatilrocks";

        int a = first.length();
        int b = second.length();




        if( a > b){
            System.out.println("false");
        }
        else{
            char[] arrchar = new char[b];
            for(int i = 0 ; i < b; i++){
                arrchar[i] = second.charAt(i);
            }
            Arrays.sort(arrchar);
            String str = "";
            for(int j= 0 ; j < b; j++){
                str  =  str + arrchar[j];
            }

            char[] arrchar1 = new char[a];
            for(int k = 0 ; k < a; k++){
                arrchar1[k] = first.charAt(k);
            }
            Arrays.sort(arrchar1);
            String str2 = "";
            for(int j= 0 ; j < a; j++){
                str2  =  str2 + arrchar1[j];
            }




        }
    }
}
