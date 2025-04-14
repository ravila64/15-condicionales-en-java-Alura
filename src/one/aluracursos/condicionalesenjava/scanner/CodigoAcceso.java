package one.aluracursos.condicionalesenjava.scanner;

import java.io.Console;
import java.util.Scanner;

public class CodigoAcceso {
    public static void main(String[] args) {
        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        char[] password = console.readPassword("Ingrese codigo de acceso: ");
        boolean validaCodigo =String.valueOf(password).equals("2023");
        System.out.print("Ingrese el nivel de permiso [1..3]: ");
        int nivel = scanner.nextInt();
        boolean validaNivel = (nivel >=1 && nivel <=3);
        scanner.close();
        if (validaCodigo && validaNivel){
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        }else{
            System.out.println("Acceso denegado !!!");
            if(!validaCodigo){
                System.out.println("Codigo de acceso invalido");
            }
            if(!validaNivel){
                System.out.println("Nivel de acceso invalido");
            }
        }
    }
}
