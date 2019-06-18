public class String7 {

    public int getIndexSubString(String str, String subStr) {
        int indexSubStr;

        for (int i = 0; i < str.length(); ++i) {

            int j = ++i;

            for (indexSubStr = 0; indexSubStr < subStr.length() && j < str.length(); ++indexSubStr) {

                if (str.charAt(j++) != subStr.charAt(indexSubStr)) {
                    break;
                }

            }

            if (indexSubStr == subStr.length()) {
                return i;
            }

        }

        return -1;
    }
}
