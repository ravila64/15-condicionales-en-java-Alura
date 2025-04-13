package one.aluracursos.condicionalesenjava.scanner;
import java.util.Scanner;

public class CapturaPantalla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero : ");
        int numero = scanner.nextInt();
        scanner.close();
        if(numero>=0 && numero<=100){
            System.out.println("El numero "+numero+ " Esta entre 0 y 100 ");
        }
        String a = "Java";
        String b = "Java";
        if(a.equals(b)) {
            System.out.println("La cadena [a] "+a+" es igual con cadena [b] "+b);
        }
    }
}
