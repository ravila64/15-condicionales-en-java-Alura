package one.aluracursos.condicionalesenjava.scanner;

import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        if(num1==num2){
            System.out.println("Numeros Iguales");
        }else if(num1>num2){
            System.out.println("Numero "+num1+" Es MAYOR a numero "+num2);
        }else{
            System.out.println("Numero "+num1+" Es MENOR a numero "+num2);
        }
        scanner.close();
    }
}
