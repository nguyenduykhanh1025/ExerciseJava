public class String3 {

    public boolean isStringSymmetric(String s) {
        if (s.substring(0, s.length() / 2).equals(new StringBuffer(s.substring(s.length() - (s.length() / 2))).reverse().toString())) {
            return true;
        }
        return false;
    }
}
