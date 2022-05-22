public class CountSayStr {
    public static void main(String[] args){
        String first  = "2233351";
        first = first + "*";
        System.out.println(countsay(first));
    }
    public static String countsay(String str){
        int count = 1;
        String say = "";
        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i-1)  == str.charAt(i)){
                count++;
            }
            else{
                say = say + count;
                say = say + str.charAt(i-1);
                count = 1;
            }
        }
        return say;
    }
}
