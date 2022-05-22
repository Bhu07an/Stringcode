import java.util.Arrays;

public class ReverseStr {
    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("dad");
        for( int i = 0 ; i < name.length()/2 ; i++){

            int front = i;
            int back = name.length()-1-i;     /// finding the index for changing

            char frontchar =  name.charAt(front);
            char endchar =  name.charAt(back);

            name.setCharAt(front,endchar);
            name.setCharAt(back,frontchar);
        }
        System.out.println(name);
    }

}
