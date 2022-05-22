public class reverseString {
    public static void main(String[] args) {
        String n = "patil";
        int i = 0;
        int j = n.length() - 1;

        while (i < j) {
            char first = n.charAt(i);
            char last = n.charAt(j);
            char temp = first;

            n.replace(first, last);
            n.replace(last, temp);
            i++;
            j--;

        }
        System.out.println(n);
    }
}
