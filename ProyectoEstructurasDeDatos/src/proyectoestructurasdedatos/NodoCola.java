/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdedatos;

/**
 *
 * @author Melvin Prendas
 */
public class NodoCola {
    private Residuo residuo;
    private NodoCola next;

    public NodoCola() {
    }

    public NodoCola(Residuo residuo, NodoCola next) {
        this.residuo = residuo;
        this.next = next;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public NodoCola getNext() {
        return next;
    }

    public void setNext(NodoCola next) {
        this.next = next;
    }

}
