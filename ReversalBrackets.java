public class ReversalBrackets {
    public static void main(String[] args){
        String str  = "{{}{}{{{";
        System.out.println(Count(str));
    }
    public static int Count(String str){                                 // wrong
        int count = 0;
        int i = 0 ;
        int j = str.length() -1;
        while( i < j){

            if( str.charAt(i) == '{' && str.charAt(j) == '}' ){
                i++;
                j--;
            }else {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}
