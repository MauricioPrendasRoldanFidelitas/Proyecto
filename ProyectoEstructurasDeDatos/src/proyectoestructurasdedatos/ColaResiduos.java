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
    public void enqueue(NodoCola node) {
        if(this.isEmpty()){
            this.front = node;
            this.rear = node;
        } else {
            this.rear.setNext(node);
            this.rear = node;
        }
    }
    public NodoCola dequeue(){
        if(this.isEmpty()){
            return null;
        } else {
            NodoCola temp = this.front;
            this.front = this.front.getNext();
            if(this.front == null) {
                this.rear = null;
            }
            return temp;
        }
    }
    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "Cola vacia";
        } else {
            StringBuilder sb = new StringBuilder();
            NodoCola current = this.front;
            while(current != null) {
                sb.append(current.toString());
                current = current.getNext();
            } 
            return sb.toString();
        }
    }
}
