import java.math.BigInteger;

public class binarySum {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        BigInteger decA = new java.math.BigInteger(a,2);
        BigInteger decB = new java.math.BigInteger(b,2);
        BigInteger sum = decA.add(decB);

        System.out.println(sum.toString(2));
    }
}
