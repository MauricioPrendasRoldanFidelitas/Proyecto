/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdedatos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProductoReciclado {
    private static int contador = 0; // Para generar identificadores únicos

    private int id;
    private String descripcion;
    private String materialBase;
    private String numeroLote;
    private String fechaProduccion;

    // Constructor que toma un residuo como parámetro y genera un producto reciclado
    public ProductoReciclado(Residuo residuo) {
        this.id = ++contador;
        this.descripcion = generarDescripcion(residuo);
        this.materialBase = residuo.getTipo();
        this.numeroLote = generarNumeroLote();
        this.fechaProduccion = generarFechaProduccion();
    }

    // Métodos para generar descripción, número de lote y fecha de producción
    private String generarDescripcion(Residuo residuo) {
        return "Producto reciclado de " + residuo.getNombre();
    }

    private String generarNumeroLote() {
        return "Lote-" + (int)(Math.random() * 10000);
    }

    private String generarFechaProduccion() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fechaActual.format(formatter);
    }

    // Getters y setters (si es necesario)
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMaterialBase() {
        return materialBase;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public String getFechaProduccion() {
        return fechaProduccion;
    }

    @Override
    public String toString() {
        return "ProductoReciclado{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", materialBase='" + materialBase + '\'' +
                ", numeroLote='" + numeroLote + '\'' +
                ", fechaProduccion='" + fechaProduccion + '\'' +
                '}';
    }
}
