public class Test {
    public static void main(String[] args) {
       String bin = "";
       //bin += "0";
       //bin += "0";
       //bin += "1";

       // bin = recursiveMul(13,"");
        System.out.println(bin);
      /*  for (int i = 0; i < bin.length(); i++) {
            System.out.println(1%2);
        }*/
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
    }*/

}

