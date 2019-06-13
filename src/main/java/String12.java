public class String12 {

    public String deleteDuplicateInString(String str) {

        StringBuffer strTemp = new StringBuffer("");

        for (int i = 1; i < str.length(); ++i) {
            if (str.charAt(i) == str.charAt(i - 1)) {

                strTemp.append(str.substring(0, i - 1));
                strTemp.append(str.substring(i, str.length()));

                str = strTemp.toString();
                strTemp = new StringBuffer("");
                i = i - 1;
            }
        }
        return str;
    }

}
