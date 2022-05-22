public class Reverse {
    public static void main(String[] args) {
        String s = "bhb";

        String r = new String();
        for (int i = s.length() - 1; i >= 0; i--) {
            char temp = s.charAt(i);
            r = r + temp;
        }

        if (s.compareTo(r) == 0) {
            System.out.println("it is palidrom");
        } else {
            System.out.println("it is not a palidrom");
        }
    }
}
