/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class error_int extends JPanel {
    private Font font = new Font("times", Font.ITALIC+Font.BOLD, 20);
    JLabel errorT;
 
    public error_int() {
        errorT = new JLabel("CAMPO ENTERO!"); 
        errorT.setFont(font);  
        add(errorT);
    }
}
