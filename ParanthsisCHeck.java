public class ParanthsisCHeck {
    public static void main(String[] args){
        String str = "(,[     ]";
        int count1 =0;
        int count2 =0;
        int count3 =0;

        for(int i =0 ; i < str.length() ; i++){

            char currchar = str.charAt(i);

            if( currchar == '{'){
                count1++;
            }
            if( currchar == '}'){
                count1++;
            }
            if( currchar == '['){
                count2++;
            }
            if( currchar == ']'){
                count2++;
            }
            if( currchar == '('){
                count3++;
            }
            if( currchar == ')'){
                count3++;
            }
        }

        if( count1 % 2 == 0 && count2 % 2 ==0 && count3 % 2 ==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
