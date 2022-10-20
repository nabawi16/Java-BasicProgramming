public class operator {
    public static void main(String[] args) {
        // assignment =
        int num;
        String name;

        num = 10;
        name = "ahmad nabawi";

        System.out.println(num);
        System.out.println(name);

        // assignment +=
        int num1 = 10, num2 = 5;
        num1 += num2;
        System.out.println(num1);

        // assignment -= /= %=
        int num3 = 10, num4 = 5;
        num3 -= num4;
        System.out.println(num3);

        // aritmethic +, -, /, *, %
        int a = 3, b = 4, c = 3;
        int d;
        d = (a + b) / c;
        System.out.println(d);

        // unary - !(not)
        int x = 5;
        boolean isActive = true;
        x = -x;
        System.out.println(x);
        System.out.println(!(isActive));

        // relational < > <= >= !=
        int var1 = 5, var2 = 3;
        System.out.println("var1 == var2: " + (var1 == var2));
        System.out.println("var1 < var2: " + (var1 < var2));

        // and or && ||
        boolean benar = true;
        boolean salah = false;
        System.out.println("benar dan benar: " + (benar && benar));
        System.out.println("salah atau benar: " + (salah || benar));
    }
}
