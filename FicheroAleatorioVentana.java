import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JFrame;


public class FicheroAleatorioVentana {
	
	public static void main(String[] args) throws IOException {
		
		claseAnidada ej=new claseAnidada(); //HEMOS CREADO ESTE OBJETO DANILO Y FRAN
		ej.entrada(); // LLAMAMOS AL METODO
		
		System.out.println("Llamo a salida" + ej.salida(10));
		
		JFrame f = new JFrame("DEPARTAMENTOS.");
		// Nos aseguramos que el fichero exista para evitar posibles errores
		File fichero = new File("AleatorioDep.dat");
		RandomAccessFile file;
		file = new RandomAccessFile(fichero, "rw");	
		file.close();
		
		VentanaDepart v = new VentanaDepart(f);
		v.setVisible(true);
	   
	}// fin main
	
}// fin class
