/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class Calcu extends JPanel {

    public int WIDTH = 600, widhTF = 150, widthB = 80;
    public int HEIGHT = 300, heighTF = 30, heighB = 30;
    public JTextField entrada1, entrada2, salida, binario;
    public JButton suma, resta, division, multiplicacion, biry;

    public Calcu() {
        entrada1 = new JTextField();
        entrada1.setBounds(new Rectangle(50, 40, widhTF, heighTF));
        
        entrada2 = new JTextField();
        entrada2.setBounds(new Rectangle(225, 40, widhTF, heighTF));
        
        binario = new JTextField();
        binario.setBounds(new Rectangle(400, 40, widhTF, heighTF));
        
        salida = new JTextField();
        salida.setBounds(new Rectangle(235, 200, widhTF, heighTF));

        suma = new JButton("SUMA");
        suma.setBounds(new Rectangle(50, 115, widthB, heighB));
        
        resta = new JButton("RESTA");
        resta.setBounds(new Rectangle(150, 115, widthB, heighB));
        
        division = new JButton("DIVISION");
        division.setBounds(new Rectangle(275, 115, widthB, heighB));
        
        multiplicacion = new JButton("MULTIPLICACION");
        multiplicacion.setBounds(new Rectangle(375, 115, widthB, heighB));
        
        biry = new JButton("BINARIO");
        biry.setBounds(new Rectangle(475, 115, widthB, heighB));

        entrada1.setEditable(true);
        entrada2.setEditable(true);
        binario.setEditable(true);
        salida.setEditable(false);

        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                salida.setText(entrada2.getText());
            }
        });

        add(entrada1);
        add(entrada2);
        add(binario);
        add(salida);
        add(multiplicacion);
        add(resta);
        add(suma);
        add(biry);
        add(division);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

    }
}
