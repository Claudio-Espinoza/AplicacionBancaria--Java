package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroPanel extends JPanel implements ActionListener {
    private JFrame ventana;

    private JLabel pimaryNameText;
    private JTextField pimaryNameEnter;

    private JLabel secondNameText;
    private JTextField secondNameEnter;

    private JLabel paternNameText;
    private JTextField paternNameEnter;

    private JLabel matherNameText;
    private JTextField matherNameEnter;

    private JLabel rutText;
    private JTextField rutEnter;

    private JLabel pinText;
    private JTextField pinEnter;

    private JLabel telefonoText;
    private JTextField telefonoEnter;

    private JLabel mailText;
    private JTextField mailEnter;

    private JButton toRegister;

    public RegistroPanel(Ventana ventana) {
        this.ventana=ventana;
        setBackground(Color.red);
        ejecutarAtributos();
    }

    public void ejecutarAtributos(){
        //Ingreso de usuario (Rut, pin, nombre, corre, telefono)
        this.pimaryNameText= new JLabel("Primer nombre");
        this.pimaryNameEnter=new JTextField(16);
        this.add(pimaryNameText);
        this.add(pimaryNameEnter);

        this.secondNameText= new JLabel("Segundo nombre");
        this.secondNameEnter=new JTextField(16);
        this.add(secondNameText);
        this.add(secondNameEnter);

        this.paternNameText= new JLabel("Apellido paterno");
        this.paternNameEnter=new JTextField(16);
        this.add(paternNameText);
        this.add(paternNameEnter);

        this.matherNameText= new JLabel("Apellido materno");
        this.matherNameEnter=new JTextField(16);
        this.add(matherNameText);
        this.add(matherNameText);

        this.rutText= new JLabel("Rut");
        this.rutEnter=new JTextField(8);
        this.add(rutText);
        this.add(rutEnter);

        this.pinText= new JLabel("Pin");
        this.pinEnter=new JTextField(16);
        this.add(pinText);
        this.add(pinEnter);

        this.mailText= new JLabel("Correo");
        this.mailEnter=new JTextField(16);
        this.add(mailText);
        this.add(mailEnter);

        this.telefonoText= new JLabel("Telefono");
        this.telefonoEnter=new JTextField(16);
        this.add(telefonoText);
        this.add(telefonoEnter);

        //Registro de Usuario (Nuevo usuario / registrar)
        this.toRegister = new JButton("Registrarme");
        this.toRegister.addActionListener(this);
        this.add(toRegister);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//-|Movimiento de panel|----------------------------------------------------------------------------------------------//
    if (e.getSource() == this.toRegister) {
            IngresoPanel volver = new IngresoPanel((Ventana) this.ventana);
            this.ventana.remove(this);
            this.ventana.add(volver);
            this.ventana.validate();
        }

//--------------------------------------------------------------------------------------------------------------------//



    }
}
