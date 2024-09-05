/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class error extends JPanel {
    private Font font = new Font("times", Font.ITALIC+Font.BOLD, 20);
    JLabel errorT;
 
    public error() {
        errorT = new JLabel("TE FALTA UN CAMPO!"); 
        errorT.setFont(font); 
        add(errorT);
    }
}



