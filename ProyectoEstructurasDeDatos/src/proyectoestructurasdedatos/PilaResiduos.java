/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdedatos;

/**
 *
 * @author Melvin Prendas
 */
public class PilaResiduos {
    private NodoPila top;
    int size;

    public PilaResiduos() {
        this.top = null;
        size = 0;
    }
    public void Push(Residuo r){
        NodoPila nodo = new NodoPila(r, this.top);
        this.top = nodo;
        this.size ++;
    }
    public boolean isEmpty() {
        return this.top == null;
    }
    public Residuo pop(){
    if(this.isEmpty()) {
            System.out.println("La Pila esta vacia. No se puede hacer pop.");
            return null;
        } else {
            Residuo r = this.top.getResiduo();
            this.top = this.top.getPrevio();
            this.size --;
            return r;
        }
    }
    public void print() {
        if(this.isEmpty()) {
            System.out.println("La Pila esta vacia.");
        } else {
            NodoPila actual = this.top;
            System.out.println("Contenido de la pila: \n");
            while(actual != null) {
                System.out.println(actual.getResiduo() + "\n");
                actual = actual.getPrevio();
            }
        }
    }
}


