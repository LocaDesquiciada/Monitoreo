package vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.LinkedList;

public class VistaGrilla extends GridPane {

    private VistaConfiguracion vistaConfiguracion;

    public VistaGrilla() {

        this.vistaConfiguracion = new VistaConfiguracion();
    }

    private void setearColumnas(LinkedList<VistaAscensor> vistaAscensor) {

        int i = 1;
        for (VistaAscensor vista : vistaAscensor) {

            vista.dibujarAscensor();
            Label LAscensor = new Label("Ascensor " + Integer.toString(i));
            LAscensor.setAlignment(Pos.CENTER);
            super.add(LAscensor, i, 0);
            super.add(vista, i, 1);
            i++;
        }

        this.vistaConfiguracion.llenar(i);
        super.add(this.vistaConfiguracion, 6,1);
    }

    private void setearLabels() {

        Label LES = new Label("LE Subir");
        super.add(LES, 0,0);

        Label configAscensores = new Label("Configuración y eventos de ascensores");
        super.add(configAscensores, 6, 0);

        Label LEB = new Label("LE Bajar");
        super.add(LEB, 5,0);
    }

    private void propGrilla() {

        super.setAlignment(Pos.CENTER);
        super.setHgap(10);
        super.setVgap(5);
    }

    public void dibujarGrilla(LinkedList<VistaAscensor> vistaAscensorR) {

        LinkedList<VistaAscensor> vistaAscensor = vistaAscensorR;

        propGrilla();
        setearLabels();
        setearColumnas(vistaAscensor);
    }
}
