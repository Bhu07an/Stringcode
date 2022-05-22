import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] str  = {"bhu","bhavesh","bhura"};
        if(str.length == 0) return;
        String first = str[0];

        for( int i = 0 ; i < str.length ; i++){
            while( str[i].indexOf(first) != 0){
                first = first.substring(0,first.length() -1);

            }
        }
        System.out.println(first);
    }
}
