public class String12 {

    public String deleteDuplicateInString(String str) {

        StringBuilder strResult = new StringBuilder();
        
        strResult.append(str.charAt(0));
        
        for (int i = 0; i < str.length() - 1; ++i) {
            
            if (str.charAt(i) != str.charAt(i + 1)) {
                strResult.append(str.charAt(i + 1));
            }
            
        }
        
        return strResult.toString();
    }

}
