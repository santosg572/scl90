import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Lectura_Escritura_scl90 {

        public static void main(String[] args) {

String[] lineas1 = { "Lucrecia11111111", "Tere", "Gaby", "Rosy", "Cinco", "Seis", "Siete", "..." };
String[] lineas2 = { "Lucrecia22222222", "Tere", "Gaby", "Rosy", "Cinco", "Seis", "Siete", "..." };

		System.out.println("... PRUEBAS  ...");

//		LecturaFicheros lec = new LecturaFicheros("jjjj");
		EscrituraFicheros file1 = new EscrituraFicheros("temporal.txt", lineas1, 1);
		EscrituraFicheros file2 = new EscrituraFicheros("temporal.txt", lineas2, 2);
		LecturaFicheros lec = new LecturaFicheros("temporal.txt");
	}

}

class LecturaFicheros {

	LecturaFicheros(String file) {

		// Fichero del que queremos leer
		File fichero = new File(file);
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);      // Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}


class EscrituraFicheros {

	EscrituraFicheros(String file, String[] datos, int ii) {

// ii = 1 nuevo file
// ii = 2 añade al file

//		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };

		/** FORMA 1 DE ESCRITURA **/
		if (ii == 1) {
		FileWriter fichero = null;
		try {

			File fich = new File(file);
			if (fich.delete())
   				System.out.println("El fichero ha sido borrado satisfactoriamente");
			else
   				System.out.println("El fichero no puede ser borrado");

			fichero = new FileWriter(file);

			// Escribimos linea a linea en el fichero
			for (String linea : datos) {
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
		} else {

                FileWriter fichero = null;
                try {

                        fichero = new FileWriter(file, true);

                        // Escribimos linea a linea en el fichero
                        for (String linea : datos) {
                                fichero.write(linea + "\n");
                        }

                        fichero.close();

                } catch (Exception ex) {
                        System.out.println("Mensaje de la excepción: " + ex.getMessage());
                }
		}
	}
}


