package animales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;



public class AnimalesPersintencia {
	static String hostname="localhost";
	static String dbname="Animales";

	public static void crearPerro(String nombre, String raza, int edad, String personalidad, boolean castrado, boolean masculino) {
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", " animales"));
			db.open();
			db.startTransaction();
			System.out.println("Conectado a la base de datos " + db.toString() + " de Matisse");
			// Crea un objeto Autor
			Perro p1 = new Perro(db);
			p1.setNombre(nombre);
			p1.setRaza(raza);
			p1.setEdad(edad);
			p1.setPersonalidad(personalidad);
			p1.setCastrado(castrado);
			p1.setMasculino(masculino);
			System.out.println("El perro "+nombre+" ha sido creado...");
			// Ejecuta un commit para materializar las peticiones.
			db.commit();
			// Cierra la base de datos.
			db.close();
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}
	public static void crearGato(String nombre, String raza, int edad, String personalidad, boolean castrado, boolean masculino) {
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", " animales"));
			db.open();
			db.startTransaction();
			System.out.println("Conectado a la base de datos " + db.toString() + " de Matisse");
			// Crea un objeto Autor
			Gato g1 = new Gato(db);
			g1.setNombre(nombre);
			g1.setRaza(raza);
			g1.setEdad(edad);
			g1.setPersonalidad(personalidad);
			g1.setCastrado(castrado);
			g1.setMasculino(masculino);
			System.out.println("El gato "+nombre+" ha sido creado...");
			// Ejecuta un commit para materializar las peticiones.
			db.commit();
			// Cierra la base de datos.
			db.close();
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}
	public static void leerGatos() {
		MtDatabase dbcon = new MtDatabase(hostname, dbname);
		// Abre una conexión a la base de datos
		dbcon.open();
		try {
			// Crea una instancia de Statement
			Statement stmt = dbcon.createStatement();
			String commandText = "SELECT REF(b) from animales.Gato b;";
			ResultSet rset = stmt.executeQuery(commandText);
			Gato a1;
			System.out.println("-----------Gatos-----------");
			while (rset.next()) {
				// Obtiene los objetos Autor.
				a1 = (Gato) rset.getObject(1);
				String castrado="";
				String macho="";
				if(a1.getCastrado()) {
					castrado="si";
				}else {
					castrado="no";
				}
				if(a1.getMasculino()) {
					macho="masculino";
				}
				else {
					macho="femenino";
				}				
				System.out.println("Nombre:"+String.format("%8s", a1.getNombre())+String.format("%5s","")+" Raza: "+
						String.format("%8s",a1.getRaza())+String.format("%5s","")
						+ " Edad: " + String.format("%8s", a1.getEdad())+String.format("%5s","")+
						" Personalidad: "+String.format("%8s", a1.getPersonalidad()+String.format("%5s","")+
								" Castrado: "+ String.format("%8s", castrado)+String.format("%5s","")
								+" Sexo: "+String.format("%5s",macho)
								));
			}
			// Cierra las conexiones
			rset.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
	public static void leerPerros() {
		MtDatabase dbcon = new MtDatabase(hostname, dbname);
		// Abre una conexión a la base de datos
		dbcon.open();
		try {
			// Crea una instancia de Statement
			Statement stmt = dbcon.createStatement();
			String commandText = "SELECT REF(a) from animales.perro a;";
			ResultSet rset = stmt.executeQuery(commandText);
			Perro a1;
			System.out.println("-----------Perros-----------");
			while (rset.next()) {
				// Obtiene los objetos Autor.
				a1 = (Perro) rset.getObject(1);
				String castrado="";
				String macho="";
				if(a1.getCastrado()) {
					castrado="si";
				}else {
					castrado="no";
				}
				if(a1.getMasculino()) {
					macho="masculino";
				}
				else {
					macho="femenino";
				}				
				System.out.println("Nombre:"+String.format("%8s", a1.getNombre())+String.format("%5s","")+" Raza: "+
						String.format("%8s",a1.getRaza())+String.format("%5s","")
						+ " Edad: " + String.format("%8s", a1.getEdad())+String.format("%5s","")+
						" Personalidad: "+String.format("%8s", a1.getPersonalidad()+String.format("%5s","")+
								" Castrado: "+ String.format("%8s", castrado)+String.format("%5s","")
								+" Sexo: "+String.format("%5s",macho)
								));
			}
			// Cierra las conexiones
			rset.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
	public static void modificarPerro(String nombrePerro, String campo, String registro) {
		System.out.println("=========== Modifica un Perro ==========\n");
		int nPerros = 0;
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "animales"));
			db.open();
			db.startTransaction();
			// Lista cuántos objetos Obra con el método	getInstanceNumber
			System.out.println("\n Hay " + Perro.getInstanceNumber(db) + " Perros en la DB.");
			nPerros = (int) Perro.getInstanceNumber(db);
			// Crea un Iterador (propio de Java)
			MtObjectIterator<Perro> iter = 	Perro.<Perro>instanceIterator(db);
			while (iter.hasNext()) {
				Perro[] perros = iter.next(nPerros);
				for (int i = 0; i < perros.length; i++) {
					// Busca una autor con nombre 'nombre'
					if (perros[i].getNombre().compareTo(nombrePerro)== 0) {
						switch(campo) {
						case "nombre":
						case "Nombre":
							perros[i].setNombre(registro);
							break;
						case "raza":
						case "Raza":
							perros[i].setRaza(registro);
							break;
						case "edad":
						case "Edad":
							perros[i].setEdad(Integer.parseInt(registro));
							break;
						case "personalidad":
						case "Personalidad":
							perros[i].setPersonalidad(registro);
							break;
						case "castrado":
						case "Castrado":
							boolean cast=false;
							switch(registro) {
							case "Si":
							case "si":
								cast=true;
								break;
							case "No":
							case "no":
								cast=false;
								break;
							}
							perros[i].setCastrado(cast);
							break;
						case "masculino":
						case "Masculino":
							boolean masc=false;
							switch(registro) {
							case "Si":
							case "si":
								masc=true;
								break;
							case "No":
							case "no":
								masc=false;
								break;
							case "Macho":
							case "macho":
								masc=true;
								break;
							case "Hembra":
							case "hembra":
								masc=false;
								break;
							}
							perros[i].setCastrado(masc);
							break;							
						}
						System.out.println("Campo "+campo+" modificado");
					} else {

					}
				}
			}
			iter.close();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
			System.out.println("\nHEcho.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}


	}
	public static void modificarGato(String nombreGato, String campo, String registro) {
		System.out.println("=========== Modifica un Gato ==========\n");
		int nGato = 0;
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "animales"));
			db.open();
			db.startTransaction();
			// Lista cuántos objetos Obra con el método	getInstanceNumber
			System.out.println("\n" + Gato.getInstanceNumber(db) + " Gatos en la DB.");
			nGato = (int) Gato.getInstanceNumber(db);
			// Crea un Iterador (propio de Java)
			MtObjectIterator<Gato> iter = 	Gato.<Gato>instanceIterator(db);
			while (iter.hasNext()) {
				Gato[] gatos = iter.next(nGato);
				for (int i = 0; i < gatos.length; i++) {
					// Busca una autor con nombre 'nombre'
					if (gatos[i].getNombre().compareTo(nombreGato)== 0) {
						switch(campo) {
						case "nombre":
						case "Nombre":
							gatos[i].setNombre(registro);
							break;
						case "raza":
						case "Raza":
							gatos[i].setRaza(registro);
							break;
						case "edad":
						case "Edad":
							gatos[i].setEdad(Integer.parseInt(registro));
							break;
						case "personalidad":
						case "Personalidad":
							gatos[i].setPersonalidad(registro);
							break;
						case "castrado":
						case "Castrado":
							boolean cast=false;
							switch(registro) {
							case "Si":
							case "si":
								cast=true;
								break;
							case "No":
							case "no":
								cast=false;
								break;
							}
							gatos[i].setCastrado(cast);
							break;
						case "masculino":
						case "Masculino":
							boolean masc=false;
							switch(registro) {
							case "Si":
							case "si":
								masc=true;
								break;
							case "No":
							case "no":
								masc=false;
								break;
							case "Macho":
							case "macho":
								masc=true;
								break;
							case "Hembra":
							case "hembra":
								masc=false;
								break;
							}
							gatos[i].setCastrado(masc);
							break;							
						}
						System.out.println("Campo "+campo+" modificado");
					} else {

					}
				}
			}
			iter.close();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
			System.out.println("\nHEcho.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}		
	}
	public static void deletePerro(String nombrePerro) {
		System.out.println("\n=========== Elimina un Perro ==========\n");
		int nPerro = 0;
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "animales"));
			db.open();
			db.startTransaction();
			// Lista cuántos objetos Obra con el método	getInstanceNumber
			System.out.println("\n" + Perro.getInstanceNumber(db) + " Perros en la DB.");
			nPerro = (int) Perro.getInstanceNumber(db);
			// Crea un Iterador (propio de Java)
			MtObjectIterator<Perro> iter = Perro.<Perro>instanceIterator(db);
			while (iter.hasNext()) {
				Perro[] perros = iter.next(nPerro);
				for (int i = 0; i < perros.length; i++) {
					// Busca una autor con nombre 'nombre'
					if (perros[i].getNombre().compareTo(nombrePerro)== 0) {
						System.out.println("Perro"+perros[i].getNombre()+" será borrado");
						perros[i].remove();
						System.out.println("Exito");
					}
				}
			}
			iter.close();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
		}catch(MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}		
	}
	public static void deleteGato(String nombreGato) {
		System.out.println("\n=========== Elimina un Gato ==========\n");
		int nGato = 0;
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "animales"));
			db.open();
			db.startTransaction();
			// Lista cuántos objetos Obra con el método	getInstanceNumber
			System.out.println("\n" + Gato.getInstanceNumber(db) + " Gatos en la DB.");
			nGato = (int) Gato.getInstanceNumber(db);
			// Crea un Iterador (propio de Java)
			MtObjectIterator<Gato> iter = 	Gato.<Gato>instanceIterator(db);
			while (iter.hasNext()) {
				Gato[] gatos = iter.next(nGato);
				for (int i = 0; i < gatos.length; i++) {
					// Busca una autor con nombre 'nombre'
					if (gatos[i].getNombre().compareTo(nombreGato)== 0) {
						System.out.println("Gato"+gatos[i].getNombre()+" será borrado");
						gatos[i].remove();
						System.out.println("Exito");
					}
				}
			}
			iter.close();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
		}catch(MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}
	public static void borrarTodoPerro() {
		System.out.println("====================== Borrar Todos	=====================\n");
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new
					MtPackageObjectFactory("", "animales"));
			db.open();
			db.startTransaction();
			// Lista todos los objetos Obra que hay en la base de datos, con el método
			// getInstanceNumber
			System.out.println("\n" + Perro.getInstanceNumber(db) + "Perros(s) en la DB.");
			// Borra todas las instancias de Obra
			Perro.getClass(db).removeAllInstances();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
			System.out.println("\nHecho.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}
	public static void borrarTodoGato() {
		try {
			MtDatabase db = new MtDatabase(hostname, dbname, new
					MtPackageObjectFactory("", "animales"));
			db.open();
			db.startTransaction();
			// Lista todos los objetos Obra que hay en la base de datos, con el método
			// getInstanceNumber
			System.out.println("\n" + Gato.getInstanceNumber(db) + "Gatos(s) en la DB.");
			// Borra todas las instancias de Obra
			Gato.getClass(db).removeAllInstances();
			// materializa los cambios y cierra la BD
			db.commit();
			db.close();
			System.out.println("\nHecho.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}
}
