/* Java Methods
- length()
- equals()
- equalsIgnoreCase()
- contains()
* */
public class stringDemo {
    public static void main(String[] args) {
        String myName = "Rafiul";
        int len = myName.length();
        System.out.println(len);

        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";
        Boolean res1 = str1.equalsIgnoreCase(str2);
        Boolean res2 = str1.equals(str3);
        System.out.println(res1);
        System.out.println(res2);

        String str4 = "Hello World from Rafiul";
        boolean response = str4.contains("Rafiul");
        System.out.println("Response from Rafiul: "+response);

        String str5 = "Rafiul Islam";
        String str6 = " ";
        String str7 = "";
        System.out.println("Is empty: "+ str5.isEmpty());
        System.out.println("Is empty: "+ str6.isEmpty());
        System.out.println("Is empty: "+ str7.isEmpty());

        String fname = "Rafiul ";
        String lName = "Islam";
        String fullName = fname.concat(lName);
        System.out.println(fullName);

        String name = "Rafiul Islam";
        String upperCaseName = name.toUpperCase();
        System.out.println("Uppercase Name: "+upperCaseName);

        String lowerCaseName = name.toLowerCase();
        System.out.println("Lowercase Name: "+lowerCaseName);

        String str8 = "lorem ipsum";
        boolean result1 = str8.startsWith("l");
        boolean result2 = str8.startsWith("b");
        System.out.println("Starts with L : "+result1);
        System.out.println("Starts with B : "+result2);

        boolean result3 = str8.endsWith("s");
        System.out.println("Ends with S : "+result3);

        String input = "rafiul?islam?refat";
        String output = input.replace("?", "_");
        System.out.println("Output after replace: "+output);

        String str10 = "Hello World";
        char output2 = str10.charAt(1);
        System.out.println(output2);

        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);
        int uniCode = myStr.codePointAt(0);
        System.out.println("Unicode of H: "+uniCode);

        int indexOfL = myStr.indexOf("L");
        int indexOf_L = myStr.indexOf("l");
        System.out.println("Index of L: "+indexOfL);
        System.out.println("Index of L: "+indexOf_L);

        String myName2 = "  Rafiul Islam ";
        String output3 = myName2.trim();
        System.out.println(output3);

        String myStr2 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr2.lastIndexOf("planet"));

        String str12 = "Rafiul Islam_Refat";
        String[] splitted = str12.split("_");
        for(String n:splitted){
            System.out.println(n);
        }
    }
}
