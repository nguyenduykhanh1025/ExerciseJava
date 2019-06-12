public class String8 {


    public String getStringStandard(String str) {


        while (str.replace("  ", " ") != str) {
            str = str.replace("  ", " ");
        }

        StringBuffer strResult = new StringBuffer(str);

        if (strResult.charAt(0) > 96) {
            strResult.setCharAt(0, (char) (strResult.charAt(0) - 32));
        }

        StringBuffer strTemp = new StringBuffer(strResult);
        for (int i = 1; i < strResult.length(); ++i) {
            if (strResult.charAt(i) == '.' || strResult.charAt(i) == '?' || strResult.charAt(i) == '!') {

                if (strResult.charAt(i - 1) == ' ') {
                    strResult.delete(i - 1, i);
                    i--;
                }
                if (strResult.charAt(i += 2) > 96) {
                    strResult.setCharAt(i, (char) (strResult.charAt(i) - 32));
                }
            }
        }

        return strResult.toString();
    }
}
