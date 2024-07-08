/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdedatos;

/**
 *
 * @author Melvin Prendas
 */
public class Residuo {
    private String nombre;
    private String tipo;

    public Residuo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Residuo{");
        sb.append("nombre=").append(nombre);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
    
}
