import java.util.HashMap;
import java.util.Map;

public class MarryCandy {
    public int Solution(int[] array) {
        if (null != array) {
            if (array.length % 2 == 0) {
                int halfCount = array.length / 2;
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < array.length; i++) {
                    if (map.size() < halfCount) {
                        if (map.containsKey(array[i])) {
                            int getCurrentCount = map.get(array[i]);
                            map.replace(array[i], getCurrentCount + 1);
                        } else {
                            map.put(array[i], 1);
                        }
                    } else {
                        if (map.containsKey(array[i])) {
                            int getCurrentCount = map.get(array[i]);
                            map.replace(array[i], getCurrentCount + 1);
                        }

                    }
                }
                return map.size();

            } else {
                throw new IllegalArgumentException("array size is not even");
            }

        }
        return 0;
    }

}
