/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructurasdedatos;

/**
 *
 * @author Melvin Prendas
 */
public class NodoPila {
    private Residuo residuo;
    private NodoPila previo;

    public NodoPila(Residuo residuo, NodoPila previo) {
        this.residuo = residuo;
        this.previo = previo;
    }

    public Residuo getResiduo() {
        return residuo;
    }

    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    public NodoPila getPrevio() {
        return previo;
    }

    public void setPrevio(NodoPila previo) {
        this.previo = previo;
    }
    
}
