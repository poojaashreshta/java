public class Classcastexception {
    public static void main(String[] args) {
        Object obj = new String("Hello");
 
        if (obj instanceof Integer) {
            System.out.println((Integer) obj);
        } else {
            System.out.println(obj);
        }
    }
}