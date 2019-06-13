public class String13 {

    public boolean isSameString(String strA, String strB) {

        if (strA.length() < strB.length()) {
            String temp = strA;
            strA = strB;
            strB = temp;
        }

        String regex = "";

        for (int i = 0; i < strA.length(); ++i) {

            regex = String.valueOf(strA.charAt(i));
            String[] arr = strB.split(regex);

            if (arr[0].equals(strB)) {
                return false;
            }
        }
        return true;
    }

}
