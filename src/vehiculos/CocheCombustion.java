package vehiculos;

public class CocheCombustion extends Vehiculo {
    protected boolean motorEncendido;
    protected double litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas, int numeroRuedas, String modelo, String matricula, double litrosCombustible) {
        super(color, numeroPuertas, numeroRuedas, modelo, matricula);
        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public double getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(double litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {
        if (litrosCombustible < 1) {
            System.out.println("No se puede arrancar: combustible insuficiente.");
        } else {
            litrosCombustible -= 1;
            motorEncendido = true;
            System.out.println("Motor arrancado. Se consumio 1 litro de combustible.");
        }
    }

    @Override
    public void pararMotor() {
        motorEncendido = false;
        System.out.println("Motor parado.");
    }

    @Override
    public void mover() {
        if (!motorEncendido) {
            System.out.println("No se puede mover: el motor no esta arrancado.");
            return;
        }
        if (litrosCombustible < 1) {
            System.out.println("No se puede mover: combustible insuficiente. El motor se parado.");
            motorEncendido = false;
            return;
        }
        litrosCombustible -= 1;
        System.out.println("El coche se esta moviendo. Se consumio 1 litro de combustible.");
    }
}