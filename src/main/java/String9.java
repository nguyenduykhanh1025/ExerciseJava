public class String9 {

    public String shortcutString(String str) {

        StringBuffer strResult = new StringBuffer("");
        char valueTemp = str.charAt(0);
        int jump = 0;

        for (int i = 1; i < str.length(); ++i) {
            if (str.charAt(i) != valueTemp || (i + 1 == str.length())) {
                if (jump <= 1) {
                    strResult.append(valueTemp);
                } else {
                    strResult.append(valueTemp);
                    jump = i + 1 == str.length() ? jump + 1 : jump;
                    strResult.append(jump);
                }
                valueTemp = str.charAt(i);
                jump = 0;
            }
            jump++;
        }

        return strResult.toString();
    }
}
