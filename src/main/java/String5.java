import java.util.ArrayList;
import java.util.HashMap;

public class String5 {


    public ArrayList<String> getListStringAppearDouble(String str) {

        str = str.replaceAll("[^a-zA-Z0-9_]", " ");
        String[] arrData = str.split(" +");
        HashMap<String, Integer> hmListResult = new HashMap<String, Integer>();

        for (int i = 0; i < arrData.length; ++i) {
            hmListResult.put(arrData[i], hmListResult.getOrDefault(arrData[i], 0) + 1);
        }

        ArrayList<String> listResult = new ArrayList<>();
        for (String key : hmListResult.keySet()) {
            if (hmListResult.get(key) > 1) {
                listResult.add(key);
            }
        }
        return listResult;
    }

}
