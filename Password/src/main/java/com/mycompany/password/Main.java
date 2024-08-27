package com.mycompany.password;


import java.util.Scanner;


public class Main {
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño del array de Passwords
        System.out.print("Introduce el tamaño del array de Passwords: ");
        int tamañoArray = scanner.nextInt();

        // Solicitar longitud de las contraseñas
        System.out.print("Introduce la longitud de los Passwords: ");
        int longitudPasswords = scanner.nextInt();

        // Crear array de Passwords
        Password[] passwordsArray = new Password[tamañoArray];
        boolean[] esFuerteArray = new boolean[tamañoArray];

        // Crear objetos Password y verificar si son fuertes
        for (int i = 0; i < tamañoArray; i++) {
            passwordsArray[i] = new Password(longitudPasswords);
            esFuerteArray[i] = passwordsArray[i].esFuerte();
        }

        // Mostrar contraseñas y si son fuertes
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(passwordsArray[i].getContraseña() + " " + esFuerteArray[i]);
        }

        scanner.close();
    }
}