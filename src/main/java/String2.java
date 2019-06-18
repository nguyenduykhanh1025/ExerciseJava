import java.util.ArrayList;

public class String2 {

    public ArrayList<String> getCharOrNumberInString(String str) {
        ArrayList<String> listResult = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            char dataTemp = str.charAt(i);
            if (Character.isLetterOrDigit(dataTemp) && !Character.isUpperCase(dataTemp)) {
                listResult.add(String.valueOf(dataTemp));
            }
        }
        return listResult;

    }
}
