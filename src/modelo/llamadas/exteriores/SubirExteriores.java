package modelo.llamadas.exteriores;

import modelo.llamadas.Llamadas;
import modelo.llamadas.Subir;

import java.util.HashMap;
import java.util.LinkedList;

public class SubirExteriores extends Subir  {

    private LlamadaExtNormal llamadaExtNormal;
    private Vip vip;
    private Inhibida inhibida;

    public SubirExteriores() {

        this.llamadaExtNormal = new LlamadaExtNormal();
        this.inhibida = new Inhibida();
        this.vip = new Vip();
    }

    public void llenarLlamadas(LinkedList<LinkedList<Integer>> llamadas) {

        this.llamadaExtNormal.llenar(llamadas.getFirst());
        this.inhibida.llenar(llamadas.get(1));
        this.vip.llenar(llamadas.getLast());

        this.put("Inhibida", this.inhibida);
        this.put("Vip", this.vip);
        this.put("Pasajero", this.llamadaExtNormal);
    }

    public HashMap<String, Llamadas> getSubir() {

        return this;
    }
}
