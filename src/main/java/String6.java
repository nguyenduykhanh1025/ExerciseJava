public class String6 {

    public String getCovert(String str) {

        StringBuilder strResult = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                strResult.append(Character.toUpperCase(ch));
            } else {
                strResult.append(Character.toLowerCase(ch));
            }
        }

        return strResult.toString();
    }
}
