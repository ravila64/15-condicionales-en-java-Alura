package one.aluracursos.condicionalesenjava.scanner;

import java.io.Console;
import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Console console = System.console();
        char[] password = console.readPassword("Ingrese la contraseña: ");
        if (String.valueOf(password).equals("123456")){
            System.out.println("Acceso permitido !!!");
        }else{
            System.out.println("Acceso denegado !!!");
        }
    }
}
