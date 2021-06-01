public class Test {
    public static void main(String[] args) {
       String bin = "";
       //bin += "0";
       //bin += "0";
       //bin += "1";

       // bin = recursiveMul(13,"");
       // System.out.println(bin);
      /*  for (int i = 0; i < bin.length(); i++) {
            System.out.println(1%2);
        }*/


       // System.out.println(recursivePower(3, 3));

        System.out.println(recursiveBinToDec("11010", 0));

    }

    /*public static String recursiveMul(int n, String m) {
        if (n == 0){
            //change direction of number 001 --> 100
            char[] revertBin = m.toCharArray();
            m = "";
            for (int i = revertBin.length-1; i >= 0; i--)
                m += revertBin[i];

            return m;
        }else {
            if (n%2==1)
                return recursiveMul(n / 2, m += "1");
            else
                return recursiveMul(n /2,m += "0");
        }
    }

    public static int recursiveSum(int n) {
        if (n==1){
            return 1;
        }
        else {
            return recursiveSum(n-1)+n;
        }
    }*/

    public static int recursivePower(int x, int n) {
        if (n == 0){
            return 1;
        }else {
            return recursivePower(x,n-1)*x;
        }
    }

    //Funktion is working but is counting from the wrong side
    public static int recursiveBinToDec(String binary, int decimal) {
        System.out.println(binary.length()+".......");
        if (binary.length() == 0){
            return decimal;
        }else {
            if (binary.charAt(binary.length()-1) == '1') {
                System.out.println(binary.length()+"count");
                return recursiveBinToDec(binary.substring(0, binary.length()-1), decimal + recursivePower( 2, binary.length()-1));
            } else {
                return recursiveBinToDec(binary.substring(0, binary.length()-1), decimal + 0);
            }
        }
    }
}

