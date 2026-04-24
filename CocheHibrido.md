# Coche Híbrido

## Implementación de la Clase CocheHíbrido

Partiendo de la clase `CocheCombustion`, se puede implementar un coche híbrido añadiendo funcionalidad eléctrica.

### Nuevos Atributos

- `capacidadBateria`: capacidad máxima de la batería en kWh
- `nivelBateria`: nivel actual de carga de la batería (0-100%)
- `modoElectrico`: indica si está funcionando en modo eléctrico
- `motorElectricoEncendido`: estado del motor eléctrico

### Interfaz Electrico

```java
package vehiculos;

public interface Electrico {
    void cargarBateria();
    void usarModoElectrico();
    double getNivelBateria();
}
```

### Métodos de la Interfaz Electrico

- `cargarBateria()`: incrementa el nivel de batería
- `usarModoElectrico()`: cambia al modo de funcionamiento eléctrico
- `getNivelBateria()`: devuelve el porcentaje de batería

### Implementación de CocheHíbrido

```java
public class CocheHibrido extends CocheCombustion implements Electrico {
    protected double capacidadBateria;
    protected double nivelBateria;
    protected boolean modoElectrico;
    protected boolean motorElectricoEncendido;

    public CocheHibrido(String color, int puertas, int ruedas, String modelo, 
                      String matricula, double combustible, double capacidadBateria) {
        super(color, puertas, ruedas, modelo, matricula, combustible);
        this.capacidadBateria = capacidadBateria;
        this.nivelBateria = capacidadBateria;
        this.modoElectrico = false;
        this.motorElectricoEncendido = false;
    }

    @Override
    public void cargarBateria() {
        nivelBateria = capacidadBateria;
        System.out.println("Bateria cargada al 100%");
    }

    @Override
    public void usarModoElectrico() {
        if (nivelBateria > 0) {
            modoElectrico = true;
            motorElectricoEncendido = true;
            System.out.println("Cambiado a modo electrico");
        } else {
            System.out.println("Bateria insuficiente para modo electrico");
        }
    }

    @Override
    public double getNivelBateria() {
        return nivelBateria;
    }

    @Override
    public void mover() {
        if (modoElectrico && motorElectricoEncendido) {
            if (nivelBateria >= 5) {
                nivelBateria -= 5;
                System.out.println("Moviendo en modo electrico. Bateria: " + nivelBateria + "%");
            } else {
                System.out.println("Bateria baja. Cambiando a combustible");
                modoElectrico = false;
                motorElectricoEncendido = false;
                super.mover();
            }
        } else {
            super.mover();
        }
    }
}
```

## Diagramas de Clases

### Diagrama Figuras
![Diagrama Figuras](./src/diagramas/figuras.excalidraw)

### Diagrama Vehículos
![Diagrama Vehículos](./src/diagramas/vehiculos.excalidraw)