public class wrapperClass {
    public static void main(String[] args) {
        // Autoboxing => primitive to object
        int i = 3;
        double j = 3.25;
        // Instead of doing like below
        Integer x = Integer.valueOf(i);
        Double y = Double.valueOf(j);

        // We can use autoboxing
        Integer x2 = i;  // Compiler will assume " Integer.valueOf(x) automatically "
        Double y2 = j;

        System.out.println("Value of X: "+x);
        System.out.println("Value of Y: "+y);

        System.out.println("Value of X2: "+x2);
        System.out.println("Value of Y2: "+y2);

        // Unboxing => object to primitive
        Double d = new Double(5.101);
        double pd = d;
        System.out.println(pd);

        // Primitive to String
        int num = 52;
        String str = Integer.toString(num);
        System.out.println("STR after conversion: "+str);

        double num2 = 50.23;
        String str2 = Double.toString(num2);
        System.out.println("STR after conversion: "+str2);


        // String to Primitive
        String strNum = "123";
        int val = Integer.parseInt(strNum);
        System.out.println(val);

        String strNum2 = "155.65";
        double val2 = Double.parseDouble(strNum2);
        System.out.println(val2);

        // Binary, Octal, Hexadecimal to Decimal
        // Binary to Decimal
        String binaryVal = "1010";
        Integer decVal1 = Integer.parseInt(binaryVal, 2);
        System.out.println(decVal1);

        // Octal to Decimal
        String octalVal = "101011";
        Integer decVal2 = Integer.parseInt(octalVal, 8);
        System.out.println(decVal2);

        // Hexadecimal to Decimal
        String hexVal = "16B2C";
        Integer decVal3 = Integer.parseInt(hexVal, 16);
        System.out.println(decVal3);


        // Decimal to Binary, Octal, Hexadecimal
        // Decimal to Binary
        int decimalValue = 10;
        String binaryValue = Integer.toBinaryString(decimalValue);
        System.out.println("Binary: "+binaryValue);

        // Decimal to Octal
        int decimalValue2 = 25;
        String octalValue = Integer.toOctalString(decimalValue2);
        System.out.println("Octal: "+octalValue);

        // Decimal to Hexadecimal
        int decimalValue3 = 350;
        String hexValue = Integer.toHexString(decimalValue3);
        System.out.println("Hex Value: "+hexValue);

    }
}
