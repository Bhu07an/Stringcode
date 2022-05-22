import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
        String string = "geeksofgeeks";
        duplicate(string);
    }

    public static void duplicate(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (map.containsKey(temp)) {
                int value = map.get(temp) + 1;
                map.put(temp, value);
            } else {
                map.put(temp, 1);
            }
        }

        for (Map.Entry  m:  map.entrySet()) {
            int temp = (Integer) m.getValue();
            if (temp > 1)
                System.out.println(m.getKey());
        }

    }

}

  /*for (Map.Entry m : map.entrySet())
         {
         Integer temp = (Integer)m.getValue();
         if (temp > 2)
         System.out.println(m.getKey());
         }               */