# Actividades Abstracfaces

**Alumno:** Nichel Morales Hernandez  
**Curso:** 1 DAM  
**Instituto:** Salesianos

---

## Practica: Clases Abstractas e Interfaces

### Ejercicio 1 - Figuras Geometricas (Interfaz)

Se crea una interfaz `CalculoGeometrico` con metodos para calcular area y perimetro.
Las clases `Rectangulo` y `Circulo` implementan esta interfaz.

### Ejercicio 2 - Vehiculos (Clase Abstracta)

Se crea una clase abstracta `Vehiculo` con metodos abstractos.
La clase `CocheCombustion` extiende de `Vehiculo`.

---

## Estructura del Proyecto

```
src/
├── App.java                  (clase ejecutable principal)
├── figuras/
│   ├── CalculoGeometrico.java (interfaz para calculos 2D)
│   ├── Rectangulo.java        (figura rectangulo)
│   ├── Circulo.java          (figura circulo)
│   └── MainFiguras.java      (ejecutable figs)
├── vehiculos/
│   ├── Vehiculo.java         (clase abstracta)
│   ├── CocheCombustion.java  (coche de combustion)
│   └── MainVehiculos.java  (ejecutable vehiculos)
└── CocheHibrido.md         (documentacion)
```

## Como Ejecutar

```bash
javac src/figuras/*.java src/vehiculos/*.java src/*.java
java figuras.MainFiguras
java vehiculos.MainVehiculos
```