package org.abijij.poosobrecarga;
import static  org.abijij.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(1,5));
        System.out.println("Sumar float: " + sumar(10.0f,5f));
        System.out.println("Sumar float=int: " + sumar(10f, 5));
        System.out.println("Sumar int-float: " + sumar(10, 5f));
        System.out.println("Sumar double: " + sumar(10D, 5D));
        System.out.println("Sumar String: " + sumar("10","5"));
        System.out.println("Sumar tres int: " + sumar(10,5,3));
        System.out.println("Sumar cuatro int: " + sumar(10,5,3, 7));
        System.out.println("Sumar  cinco int: " + sumar(10,5,3,7,22));
        System.out.println("Sumar float + n int: " + sumar(10.5F,3,4,5,67,7));
        System.out.println("Sumar tres double: " + sumar(1.2,22.3,44.6));

        System.out.println("Sumar long: " + sumar(10L,5L));
        System.out.println("Sumar char: " + sumar(10, '@'));
        System.out.println("Sumar float-int: "+ sumar(10f,'@'));
    }
}
