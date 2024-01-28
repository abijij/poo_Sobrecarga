package org.abijij.poosobrecarga;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int sumar(int... argumentos){
            int toal = 0;
            for (int i: argumentos){
                toal += i;
            }
            return toal;
    }

    public static float sumar(float a,int... argumentos){
        float toal = a;
        for (int i: argumentos){
            toal += i;
        }
        return toal;
    }

    public  static double sumar(double... Varargs){
        double total = 0.0;
        for(double d : Varargs){
            total += d;
        }
        return total;
    }


    public static float sumar(float a, float b){
        return a+b;
    }

    public  static float sumar(int a, float b){
        return a+b;
    }

    public static float sumar( float b, int a){
        return b + a;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public  static int sumar(String a, String b){
        int resultado;
        try {
              resultado=Integer.parseInt(a) + Integer.parseInt(b);

        }catch (NumberFormatException e) {
            resultado= 0;
        }
        return resultado;
    }

    public static int sumar( int a, int b, int c){
        return a + b + c;
    }

}
