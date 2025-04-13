package one.aluracursos.condicionalesenjava.scanner;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero : ");
        int numero = scanner.nextInt();
        scanner.close();
        if(numero%2==0){
            System.out.println("El numero "+numero+ " Es par");
        }else{
            System.out.println("El numero "+numero+ " Es impar");
        }

    }
}
