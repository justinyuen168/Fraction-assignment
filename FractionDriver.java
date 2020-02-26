public class FractionDriver {
    public static void main (String[] args) {
        Fraction f1 = new Fraction();
        Fraction f12 = new Fraction();
        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction("3,4");
        Fraction f4 = f2;
        int x = f1.getNum();
        int x2 = f2.getNum();
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        Fraction prod;
        prod = Fraction.multiply(f3,f4);
        System.out.println(prod);

        System.out.println("Testing arithmetic methods");

        System.out.println( f3 + " + " + f4 + " = " + Fraction.add(f3, f4) );
        System.out.println( f3 + " - " + f4 + " = " + Fraction.subtract(f3, f4) );
        System.out.println( f3 + " x " + f4 + " = " + Fraction.multiply(f3, f4) );
        System.out.println( f3 + " ÷ " + f4 + " = " + Fraction.divide(f3, f4) );

        System.out.println("Testing denominator zero fails...\n");

        Fraction f5 = new Fraction(1,0);
        Fraction f6 = new Fraction("1/0");
        Fraction f7 = new Fraction("0/1");

        System.out.println( f4 + " ÷ " + f7 + " = " + Fraction.divide(f4, f7) );

        System.out.println("\nTesting addtional concerns...\n");

        Fraction f8 = new Fraction("-1/-2");
        System.out.println( f4 + " + " + f8 + " = " + Fraction.add(f4, f8) );

    }
}
