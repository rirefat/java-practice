public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World!");
        System.out.println(sb);

        String text = "121";
        StringBuffer sb2 = new StringBuffer(text);
        System.out.println(sb2);

        StringBuffer str1 = new StringBuffer("Rafiul Islam ");
        str1.append("Refat");
        System.out.println("Str1 after append: "+str1);

        StringBuffer dev = new StringBuffer("MERN Stack Development");
        dev.delete(0,6);
        System.out.println(dev);

        StringBuffer web = new StringBuffer("Full Stack Web Development");
        web.setLength(14);
        System.out.println(web);
    }
}
