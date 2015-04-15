package PracticoDB4O;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

public class ConnectToDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded
				.newConfiguration(), "PracticoDB4O");
				try {

				} finally {
				db.close();
				}
				
			Persona persona1 = new Persona();
			db.store(persona1);



	}

}
