public class LCSbruteForce {
    // LCS ===> longest common subsquence
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "AC";
        System.out.println(LCS(str1, str2));
    }

    public static int LCS(String str1, String str2) {
        int count = 0;
        String s = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    count++;
                    s = s + str1.charAt(i);
                }
            }
        }

        if (count > 0) {
            System.out.println(s);
            return count;
        }
        return 0;
    }
}
