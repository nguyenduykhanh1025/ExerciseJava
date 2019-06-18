public class String13 {

    public boolean isSameString(String strA, String strB) {

        if (strA.length() != strB.length()) {
            return false;
        }

        strA = strA.toLowerCase();
        strB = strB.toLowerCase();

        for (int i = 0; i < strA.length(); ++i) {

            if (strB.indexOf(strA.charAt(i)) == -1) {
                return false;
            }

        }
        return true;
    }

}
