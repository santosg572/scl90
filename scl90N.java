import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class scl90N extends JFrame {
	public static JPanel P2;
	public scl90N()
	{

    		Panel_InfA panel = new Panel_InfA();

		JScrollPane scrollPane = new JScrollPane(panel);

		scrollPane.setPreferredSize(new Dimension(800,300));

 		P2 = new JPanel();
		P2.add(scrollPane, BorderLayout.CENTER);
    		getContentPane().add(P2);

    		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    		setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
    		setVisible(true);


		int panelX = ((int) dim.getWidth() - P2.getWidth()) / 2;
    		int panelY = ((int) dim.getHeight() - P2.getHeight()) / 2;

//    		System.out.printf("%d = %d \n", panelX, panelY);

    		System.out.printf("%d = %d \n", panel.getWidth(), panel.getHeight());
    		P2.setLocation(panelX, panelY);
	}

	public static void main(String[] args) {
    		new scl90N();
	}


class Panel_InfA extends JPanel implements ActionListener  {
	Font fontB20 = new Font("SansSerif", Font.BOLD, 20);
	Font fontB18A = new Font("Arial", Font.BOLD, 18);
        Font fontB15A = new Font("Arial", Font.BOLD, 15);
	JButton b1;

	Panel_InfA(){
		b1 = new JButton("CONTINUAR");
                b1.addActionListener(this);
		JLabel text; 
		InformacionA dd = new InformacionA();
		String[] ss = dd.DD();

		int np = ss.length;
		setLayout (new GridLayout (np+1,1)); 

		text = new JLabel(ss[0]);
		text.setFont(fontB20);
		text.setForeground(Color.blue);
                add(text);

		text = new JLabel(ss[1]);
                text.setFont(fontB20);
                text.setForeground(Color.blue);
                add(text);

		for (int i=2; i<np; i++) {
			text = new JLabel(ss[i]);
			text.setFont(fontB15A);
			add(text);
		}

		add(b1);
		setSize(800,600);		
	}

	public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b1)
                {
                        System.out.printf("b1");
			this.setVisible(false);
			this.disable();
			JFrame jj = new JFrame();
			jj.add(new SCL90());
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	    		jj.setBounds(0, 0, (int) dim.getWidth(), (int) dim.getHeight());
	    		jj.setVisible(true);
                }
        } 
}
}






class Datos {



	Datos(){}



	String[] Datos1(){



		String[] inf = {



		"Hoja de Información",

		"-------------------",

        	"Estudio de Resonancia Magnética de Cerebro y su correlato funcional,",



		" genético y conductual.",


		"-------------------",
        	"Investigador Principal:    Dr. Fernando Barrios",



        	"Dirección: Instituto de Neurobiología, UNAM.",



        	"    Campus Juriquilla UNAM-UAQ Querétaro.",



        	"Qro. 76230",



        	"TEL: (52)(55)5623-4053", 

		"-------------------",

        	"Proposito del Estudio",



        	"Este estudio ha sido diseñado para describir las caracteristicas estructurales del cerebro",



		"en un grupo de participantes sanos. Asimismo se investigara la relación entre la ",



		"estructura y la función cerebral con diferentes aspectos de la conducta normal y la ",



		"información genética. Se utilizaran voluntarios sanos a los cuales se les realizaran ",



		"varias entrevistas para la cuantificación de aspectos de la conducta, se obtendra una",



		"muestra de sangre para la caracterización de diversos genotipos y se realizara un estudio",



		"de Resonancia Magnética estructural y funcional.",

		"-------------------------------------",
		"Procedimiento y duración",



        	"La sesión tendra una duración aproximada de 2 horas donde se le solicitara llenar algunas",



		"entrevistas y se realizará el estudio de Resonancia Magnética. El estudio sera llevado a ",



		"cabo por investigadores expertos en estas técnicas, quienes podra contestar cualquier",



		"pregunta adicional.",
		"------------------------------------",

        	"Riesgos y molestias",



        	"No se ha reportado que existan riesgos ni molestias posterior al procedimiento de", 



		"Resonancia Magnética. En caso de que usted tenga alguna prótesis o dispositivo",



		"metálico en el cuerpo o marcapaso es MUY IMPORTANTE que avise al investigador,",



		"ya que no es candidato para participar en el estudio.",
		"-------------------------------------",



        	"Beneficios",



        	"El beneficio directo consiste en la obtención de una imagen de su cerebro de gran",



		"resolución. También tendra el beneficio indirecto con la oportunidad de ayudarse",



		"a sí mismo y a otros al contribuir en el entendimiento del funcionamiento cerebral.",



        	"Ninguno de los procedimientos realizados en el protocolo tendrán costo monetario para",



		"los participantes.",



        	"Confidencialidad",



        	"Su identidad ni sus resultados serán revelados.",



        	"Participación Voluntaria / Suspensión de la Participación",



        	"Su participación en este estudio es voluntaria. Puede rehusarse a participar o suspender",



		"su participacion en el estudio en cualquier momento. Se le informara acerca de cualquier",



		"hallazgo significativo que surja durante el curso de esta investigacion, si usted asi lo",



		"desea."



	};



	return inf;



	}



}


class Datos2 {
        Datos2(){}
        String[] DD(){
                String[] inf = {
"VERSIÓN COMPUTARIZADA PARA LA APLICACIÓN DEL LISTADO",
"          DE SÍNTOMAS 90 (SCL 90)",
"----------------------------------------------------------------------------",
" Las pruebas psicométricas ayudan a la medición de características psicológicas",
" que incluyen personalidad, motivación, habilidades intelectuales y rasgos",
" psicopatológicos. El diagnóstico psicopatológico se puede respaldar en",
" pruebas psicométricas que idealmente deben ser sencillas y",
" de rápida aplicación.", 
"                      ",
" El SCL 90 evalúa el grado de 'distrés' psicológico a través de 90 reactivos",
" de tipo Likert, agrupados en nueve dimensiones.",
"        ",
"        ",
" Referencia: Leopoldo González-Santos, Roberto E. Mercadillo, Ariel Graff,",
"             Fernando A. Barrios. VERSIÓN COMPUTARIZADA PARA LA APLICACIÓN",
"             DEL LISTADO DE SÍNTOMAS 90 (SCL 90) Y DEL INVENTARIO",
"             DE TEMPERAMENTO Y CARÁCTER (ITC)”, Salud Mental, Vol. 30,",
"             No. 4, julio-agosto 2007.",
"                     ",
"                     "
		};
	return inf;
	}
}
