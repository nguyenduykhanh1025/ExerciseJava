public class String10 {
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


    public String getRevivalString(String strShortcut) {
        StringBuffer strResult = new StringBuffer("");

        for (int i = 0; i < strShortcut.length(); ++i) {

            if (strShortcut.charAt(i) >= 49 && strShortcut.charAt(i) <= 57) {
                int k = i;
                StringBuffer jump = new StringBuffer("");
                while (k < strShortcut.length() && (strShortcut.charAt(k) >= 49 && strShortcut.charAt(k) <= 57)) {
                    jump.append(strShortcut.charAt(k));
                    k++;
                }
                for (int j = 0; j < Integer.parseInt(jump.toString()) - 1; ++j) {
                    strResult.append(strShortcut.charAt(i - 1));
                }
                i = k - 1;
            } else {
                strResult.append(strShortcut.charAt(i));
            }

        }

        return strResult.toString();
    }
}
