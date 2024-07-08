/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdedatos;

/**
 *
 * @author Melvin Prendas
 */
public class ColaResiduos {
    private NodoCola front;
    private NodoCola rear;

    public ColaResiduos() {
        this.front = null;
        this.rear = null;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
}
