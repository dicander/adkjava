public class EvilInts {
    public static void compare(Integer a, Integer b) {
        System.out.println(a + " == " + b + " : " + (a==b));
        System.out.println(a + ".equals("+b+") : " + a.equals(b));
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        compare(a,b);
        a = 127;
        b = 127;
        compare(a,b);
        a = -128;
        b = -128;
        compare(a,b);
        a = -129;
        b = -129;
        compare(a,b);
        a = 1048576;
        b = 1048576;
        System.out.println("Created the same number");
        compare(a,b);
        a = 1048575;
        System.out.println(a + " is printed to prevent compiler from optimizing");
        a+=1;
        System.out.println("Incremented to match");
        compare(a,b);
        a=b;
        System.out.println("Created by assignment:");
        compare(a,b);
    }
}
