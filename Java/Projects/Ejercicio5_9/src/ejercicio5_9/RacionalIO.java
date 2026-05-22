package ejercicio5_9;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
// usar scanner en vez de la chorrada de bufferreader


public class RacionalIO {

    public void escribir(ArrayList<Racional> lista, String fichero) {
        try (PrintWriter wr = new PrintWriter(new FileWriter(fichero))) {
		
		//usamos un for each
		for (Racional r : lista) {
			wr.println(r.getNumerador() + " " + r.getDenominador());
			//mandando al archivi abierto por pw
		}            

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Racional> leer(String fichero) {
        ArrayList<Racional> leidos = new ArrayList<>();
        
        try (Scanner re = new Scanner(new File(fichero))) {
            
		while (re.hasNextInt()) {
			int num = re.nextInt();
			int den = re.nextInt();

			Racional r = new Racional(num, den);
			leidos.add(r); 
	    }
            
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer fich: " + e.getMessage());
        }
        
        return leidos;
    }

// binario (no se necisita formatear con espacios ni nada porque sabemos ya 
// exactamente cuanto ocupara un int) la logica es practicamente igual pero
// usando otra manera de escribir y leer (bytes crudos)

    public void escribirbin(ArrayList<Racional> lista, String fichero) {
        try (DataOutputStream wrb = new DataOutputStream(new FileOutputStream(fichero))) {
		
		for (Racional r : lista) {
			wrb.writeInt(r.getNumerador());
			wrb.writeInt(r.getDenominador());
		}            

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<Racional> leerbin(String fichero) {
        ArrayList<Racional> leidos = new ArrayList<>();
        
        try (DataInputStream reb = new DataInputStream(new FileInputStream(fichero))) {
            
	// Returns an estimate of the number of bytes that can be read 
	// (or skipped over) from this input stream without blocking by 
	// the next caller of a method for this input stream.
            while (reb.available() > 0) {
                int num = reb.readInt();
                int den = reb.readInt();
                
                Racional r = new Racional(num, den);
                leidos.add(r);
            }
            
        } catch (IOException e) {
            System.out.println("Error al leer bin: " + e.getMessage());
        }
        
        return leidos;
    } 
    
    public void escribirObjBin(ArrayList<Racional> lista, String fichero) {
        try (ObjectOutputStream wrob = new ObjectOutputStream(new FileOutputStream(fichero))) {
            
            //guardamos la lista entera con todo su contenido de una sola vez
            wrob.writeObject(lista);
            
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    public ArrayList<Racional> leerObjBin(String fichero) {
        ArrayList<Racional> leidos = new ArrayList<>();
        
        try (ObjectInputStream reob = new ObjectInputStream(new FileInputStream(fichero))) {
            
//Read an object from the ObjectInputStream. The class of the object, 
//the signature of the class, and the values of the non-transient and 
//non-static fields of the class and all of its supertypes are read......
            leidos = (ArrayList<Racional>) reob.readObject();
            
	} catch (Exception e) {
            System.out.println("Error al leer obj: " + e.getMessage());
        }
        
        return leidos;
    }
    
}
