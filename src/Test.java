public class Test {
    public static void main(String[] args) {
       String bin;
        bin = recursiveMul(8,"");
        System.out.println(bin);
    }

    public static String recursiveMul(int n, String m) {
        if (n > 0) {
            m += "1";
            recursiveMul(n / 2, m);
            return m;
        } else {
            return "0";
        }

    }

}

