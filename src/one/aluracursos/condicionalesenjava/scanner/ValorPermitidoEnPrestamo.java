package one.aluracursos.condicionalesenjava.scanner;

import java.util.Scanner;

public class ValorPermitidoEnPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor prestamo : ");
        double prestamo = scanner.nextDouble();
        if(prestamo>=1000 && prestamo<=5000){
            System.out.println("El valor del prestamo "+prestamo+" Esta en rango permitido");
        }else{
            System.out.println("El valor del prestamo "+prestamo+" No esta en rango permitido");
        }
    }
}
