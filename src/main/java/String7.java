public class String7 {

    public int getIndexSubString(String str, String subStr) {
        int indexSubStr;
        for (int i = 0; i < str.length(); ++i) {
            indexSubStr = 0;
            if (str.charAt(i) == subStr.charAt(0)) {
                int j = i + 1;
                for (indexSubStr = 1; indexSubStr < subStr.length() && j < str.length(); ++indexSubStr) {
                    if (str.charAt(j++) != subStr.charAt(indexSubStr)) {
                        break;
                    }
                }
                if (indexSubStr == subStr.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}
