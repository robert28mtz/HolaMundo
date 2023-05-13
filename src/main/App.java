/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author rodas-pc
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el color de la manzada: ");
        String color = s.nextLine();

        /*
        if (color.equals("R")) {
        System.out.println("Su color es rojo");
        } else {
        System.out.println("El color no es encontrado");
        }
        if (color.equals("V")) {
        System.out.println("Su color es Verde");
        } else {
        System.out.println("El color no es encontrado");
        }
        if (color.equals("A")) {
        System.out.println("Su color es Amarillo");
        } else {
        System.out.println("El color no es encontrado");
        }
        if (color.equals("N")) {
        System.out.println("Su manzana ya no sirve");
        } else {
        System.out.println("El color no es encontrado");
        }
        
        color = color.toUpperCase();
        
        if (color.equals("R")) {
            System.out.println("Su color es rojo");
        } else if (color.equals("V")) {
            System.out.println("Su color es Verde");
        } else if (color.equals("A")) {
            System.out.println("Su color es Amarillo");
        } else if (color.equals("N")) {
            System.out.println("Su manzana ya no sirve");
        } else {
            System.out.println("El color no es encontrado");
        }
        
        
        if (color.equals("R") || color.equals("r")) {
            System.out.println("Su color es rojo");
        } else if (color.equals("V") || color.equals("v")) {
            System.out.println("Su color es Verde");
        } else if (color.equalsIgnoreCase("A")) {
            System.out.println("Su color es Amarillo");
        } else if (color.equals("N")) {
            System.out.println("Su manzana ya no sirve");
        } else {
            System.out.println("El color no es encontrado");
        }
         */
        
        // color.toUpperCase()
        switch (color) {
            case "R":
            case "r":
                System.out.println("Su color es rojo");
                break;
            case "V":
                System.out.println("Su color es Verde");
                break;
            case "A":
                System.out.println("Su color es Amarillo");
                break;
            case "N":
                System.out.println("Su manzana ya no sirve");
                break;
            default:
                System.out.println("El color no es encontrado");
                break;
        }
    }

    private static void condicionIf() {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = s.nextInt();

        // ==, !=, >, <, >=, <=, !
        if (edad < 0) {
            System.out.println("Tu edad es incorrecta");
        } else if (edad < 12) {
            System.out.println("Eres un adolescente");
        } else if (edad < 25) {
            System.out.println("Eres un joven");
        } else if (edad < 40) {
            System.out.println("Eres adulto");
        } else if (edad < 60) {
            System.out.println("Eres una persona de edad mayor");
        }
    }

    private static void metodos() {
        String nombre = "Roberto";
        String apellido = "Rodas";

        //imprimir(apellido, nombre);
        //imprimir(nombre, apellido);
        //metodo2(nombre, 65);
        String nombreCompleto = metodo3(nombre, apellido, 25);
        System.out.println("nombreCompleto = " + nombreCompleto);

        int suma = suma(4, 5);
        System.out.println("suma = " + suma);
    }

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static String metodo3(String nombre, String apellio, int edad) {
        return "El nombre es: " + nombre + " " + apellio + ". Su edad: " + edad;
    }

    private static void metodo2(String texto, int numero) {
        System.out.println("Metodo 2");
        System.out.println("texto = " + texto);
        System.out.println("numero = " + numero);
    }

    private static void imprimir(String nombre, String apellido) {
        System.out.println("Metodo");

        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    private static void calculadoraMetodos() {
        Scanner s = new Scanner(System.in);

        // Suma
        int numeroDeConsola1 = ingresarNumero(s, "1");
        int numero2 = ingresarNumero(s, "2");
        
        System.out.println("numeroDeConsola1 = " + numeroDeConsola1);
        System.out.println("numero2 = " + numero2);

        System.out.println("resultado = " + operacion('-', numeroDeConsola1, numero2));
//        // resta
//        numeroDeConsola1 = ingresarNumero(s, "1");
//        numero2 = ingresarNumero(s, "2");

//        System.out.println("resultado = " + operacion('-', numeroDeConsola1, numero2));
//        // multiplicacion
//        numeroDeConsola1 = ingresarNumero(s, "1");
//        numero2 = ingresarNumero(s, "2");
//
//        System.out.println("resultado = " + operacion('*', numeroDeConsola1, numero2));
//        // division
//        numeroDeConsola1 = ingresarNumero(s, "1");
//        numero2 = ingresarNumero(s, "2");
//
//        System.out.println("resultado = " + operacion('/', numeroDeConsola1, numero2));
    }

    private static int ingresarNumero(Scanner s, String tipo) {
        System.out.print("Ingrese el numero " + tipo + " : ");
        return s.nextInt();
    }

    private static int operacion(char op, int numero1, int numero2) {
        if (op == '+') {
            return numero1 + numero2;
        } else if (op == '-') {
            return numero1 - numero2;
        } else if (op == '*') {
            return numero1 * numero2;
        } else if (op == '/') {
            if (numero2 != 0) {
                return numero1 / numero2;
            } else {
                System.out.println("NO se puede dividir");
            }
        }

        return 0;
    }

    private static void calculadoraSimple() {
        Scanner s = new Scanner(System.in);

        // Suma
        System.out.print("Ingrese el numero 1: ");
        int numero1 = s.nextInt();
        System.out.print("Ingrese el numero 2: ");
        int numero2 = s.nextInt();

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        int resultado = numero1 + numero2;
        System.out.println("resultado = " + resultado);

        // Resta
        System.out.print("Ingrese el numero 1: ");
        numero1 = s.nextInt();
        System.out.print("Ingrese el numero 2: ");
        numero2 = s.nextInt();

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        resultado = numero1 - numero2;
        System.out.println("resultado = " + resultado);

        // Multiplicacion
        System.out.print("Ingrese el numero 1: ");
        numero1 = s.nextInt();
        System.out.print("Ingrese el numero 2: ");
        numero2 = s.nextInt();

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        resultado = numero1 * numero2;
        System.out.println("resultado = " + resultado);

        // Division
        System.out.print("Ingrese el numero 1: ");
        numero1 = s.nextInt();
        System.out.print("Ingrese el numero 2: ");
        numero2 = s.nextInt();

        System.out.println("Numero1: " + numero1);
        System.out.println("Numero2: " + numero2);

        if (numero2 != 0) {
            resultado = numero1 / numero2;
            System.out.println("resultado = " + resultado);
        } else {
            System.out.println("No se puede dividir ");
        }
    }

    private static void variables() {
        int numero1 = 10;
        Integer numero1Clase = 11;

        float numero2 = 25.3f;
        Float numero2Clase = 30.7f;

        double numero3 = 32.1;
        Double numero3Clase = 12.0;

        char caracter = 'A';
        Character c = 'F';

        String cadena = "Hola";

        boolean condicion = false;
        Boolean condicionClase = true;

        System.out.println("numero1 = " + numero1);
        numero1 = 198;
        System.out.println("numero1 = " + numero1);
        System.out.println("numero1Clase = " + numero1Clase);

        System.out.println("numero2 = " + numero2);
        System.out.println("numero2Clase = " + numero2Clase);

        System.out.println("numero3 = " + numero3);
        System.out.println("numero3Clase = " + numero3Clase);

        System.out.println("caracter = " + caracter);
        System.out.println("c = " + c);

        System.out.println("cadena = " + cadena);
        cadena = "HolaMundo";
        System.out.println("cadena = " + cadena);

        System.out.println("condicion = " + condicion);
        System.out.println("condicionClase = " + condicionClase);
    }

}
