package UI;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(){
        IngresoPanel panelInicial=new IngresoPanel(this);
        this.add(panelInicial);

        setTitle("Banco movil");
        setSize(800, 550);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
