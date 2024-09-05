import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class EscrituraFicheros {
	public EscrituraFicheros(String file, String[] datos, int ii) {

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


