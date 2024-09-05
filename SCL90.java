/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class SCL90 extends JPanel implements ActionListener{
    private Font font = new Font("serif", Font.ITALIC+Font.BOLD, 12);
    private Font font2 = new Font("serif", Font.ITALIC+Font.BOLD, 12);

    JLabel nombre, apeP, apeM, edad, mes, dia, aa, dir, sexo, ocu, tel, mail, fecha_nac, temp;
    JTextField c_nombre, c_apeP, c_apeM, c_edad, c_mes, c_dia, c_aa, c_dir, c_sexo, c_ocu;
    JTextField c_tel, c_mail;
    JPanel checkPanel, NombrePanel, EdadPanel, SexoPanel, DirPanel, ResultPanel;
    JButton result; 
    JPanel Todas = new JPanel();
    
    GridBagLayout gridbag = new GridBagLayout(); 
    GridBagLayout Nombre = new GridBagLayout(); 
    GridBagLayout Edad = new GridBagLayout(); 
    GridBagLayout Dir = new GridBagLayout(); 
    GridBagLayout Sexo = new GridBagLayout(); 
    GridBagLayout Result = new GridBagLayout(); 

    void addResult( Component comp,int gridx,int gridy,
        int gridw,int gridh ) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridw;
        gbc.gridheight = gridh;
        Result.setConstraints( comp,gbc );
        ResultPanel.add( comp );
    }
 
       void addNombre( Component comp,int gridx,int gridy, int gridw,int gridh ) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridw;
        gbc.gridheight = gridh;
        Nombre.setConstraints( comp,gbc );
        NombrePanel.add( comp );
    }
       
       void addSexo( Component comp,int gridx,int gridy,
        int gridw,int gridh ) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridw;
        gbc.gridheight = gridh;
        Sexo.setConstraints( comp,gbc );
        SexoPanel.add( comp );
    }
  
       void addEdad( Component comp,int gridx,int gridy,
        int gridw,int gridh ) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridw;
        gbc.gridheight = gridh;
        Edad.setConstraints( comp,gbc );
        EdadPanel.add( comp );
    }

    void addDir( Component comp,int gridx,int gridy,
        int gridw,int gridh ) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridw;
        gbc.gridheight = gridh;
        Dir.setConstraints( comp,gbc );
        DirPanel.add( comp );
    }
   
    public SCL90() {
        NombrePanel = new JPanel(Nombre);
        nombre = new JLabel("Nombre: "); 
		nombre.setFont(font2);
        apeP = new JLabel("  Apellido Paterno: ");
		apeP.setFont(font2);
        apeM = new JLabel("  Apellido Materno: ");
		apeM.setFont(font2);
        c_nombre = new JTextField(12);
        c_apeP = new JTextField(12);
        c_apeM = new JTextField(12);

	
        addNombre(nombre,  0, 0, 1, 1);
        addNombre(c_nombre,1, 0, 1, 1);
        addNombre(apeP,    2, 0, 1, 1);
        addNombre(c_apeP,  3, 0, 1, 1);
        addNombre(apeM,    4, 0, 1, 1);
        addNombre(c_apeM,  5, 0, 1, 1);
//--------------------------------------------	
	EdadPanel = new JPanel(Edad);
	
        edad = new JLabel("Edad (years): ", 0);
	edad.setFont(font2);
        mes = new JLabel("  Fecha de Nacimiento,  Mes (mm): ", 0);
	mes.setFont(font2);
        dia = new JLabel("  Dia (dd): ", 0);
	dia.setFont(font2);
        aa = new JLabel("  Year (aa): ", 0); 
	aa.setFont(font2);
        c_edad = new JTextField(3);
        c_mes = new JTextField(3);
        c_dia = new JTextField(3);
        c_aa = new JTextField(3);

        addEdad(edad,  0, 0, 1, 1);
        addEdad(c_edad,1, 0, 1, 1);
        addEdad(mes,   2, 0, 1, 1);
        addEdad(c_mes, 3, 0, 1, 1);
        addEdad(dia,   4, 0, 1, 1);
        addEdad(c_dia, 5, 0, 1, 1);
        addEdad(aa,    6, 0, 1, 1);
        addEdad(c_aa,  7, 0, 1, 1);
//------------------------------------------------	
	DirPanel = new JPanel(Dir);
	
        dir = new JLabel("Direccion: ", 0);
	dir.setFont(font2);
        c_dir = new JTextField(30);

        addDir(dir,  0, 0, 1, 1);
        addDir(c_dir,1, 0, 1, 1);
//------------------------------------------------	
	SexoPanel = new JPanel(Sexo);
        sexo = new JLabel("Sexo: M o F : ", 0);
	sexo.setFont(font2);
        ocu = new JLabel("  Ocupacion: ", 0);
	ocu.setFont(font2);
        tel= new JLabel("  Telefono: ", 0);
	tel.setFont(font2);
        c_sexo = new JTextField(2);
        c_ocu = new JTextField(12);
        c_tel = new JTextField(12);

        addSexo(sexo,  0, 0, 1, 1);
        addSexo(c_sexo,1, 0, 1, 1);
        addSexo(ocu,   2, 0, 1, 1);
        addSexo(c_ocu, 3, 0, 1, 1);
        addSexo(tel,   4, 0, 1, 1);
        addSexo(c_tel, 5, 0, 1, 1);
//--------------------------------------------------	
        ResultPanel = new JPanel(Result);
        mail = new JLabel("E-Mail: ", 0);
	mail.setFont(font2);
        c_mail = new JTextField(15);
        result = new JButton("GRABAR INFORMACION");
	result.setFont(font2);
        addResult(mail,   0, 0, 1, 1);
        addResult(c_mail, 1, 0, 1, 1);
        addResult(result, 2, 0, 1, 1);

        JPanel PIdenti = new JPanel();
        JLabel Identi = new JLabel("CAMPOS DE IDENTIFICACION");
	Identi.setFont(font);
        PIdenti.add(Identi);

        
        c_edad.addActionListener(this);      

        result.addActionListener(this);
      
        Todas.setLayout(new GridLayout(6,1,3,3));
        Todas.add(PIdenti);
        Todas.add(NombrePanel);
        Todas.add(EdadPanel);
        Todas.add(DirPanel);
        Todas.add(SexoPanel);
        Todas.add(ResultPanel);
	add(Todas);
     }

    /** Listens to the check boxes. */
    class CheckBoxListener implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getItemSelectable();
        }
    }

    public void actionPerformed(ActionEvent e) {
        String source = e.getActionCommand();
        int x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12;
        int e1, e2, d1, d2, m1, m2, y1, y2;
        String[] Valores = new String[12];
        Label error = new Label("FALTAN ALGUNOS CAMPOS QUE INTRODUCIR");
        String r1 = c_nombre.getText();
        String r2 = c_apeP.getText();
        String r3 = c_apeM.getText();
        String r4 = c_edad.getText();
        String r5 = c_mes.getText();
        String r6 = c_dia.getText();
        String r7 = c_aa.getText();
        String r8 = c_dir.getText();
        String r9 = c_sexo.getText();
        String r10 = c_ocu.getText();
        String r11 = c_tel.getText();
        String r12 = c_mail.getText();
        x1 = r1.length();
        x2 = r2.length();
        x3 = r3.length();
        x4 = r4.length();
        x5 = r5.length();
        x6 = r6.length();
        x7 = r7.length();
        x8 = r8.length();
        x9 = r9.length();
        x10 = r10.length();
        x11 = r11.length();
        x12 = r12.length();
        
        Valores[0] = r1;
        Valores[1] = r2;
        Valores[2] = r3;
        Valores[3] = r4;
        Valores[4] = r5;
        Valores[5] = r6;
        Valores[6] = r7;
        Valores[7] = r8;
        Valores[8] = r9;
        Valores[9] = r10;
        Valores[10] = r11;
        Valores[11] = r12;
        
        if (x1 == 0 || x2 == 0 || x3 == 0 || x4 == 0 || x5 == 0 || x6 == 0 || x7 == 0 || x8 == 0 || x9 == 0 || x10 == 0 || x11 == 0 || x12 == 0 ){

            JFrame frame2 = new JFrame("error");
            frame2.setContentPane(new error());
            frame2.pack();
            frame2.setSize(400, 60); 
            frame2.setVisible(true); 

        } else {
            e1 = r4.charAt(0);
            e2 = '1';
            if (x4 > 1) {
                e2 = r4.charAt(1);
            }
            m1 = r5.charAt(0);
            m2 = '1';
            if (x5 > 1) {
                m2 = r5.charAt(1);
            }
            d1 = r6.charAt(0);
            d2 = '1';
            if (x6 > 1) {
                d2 = r6.charAt(1);
            }
            y1 = r7.charAt(0);
            y2 = '1';
            if (x7 > 1) {
                y2 = r7.charAt(1);
            }

            if ('0' <= e1 && e1 <= '9' && '0' <= e2 && e2 <= '9' &&
                '0' <= d1 && d1 <= '9' && '0' <= d2 && d2 <= '9' &&
                '0' <= m1 && m1 <= '9' && '0' <= m2 && m2 <= '9' &&
                '0' <= y1 && y1 <= '9' && '0' <= y2 && y2 <= '9' ) {
                Todas.remove(ResultPanel);

		EscrituraFicheros file = new EscrituraFicheros("temporal.txt", Valores, 1);
		Todas.setVisible(false);
		this.remove(Todas);
		Todas.setVisible(false);
//                JFrame frame1 = new JFrame("Inform");
//                frame1.setContentPane(new Inform());
 //               frame1.pack();
   //             frame1.setLocationRelativeTo(null);
//		frame1.setSize(600, 600);
  //              frame1.setVisible(true);

            } else {

               JFrame frame2 = new JFrame("error_int");
               frame2.setContentPane(new error_int());
               frame2.pack();
               frame2.setSize(400, 60); 
               frame2.setVisible(true); 


            }
        }
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("SCL90");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
 
        frame.setContentPane(new SCL90());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
	frame.setSize(750,250);
    }

}

