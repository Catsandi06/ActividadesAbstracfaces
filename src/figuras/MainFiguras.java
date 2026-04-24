package figuras;

import java.util.Scanner;

public class MainFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);
        System.out.println("\n=== DATOS DEL RECTANGULO ===");
        System.out.println("Base: " + rectangulo.getBase());
        System.out.println("Altura: " + rectangulo.getAltura());
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());

        System.out.print("\nIngrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo(radio);
        System.out.println("\n=== DATOS DEL CIRCULO ===");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

        scanner.close();
    }
}