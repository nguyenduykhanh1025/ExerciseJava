import java.util.Arrays;
import java.util.ArrayList;

public class String1 {

    public String[] getSentenceInString(String str) {
        String[] data = str.split("\\\n|\\?|\\.|\\!");
        return data;
    }

}
