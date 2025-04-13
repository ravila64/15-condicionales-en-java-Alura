package one.aluracursos.condicionalesenjava.scanner;

import java.util.Scanner;

public class AprobacionAsignatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite asignatura  : ");
        String asignatura = scanner.nextLine();
        System.out.println("-----------------------");
        System.out.print("Digite nota 1 ->");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite nota 2 ->");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite nota 3 ->");
        double nota3 = scanner.nextDouble();
        double promedio = (nota1+nota2+nota3)/3.0;
        scanner.close();
        if(promedio>=7.0){
            System.out.println("Asignatura "+asignatura+ " APROBADA, con nota "+promedio);
        }else if(promedio>=5.0 && promedio<=6.9){
            System.out.println("Asignatura "+asignatura+ " EN RECUPERACION, con nota  "+promedio);
        }else{
            System.out.println("Asignatura "+asignatura+ " REPROBADA, con nota  "+promedio);
        }
    }
}
