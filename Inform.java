import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Inform extends JPanel {
    private Font font = new Font("times", Font.ITALIC+Font.BOLD, 22);
    private Font font1 = new Font("times", Font.BOLD, 18);
    private Font font2 = new Font("times", Font.BOLD, 16);
    private Font font3 = new Font("times", Font.BOLD, 14);
    
	
    JScrollPane SSPane;
    JPanel P2, P3, P4;
    JButton Terminar;
    int ancho = 780;
    int ny = 600;
    public Inform() {
        

	Informacion inf = new Informacion();
	  

	SSPane = new JScrollPane(inf);
        SSPane.setBounds(0,0,ancho,500);
        SSPane.setSize(ancho,500);
	SSPane.setPreferredSize(new Dimension(ancho,ny));
		
 	JPanel P3 = new JPanel();
	P3.setPreferredSize(new Dimension(ancho, ny));
	P3.add(SSPane, BorderLayout.CENTER);
	add(P3);

   }

}


class Informacion extends JPanel implements ActionListener {
   private Font font = new Font("times", Font.ITALIC+Font.BOLD, 22);
   private Font font1 = new Font("times", Font.BOLD, 18);
   private Font font2 = new Font("times", Font.BOLD, 16);
   private Font font3 = new Font("times", Font.BOLD, 14);

   JPanel P1, P99;
   JButton Terminar;

   String[] ss = {
"              Hoja de Información",
"              ===================",
"Estudio de Resonancia Magnética de Cerebro y su correlato funcional,",
" genetico y conductual.",
"--------------------------------------------------------------------",
"Investigador Principal:    Dr. Fernando Barrios",
"Dirección: Instituto de Neurobiología, UNAM.",
"    Campus Juriquilla UNAM-UAQ Quro, 76230, México.",
"---------------------------------------------------",
"Proposito del Estudio",
"Este estudio ha sido diseñado para describir las características estructurales del cerebro",
"en un grupo de participantes sanos. Asimismo se investigará la relación entre la ",
"estructura y la función cerebral con diferentes aspectos de la conducta normal y la ",
"información genética. Se utilizaran voluntarios sanos a los cuales se les realizaran ",
"varias entrevistas para la cuantificación de aspectos de la conducta, se obtendra una",
"muestra de sangre para la caracterización de diversos genotipos y se realizara un estudio",
"de Resonancia Magnetica estructural y funcional.",
"-----------------------------------------------------------------------------------------",
"Procedimiento y duración",
"La sesión tendrá una duración aproximada de 2 horas donde se le solicitara llenar algunas",
"entrevistas y se realizara el estudio de Resonancia Magnética. El estudio sera llevado a ",
"cabo por investigadores expertos en estas técnicas, quienes podrá contestar cualquier",
"pregunta adicional.",
"-----------------------------------------------------------------------------------------",
"Riesgos y molestias",
"No se ha reportado que existan riesgos ni molestias posterior al procedimiento de", 	
"Resonancia Magnética. En caso de que usted tenga alguna prótesis o dispositivo",
"metálico en el cuerpo o marcapaso es MUY IMPORTANTE que avise al investigador,",
"ya que no es candidato para participar en el estudio.",
"-----------------------------------------------------------------------------------------",
"Beneficios",
"El beneficio directo consiste en la obtención de una imagen de su cerebro de gran",
"resolución. También tendrá el beneficio indirecto con la oportunidad de ayudarse",
"a sí mismo y a otros al contribuir en el entendimiento del funcionamiento cerebral.",
"Ninguno de los procedimientos realizados en el protocolo tendrán costo monetario para",
"los participantes.",
"-----------------------------------------------------------------------------------------",
"Confidencialidad",
"Su identidad ni sus resultados serán revelados.",
"Participación Voluntaria / Suspension de la Participación",
"Su participación en este estudio es voluntaria. Puede rehusarse a participar o suspender",
"su participación en el estudio en cualquier momento. Se le informara acerca de cualquier", 
"hallazgo significativo que surja durante el curso de esta investigación, si usted así lo", 
"desea.",
"-----------------------------------------------------------------------------------------"};

   Informacion(){
	P1 = new JPanel();
//	P99 = new JPanel();
    	JLabel labeltem;


   	Terminar = new JButton("SI!");
   Terminar.setFont(font2);
   Terminar.addActionListener(this);
 
   JLabel aceptas = new JLabel("Aceptas esta información:");
   aceptas.setFont(font2);



	int np = ss.length;

        P1.setLayout(new GridLayout(np+3,1));

//        P99.setLayout(new GridLayout(2,1));

        labeltem = new JLabel(ss[0]);
        labeltem.setFont(font);
        P1.add(labeltem);
  

        for (int i = 1; i < 3; i++){
	   labeltem = new JLabel(ss[i]);
           labeltem.setFont(font1);
           P1.add(labeltem);
        }
  

        for (int i = 3; i<8; i++){
           labeltem = new JLabel(ss[i]);
           labeltem.setFont(font2);
           P1.add(labeltem);
        }
    

 	for (int i = 8; i<np; i++){
	   labeltem = new JLabel(ss[i]);
           labeltem.setFont(font3);
           P1.add(labeltem);
        }

	P1.add(aceptas);
	P1.add(Terminar);
	P1.add(new JLabel("      "));
	

	add(P1);

   }

   public void actionPerformed(ActionEvent e) {
       String x = e.getActionCommand();
       P1.setVisible(false);
       P1.remove(Terminar);
       JFrame frame2 = new JFrame("SCL_90_1_40");
       frame2.setContentPane(new SCL_90_1_40());
       
       frame2.pack();
       frame2.setLocationRelativeTo(null);
       frame2.setVisible(true); 
    }

}


