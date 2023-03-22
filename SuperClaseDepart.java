import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SuperClaseDepart{
	
	void grabar(int dep, String nom, String loc) /**Metodo grabar*/
	{	 
			long pos; StringBuffer buffer = null;
			File fichero = new File("AleatorioDep.dat");
			try {
			RandomAccessFile file = new RandomAccessFile(fichero, "rw");
	        // Calculo del reg a leer
	        pos=44 * (dep-1);
	        //if (file.length()==0) return false; // si est� vac�o
	        
		    file.seek(pos); 
		    file.writeInt(dep);       
		    buffer = new StringBuffer( nom );      
		    buffer.setLength(10); 
		    file.writeChars(buffer.toString());//insertar nombre
		    buffer = new StringBuffer( loc );      
		    buffer.setLength(10); 
		    file.writeChars(buffer.toString());//insertar loc
		    file.close(); 
		    System.out.println(" GRABADOOO el "+dep);  
			}catch (IOException e1) {
			   System.out.println("ERRROR AL grabarr AleatorioDep.dat");    
				e1.printStackTrace();
			}	
	} // fin grabar
	
	//NO HEMOS PODIDO ENCONTRAR EL METODO  VISUALIZAR
}
