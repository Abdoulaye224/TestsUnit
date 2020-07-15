package main;

public class app {

    public static void main(String[] args){

        Calculatrice calc = new Calculatrice();

        System.out.println("je fais un test");

        System.out.println(calc.add(2, 2));
        System.out.println(calc.sous(8, 4));
        System.out.println(calc.mul(3, 2));
        System.out.println(calc.div(16, 4));

    }
}
