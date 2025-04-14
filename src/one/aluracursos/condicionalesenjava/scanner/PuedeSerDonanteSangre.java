package one.aluracursos.condicionalesenjava.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PuedeSerDonanteSangre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad del donante:  ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese peso del donante (en KG) :  ");
        int peso = scanner.nextInt();
        boolean validaEdad = edad >=18 && edad<=65;
        boolean validaPeso = peso>50;
        if( validaEdad && validaPeso ){
            System.out.println("El donante es compatible, puede donar sangre");
        }else{
            System.out.println("El donante no es compatible.");
            System.out.println("Motivo:");
            if(!validaEdad){
                System.out.println("Debe tener entre 18 y 65 años");
            }
            if(!validaPeso){
                System.out.println("El peso debe ser mayor a 50 Kg.");
            }
        }
        scanner.close();
    }
}
