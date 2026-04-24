package vehiculos;

public class MainVehiculos {
    public static void main(String[] args) {
        CocheCombustion coche = new CocheCombustion("Rojo", 5, 4, "Toyota Corolla", "1234ABC", 20);

        System.out.println("=== COCHE DE COMBUSTION ===");
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Matricula: " + coche.getMatricula());
        System.out.println("Color: " + coche.getColor());
        System.out.println("Puertas: " + coche.getNumeroPuertas());
        System.out.println("Ruedas: " + coche.getNumeroRuedas());
        System.out.println("Combustible inicial: " + coche.getLitrosCombustible() + " litros");

        System.out.println("\n--- Intentando mover sin arrancar ---");
        coche.mover();

        System.out.println("\n--- Arrancando motor ---");
        coche.arrancar();

        System.out.println("\n--- Moviendo coche ---");
        coche.mover();
        coche.mover();
        coche.mover();

        System.out.println("\n--- Combustible restante ---");
        System.out.println("Combustible: " + coche.getLitrosCombustible() + " litros");

        System.out.println("\n--- Modificando combustible a 2 litros ---");
        coche.setLitrosCombustible(2);

        System.out.println("\n--- Intentando mover 3 veces ---");
        coche.mover();
        coche.mover();
        coche.mover();
    }
}