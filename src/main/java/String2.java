import java.util.ArrayList;

public class String2 {

    public ArrayList<String> getCharInto(String str){
        ArrayList<String> listResult = new ArrayList<>();
        for(int i = 0; i< str.length(); ++i){
            char dataTemp = str.charAt(i);
            if ((dataTemp >= 97 && dataTemp < 122) || ((dataTemp >= 48 && dataTemp < 57))) {
                listResult.add(String.valueOf(dataTemp));
            }
        }
        return listResult;
    }
}
