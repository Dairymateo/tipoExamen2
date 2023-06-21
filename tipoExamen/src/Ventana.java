import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Ventana extends JFrame {

    public JPanel panel;
    public JLabel saludo; //panel
    public JLabel saludo2;

    public java.lang.System System;
    private JLabel etiqueta, etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;
    private JTextField texto;
    private JTextField cajaTexto;

    public Ventana() {
        /*this.setSize(500, 500);
        setLocation(100, 200);*/
        setTitle("Tienda del barrio");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(1920, 1080));
        //this.getContentPane().setBackground(Color.gray);
        addpanel();
        iniciarComponentes();
        colocarBotones();
        colocarCajaDeTexto();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void addpanel() {
        panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void iniciarComponentes() {

        JLabel etiqueta = new JLabel();
        etiqueta.setText("Bienvenido a tienda de barrio");
        etiqueta.setBounds(10, 10, 200, 30);
        panel.add(etiqueta);

        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Opciones");
        etiqueta1.setBounds(20, 30, 200, 30);
        panel.add(etiqueta1);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("1. Listar los Productos de la tienda");
        etiqueta2.setBounds(30, 50, 200, 30);
        panel.add(etiqueta2);

        JLabel etiqueta3 = new JLabel();
        etiqueta3.setText("2. Vender un producto");
        etiqueta3.setBounds(30, 70, 200, 30);
        panel.add(etiqueta3);

        JLabel etiqueta4 = new JLabel();
        etiqueta4.setText("3. Abastecer un producto");
        etiqueta4.setBounds(30, 90, 200, 30);
        panel.add(etiqueta4);

        JLabel etiqueta5 = new JLabel();
        etiqueta5.setText("4. Cambiar un producto");
        etiqueta5.setBounds(30, 110, 200, 30);
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel();
        etiqueta6.setText("5. mas opciones");
        etiqueta6.setBounds(30, 130, 200, 30);
        panel.add(etiqueta6);


    }

    private void colocarCajaDeTexto() {
        cajaTexto = new JTextField();
        cajaTexto.setBounds(50, 170, 100, 30);
        panel.add(cajaTexto);

    }


    private void colocarBotones() {
        JButton boton1 = new JButton();
        boton1.setText("Ingresar");
        boton1.setBounds(300, 400, 100, 40);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        panel.add(boton1);

        saludo = new JLabel();
        saludo.setBounds(50, 210, 1000, 40);
        saludo.setFont(new Font("arial", 2,10));
        panel.add(saludo);
        saludo2 = new JLabel();
        saludo2.setBounds(50, 230, 1000, 40);
        saludo.setFont(new Font("arial", 1,10));
        panel.add(saludo2);


        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda ti = new Tienda();
                String texto123 = cajaTexto.getText();
                int op = Integer.parseInt(texto123);
                switch (op){
                    case 1 :
                        saludo.setText("nombre: " +ti.darProducto1().darNombre()+" \n Tipo: "+ ti.darProducto1().darTipo()+"\n cantida: "+ ti.darProducto1().darCantidadBodega()+"\n unidades vendidas: "+ti.darProducto1().darCantidadUnidadesVendidas()+"\n precio: "+ ti.darProducto1().darValorUnitario());
                        System.out.println("Nombre: " +ti.darProducto1().darNombre()+" Tipo: "+ ti.darProducto1().darTipo()+" cantida: "+ ti.darProducto1().darCantidadBodega()+" unidades vendidas: "+ti.darProducto1().darCantidadUnidadesVendidas()+" precio: "+ ti.darProducto1().darValorUnitario());
                        saludo2.setText("nombre: " +ti.darProducto2().darNombre()+", Tipo: "+ ti.darProducto2().darTipo()+", cantida: "+ ti.darProducto2().darCantidadBodega()+", unidades vendidas: "+ti.darProducto2().darCantidadUnidadesVendidas()+"precio: "+ ti.darProducto2().darValorUnitario());

                }



            }




        };
        boton1.addActionListener(oyenteDeAccion);
    }
}












