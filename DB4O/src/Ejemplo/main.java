package Ejemplo;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectContainer db=Db4o.openFile("archivoEjemploDB4O");
		/*Persona p = new Persona ();
		p.setDocumento(123456);
		p.setNombre("Sebastian");
		p.setApellido("Abreu");
		db.store(p);
		
		Persona p1 = new Persona ();
		p1.setDocumento(234567);
		p1.setNombre("Sebastian");
		p1.setApellido("LALA");
		db.store(p1);*/
		
		Persona p2 = new Persona ();
		p2.setNombre("Sebastian");
		ObjectSet<Persona> p_list = db.queryByExample(p2);
		for (Persona pers: p_list){
			System.out.println(pers.getApellido());	
			db.delete(p2);
			System.out.println(pers.getApellido());	
		}
		
		
				
	}

}
