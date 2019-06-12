public class String6 {

    public String getCovert(String str) {
        StringBuffer strResult = new StringBuffer("");
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) < 91) {
                strResult.append((char) (str.charAt(i) + 32));
            } else {
                strResult.append((char) (str.charAt(i) - 32));
            }

        }
        return strResult.toString();
    }
}
