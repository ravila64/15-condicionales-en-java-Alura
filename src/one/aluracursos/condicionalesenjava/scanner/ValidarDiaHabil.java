package one.aluracursos.condicionalesenjava.scanner;

import java.util.Scanner;

public class ValidarDiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un dia de la semana, en letras : ");
        String diaSemana = scanner.nextLine();
        diaSemana = diaSemana.toLowerCase();
        if (!diaSemana.contains("lunes") && !diaSemana.contains("martes") &&
                !diaSemana.contains("miercoles") && !diaSemana.contains("jueves") &&
                !diaSemana.contains("viernes")) {
            System.out.println("El dia "+diaSemana+" NO es habil");
        }else{
            System.out.println("El dia "+diaSemana+" Es habil");
        }
        scanner.close();
    }
}
