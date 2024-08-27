
package com.mycompany.password;

import java.util.Random;
import java.util.Scanner;

class Password {
    // Atributos
    private int longitud;
    private String contraseña;

    // Constructor por defecto
    public Password() {
        this.longitud = 8;
        this.contraseña = generarPassword();
    }

    // Constructor con longitud especificada
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword();
    }

    // Método que genera la contraseña aleatoria
    public String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < this.longitud; i++) {
            password.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        
        this.contraseña = password.toString();
        return this.contraseña;
    }

    // Método para verificar si la contraseña es fuerte
    public boolean esFuerte() {
        int countMayusculas = 0;
        int countMinusculas = 0;
        int countNumeros = 0;

        for (int i = 0; i < this.contraseña.length(); i++) {
            char c = this.contraseña.charAt(i);
            if (Character.isUpperCase(c)) countMayusculas++;
            if (Character.isLowerCase(c)) countMinusculas++;
            if (Character.isDigit(c)) countNumeros++;
        }

        return (countMayusculas > 2 && countMinusculas > 1 && countNumeros > 5);
    }

    // Métodos get
    public String getContraseña() {
        return this.contraseña;
    }

    public int getLongitud() {
        return this.longitud;
    }

    // Métodos set
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(); // Genera una nueva contraseña al cambiar la longitud
    }
}


    
