public class String16 {


    public int getSum(String a, String b){

        if(a.length() > b.length()){
            String temp = a;
            a = b;
            b = temp;
        }

        StringBuffer strResult = new StringBuffer("");

        int indexA;
        int indexB = b.length() - 1;

        int surplus = 0;
        int numberB = 0;
        int numberA = 0;
        int sum = 0;

        for(indexA = a.length() - 1;indexA >= 0;--indexA){

            numberA = a.charAt(indexA) - 48;
            numberB = b.charAt(indexB) - 48;

            sum = numberA + numberB + surplus;

            surplus = sum >= 10 ? 1 : 0;

            strResult.append(sum % 10);
            indexB--;
        }

        numberB = indexB >= 0 ? b.charAt(indexB--) - 48 : 0;
        sum = surplus == 1 ? numberB + 1 : numberB;
        strResult.append(sum % 10);

        return Integer.parseInt(strResult.append(b.substring(0,indexB + 1)).reverse().toString());
    }



    public static void main(String []s){
        String a = "423";
        String b = "1456";
        System.out.println(new String16().getSum(a,b));
    }

}
