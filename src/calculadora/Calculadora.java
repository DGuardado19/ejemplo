/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import GUI.Calcu;
import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class Calculadora {
//suma, resta,division, multiplicacion y binario

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame("calculadora");
        ventana.setContentPane(new Calcu());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.pack();
        ventana.setVisible(true);
    }

}
