public class LongestPalidromSubString {
    public static void main(String[] args) {
        String str = "aabaa";
      LongestPalidrom(str);
    }

    public static String LongestPalidrom(String str) {

        int start = 0;
        int end = 0;


        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            int l1 = ExpandFromMiddle(str, i, i);
            int l2 = ExpandFromMiddle(str, i, i+1);
            int l = Math.max(l1, l2);

            if (l > end - start) {
                start = i - ((l - 1) / 2);
                end = i + (l / 2);
            }

        }
        return str.substring(start, end + 1);

    }


    public static int ExpandFromMiddle(String str, int left, int right) {
        if (str == null && left > right) {
            return 0;
        }

        while ((str.charAt(left) == str.charAt(right)) && (left >= 0 && right < str.length())) {
            System.out.println(left + right);
            right++;
            left--;
        }
        return right - left -1;


    }

}
