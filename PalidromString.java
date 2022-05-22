public class PalidromString {
    public static void main(String[] args) {
    /*   StringBuilder name = new StringBuilder("CAC");
       StringBuilder origiinal = new StringBuilder(name);
                                                                // Through String builder
       for( int i = 0 ; i < name.length()/2 ; i++){

           int firstINDX = i;
           int lastINDX = name.length()-1-i;

            char first = name.charAt(firstINDX);
            char last = name.charAt(lastINDX);

            name.setCharAt(firstINDX,last);
            name.setCharAt(lastINDX,first);

       }
       if( name.compareTo(origiinal) == 0){
           System.out.println("it is the palidrom String  ==> " + name);
       }
       else{
           System.out.println("it is not a palidrom Strign");
       }

    }                                                                                    */


        String name = "amma";
        String rev = "";
       for(int i = name.length()-1; i >=0 ; i--){
           rev = rev + name.charAt(i);
       }
       if( name.compareTo(rev) ==0){
           System.out.println("it is palidrom ");
       }
       else System.out.println("it is noyt a  palidrom");
    }

}