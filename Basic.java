import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
          //  Scanner scan = new Scanner(System.in);
         //  System.out.println("entre your name pls");
        // String name1 = scan.nextLine();
       // String name2 = scan.nextLine();

       StringBuilder name = new StringBuilder("tony");
        System.out.println(name.charAt(2));

        name.insert(2,'n');
        System.out.println(name);
        name.setCharAt(0,'T');
        System.out.println(name);
        name.deleteCharAt(2);
        System.out.println(name);
        name.append(" Stark");
        System.out.println(name);
        System.out.println(name);

        String NAME1 = "BHUSAN";



    }
}