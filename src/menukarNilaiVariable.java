public class menukarNilaiVariable {
    public static void main(String[] args) {
        int a=2, b=3;
        System.out.println("Sebebelum");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Sesudah");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
