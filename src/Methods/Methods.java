package Methods;

import java.util.Scanner;

public class Methods {
    Scanner sc = new Scanner(System.in);
    public void Add(int a,int b, double c){
        c=a+b;
        System.out.println("ADD : "+c);
    }
    public void Substract(int a,int b,double c){
        c=a-b;
        System.out.println("SUBSTRACT : "+c);
    }
    public void Multiply(int a,int b, double c){
        c=a*c;
        System.out.println("MULTIPLY : "+c);
    }
    public void Divide(int a, int b,double c){
        c=a/b;
        System.out.println("DIVIDE : "+c);
    }
    public void sin(double a, double b, double c){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String sinChoice = sc.next();

        if (sinChoice.equals("a")) {
            a = Math.toRadians(a);
            c = Math.sin(a);
            System.out.println("SIN "+a+" : "+c);
        }

        if (sinChoice.equals("b")) {
            b = Math.toRadians(b);
            c = Math.sin(b);
            System.out.println("SIN "+b+" : "+c);
        }
    }
    public void cos(double a, double b, double c){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String cosChoice = sc.next();
        if (cosChoice.equals("a")) {
            a = Math.toRadians(a);
            c = Math.cos(a);
            System.out.println("COS "+a+" : "+c);
        }

        if (cosChoice.equals("b")) {
            b = Math.toRadians(b);
            c = Math.cos(b);
            System.out.println("COS "+b+" : "+c);
        }
    }
    public void tan(double a,double b, double c){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String tanChoice = sc.next();

        if (tanChoice.equals("a")) {
            a = Math.toRadians(a);
            c = Math.tan(a);
            System.out.println("TAN "+a+" : "+c);
        }

        if (tanChoice.equals("b")) {
            b = Math.toRadians(b);
            c = Math.tan(b);
            System.out.println("TAN "+b+" : "+c);
        }
    }
    public void sqrt(double a, double b, double c){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String sqrtChoice = sc.next();

        if (sqrtChoice.equals("a")){
            c = Math.sqrt(a);
            System.out.println("SQRT "+a+" : "+c);
        }
        if (sqrtChoice.equals("b")){
            c = Math.sqrt(b);
            System.out.println("SQRT "+b+" : "+c);
        }
    }
    public void power(int a, int b, double c){
        System.out.print("(a) "+ a + "^" + b + ", or (b) " + b + "^" + a + "? ");
        String powerChoice = sc.next();
        if (powerChoice.equals("a")){
            c = Math.pow(a, b);
            System.out.println(a+" ^ "+b+" : "+c);
        }
        if (powerChoice.equals("b")){
            c = Math.pow(b, a);
            System.out.println(b+" ^ "+a+" : "+c);
        }
    }
    public void mod(int a, int b, double c){
        System.out.print("(a) "+ a + "%" + b + ", or (b) " + b + "%" + a + "? ");
        String modSymbolChoice = sc.next();
        if (modSymbolChoice.equals("a")){
            c = a % b;
            System.out.println("MOD : "+c);
        }
        if (modSymbolChoice.equals("b")){
            c = b % a;
            System.out.println("MOD : "+c);
        }
    }

}

