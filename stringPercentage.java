public class stringPercentage {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';

        int count = 0;
        int len = s.length();
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == letter){
                count++;
            }
        }
        int output = (count*100)/len;
        System.out.println("Count: "+count);
        System.out.println("Length: "+len);
        System.out.println("Output: "+output);
    }
}
