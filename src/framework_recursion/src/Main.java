package framework_recursion.src;

import java.util.List;

/**
 * Main class where all computations take place.
 *
 * @author Koitz-Hristov
 */
public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error: Please specify an input file");
            System.exit(-1);
        }

        IOHandler ioHandler=new IOHandler();
        List<String> input_params = ioHandler.readInput(args[0]);
        System.out.println("Input File: " + args[0]);

        String result="";
        switch (input_params.get(0)) {
            case "mul":
                result= recursiveMul(Integer.valueOf(input_params.get(1)).intValue(), input_params.get(2));
                break;
            case "sum":
                result= Integer.toString(recursiveSum(Integer.valueOf(input_params.get(1)).intValue()));
                break;
            case "power":
                result= Integer.toString(recursivePower(Integer.valueOf(input_params.get(1)).intValue(), Integer.valueOf(input_params.get(2)).intValue()));
                break;
            case "binToDec":
                result=Integer.toString(recursiveBinToDec(input_params.get(1), 0));
                break;
        }
        System.out.println("Result: " + result);
        ioHandler.printResultToOutputFile(result,args[0]);


    }

    /**
     * Converts a decimal to a binary recursively.
     * @param n decimal number to be converted
     * @param m String containing the binary number
     * @return the binary number stored in a String
     */
    public static String recursiveMul(int n, String m){
        if (n == 0){
            //change direction of binNumber 001 --> 100
            char[] revertBin = m.toCharArray();
            m = "";
            for (int i = revertBin.length-1; i >= 0; i--) {
                m += revertBin[i];
            }
            return m;
        }else {
            if (n%2==1)
                return recursiveMul(n / 2, m += "1");
            else
                return recursiveMul(n /2,m += "0");
        }
    }

    /**
     * Recursively computes the sum of positive integer n.
     * @param n the integer
     * @return recursive sum of n
     */
    public static int recursiveSum(int n) {
        //TODO
        if (n==1){
            return 1;
        }
        else {
            return recursiveSum(n-1)+n;
        }
    }

    /**
     * Recrusively computes the power of a positive integer base x and a positive integer exponent n.
     * @param x base
     * @param n exponent
     * @return x to the power of n
     */
    public static int recursivePower(int x, int n) {
        if (n == 0){
            return 1;
        }else {
            return recursivePower(x,n-1)*x;
        }
    }



    /**
     * Converts a binary to a decimal recursively.
     * @param binary String containing the binary number
     * @param decimal resulting decimal number
     * @return the decimal representation
     */
    public static int recursiveBinToDec(String binary, int decimal) {
        //TODO
        return 0;
    }


}
