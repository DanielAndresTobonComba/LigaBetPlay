package com.ligabetplay.Utilidades;

import java.util.Scanner;

public class CheckString {

    private CheckString() {}

    public static String check(String msj) {
        
        boolean introPermise = true;
        String usuarioEntrada = "";
        Scanner scanner = new Scanner(System.in);


        while (introPermise == true) {
            usuarioEntrada = scanner.nextLine();
            if ("".equals(usuarioEntrada.trim())) {
                System.out.println("\n********************************");
                System.out.println("No se permiten entradas vacías ");
                System.out.println("********************************\n");
                System.out.println("\n. . . . . . . . . . . . . . . .");
                System.out.println(String.format(" %s", msj));
                System.out.println(". . . . . . . . . . . . . . . .");
                System.out.print(">>> ");
            } else {
                introPermise = false;
            }
                  
        }
        return usuarioEntrada;
    }
}

