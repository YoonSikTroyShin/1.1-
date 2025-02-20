import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] Solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.containsKey(photo[i][j])) {

                }
            }
        }

        return answer;
    }

}
