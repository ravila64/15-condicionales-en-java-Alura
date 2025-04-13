package one.aluracursos.condicionalesenjava.scanner;

import java.util.Scanner;

public class DescuentoEnCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor compra : ");
        double valorCompra = scanner.nextDouble();
        double descuento = 0;
        if(valorCompra >= 100){
            descuento = valorCompra * 0.10;
            System.out.println("Valor descuento "+descuento);
            valorCompra -= descuento;
            System.out.println("Valor compra con descuento del 10% :"+valorCompra);
        }else{
            System.out.println("Valor compra "+valorCompra+" no tiene descuento");
        }
    }
}
