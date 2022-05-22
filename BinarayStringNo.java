public class BinarayStringNo {
    public static void main(String[] args) {
        String str = "0000000000";
        System.out.println(Squ(str));
    }

    public static int Squ(String str) {
        int countforZERO = 0;
        int countforONE = 0;
        int countforSEQ = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '0') {
                countforZERO++;

            }
            if (str.charAt(i) == '1') {
                countforONE++;

            }
            if (countforONE == countforZERO) {
                countforSEQ++;

                countforONE = 0;
                countforZERO = 0;
            }
        }

        if (countforSEQ == 0) {
            return -1;
        } else {
            return countforSEQ;
        }

    }
}
