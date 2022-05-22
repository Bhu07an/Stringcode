public class RotationOfOther {
    public static void main(String[] args) {
        String first = "madam";
        String seconf = "mmada";

        String universal = first + first;
        if (first.length() == seconf.length()) {
            if (universal.contains(seconf) == true) {
                System.out.println("it is rotation");
            } else {
                System.out.println("not a rotation");
            }
        } else {
            System.out.println("rotation can't be posssible ");
        }

    }
}