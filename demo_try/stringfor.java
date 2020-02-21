public class stringfor {
    public static void main(String[] args) {
        String[] a = {"zxr", "yjh"};
        for(String b : a) {
            b = b + "a";
            System.out.println(a[0] + a[1]);
        }
    }
}