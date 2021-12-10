package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresoPanel extends JPanel implements ActionListener {
    private JLabel rutText;
    private JLabel pinText;
    private JLabel newUserText;

    private JTextField enterRut;
    private JTextField enterPin;

    private JButton getInUser;
    private JButton newUser;

    private JFrame ventana;

    public IngresoPanel(Ventana ventana) {
        this.ventana=ventana;
        ejecutarAtributos();
    }
    public void ejecutarAtributos(){
        //Ingreso de usuario (Rut, pin / entrar)
        this.rutText= new JLabel("Rut");
        this.enterRut=new JTextField(8);
        this.add(rutText);
        this.add(enterRut);

        this.pinText= new JLabel("Pin");
        this.enterPin=new JTextField(4);
        this.add(pinText);
        this.add(enterPin);

        this.getInUser = new JButton("Ingresar");
        this.getInUser.addActionListener(this);
        this.add(getInUser);

        //Registro de Usuario (Nuevo usuario / registrar)
        this.newUserText = new JLabel("Soy un nuevo usuario");
        this.add(newUserText);

        this.newUser = new JButton("Registrarme");
        this.newUser.addActionListener(this);
        this.add(newUser);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//-|Movimiento de panel|----------------------------------------------------------------------------------------------//
        if (e.getSource() == this.newUser) {
            RegistroPanel registroPanel = new RegistroPanel((Ventana) this.ventana);
            this.ventana.remove(this);
            this.ventana.add(registroPanel);
            this.ventana.validate();
        }
//--------------------------------------------------------------------------------------------------------------------//
        //Los datos siempre se ingresan en texto, tendras que hacer una funcion para convertirlo
        if (e.getSource() == getInUser){
            var pin = enterPin.getText();
            var rut = enterRut.getText();

            System.out.println(rut + " - " + pin) ;
        }



    }
}
