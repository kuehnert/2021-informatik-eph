public class P14Operatoren {
    public static void booleans() {
        boolean a;
        boolean b;
        a = true; // true == wahr
        b = false; // false == unwahr / falsch
        System.out.println(a);
        System.out.println(b);

        if (true) {
            System.out.println("Ist immer wahr");
        }

        if (false) {
            System.out.println("Passiert nie");
        }
    }

    // binäre Operatoren, zwei Argumente
    public static void undOperator() {
        boolean a;
        boolean b;
        a = false; 
        b = false;

        if (a && b) { // logisches UND
            System.out.println("a ist wahr und b ist wahr");
        }
    }

    public static void oderOperator() {
        boolean a;
        boolean b;
        a = false; 
        b = false;

        if (a || b) { // logisches ODER
            System.out.println("entweder a ist wahr oder b ist wahr ");
            System.out.println("oder beide sind wahr");
        }
    }

    public static void exklusivesOderOperator() {
        boolean a;
        boolean b;
        a = false; 
        b = true;

        if (a ^ b) { // logisches EXKLUSIVES ODER
            System.out.println("entweder a ist wahr oder b ist wahr");
        }
    }

    public static void nichtOperator() {
        boolean a;
        a = false; 

        if (!a) { // logisches NICHT, Negierung, unären Operator
            System.out.println("a ist nicht wahr");
        }
    }
}
