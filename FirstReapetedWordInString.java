import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FirstReapetedWordInString {
    public static void main(String[] args) {
        String[] arr = { "bh", "bb", "pat", "bb", "bh","bb","bb"};
        int n = arr.length;
        System.out.println(Repeated(arr,n));
    }

    public static String Repeated(String[] arr, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        String currStr = "";

        for (int i = 0; i < n; i++) {
        currStr = arr[i];
        if (map.containsKey(currStr)) {

        int value = map.get(currStr);
        map.put(currStr,value+1);  }

        else {
                    map.put(currStr, 1);
            }
                                        // map ke ander saare value lee le ya thak//
        }
        System.out.println("the MAP  " + map);
        int FirstMax = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for(Map.Entry entry : map.entrySet()){
            int value = (int)entry.getValue();

            if( value > FirstMax){                       // here we itertate on the map and find the  second largest value in the map...
                SecondMax = FirstMax;
                FirstMax = value;
            }
            else if( value > SecondMax && value < FirstMax){
                SecondMax = value;
            }

        }

        for( Map.Entry m : map.entrySet()){                  // returning key of the second max value
            int value  =(int)m.getValue();
            String key  = (String)m.getKey();
            if(value == SecondMax){
                return key;
            }
        }

       return null;
    }
}
