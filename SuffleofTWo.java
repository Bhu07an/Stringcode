public class SuffleofTWo {
    public static void main(String[] args) {
        String first = "jgg";
        String second = "25";
        String sufflecheck = "j2g5g";
        IsValidSuffle(first, second, sufflecheck);
    }

    public static void IsValidSuffle(String first, String second, String check) {
        int i = 0, j = 0, k = 0;
        if (check.length() == (first.length() + second.length())) {

            for (int m = 0; m < check.length(); m++) {

                if (i < first.length() && j < second.length()) {
                    if (first.charAt(i) == check.charAt(m)) {
                        i++;
                        continue;

                    } else if (second.charAt(j) == check.charAt(m)) {
                        j++;
                        continue;

                    } else {
                        System.out.println("not the suffled");

                    }
                }

                if (i >= first.length() ||  j == second.length()) {
                    System.out.println("best suffled");
                }

            }

        } else {
            System.out.println("invalid expresion");
        }
    }
}
