package animales;

public class Principal {
	final static String nombrePerro="Bacon";
	final static String razaPerro="akita inu";
	final static int edadPerro=4;
	final static String personalidadPerro="Intenso";
	final static boolean castradoPerro=false;
	final static boolean masculinoPerro=true;
	
	final static String nombreGato="Milka";
	final static String razaGato="Persa";
	final static int edadGato=1;
	final static String personalidadGato="Tranquilo";
	final static boolean castradoGato=false;
	final static boolean masculinoGato=false;
	
	final static String campoModificar="personalidad";
	final static String registroModificar="Tranquilo2";
	
	final static String campo2Modificar="raza";
	final static String registro2Modificar="Turco";
	
	
	public static void main(String[] args) {
		AnimalesPersintencia.crearPerro(nombrePerro, razaPerro, edadPerro, personalidadPerro, castradoPerro, masculinoPerro);
		AnimalesPersintencia.crearGato(nombreGato, razaGato, edadGato, personalidadGato, castradoGato, masculinoGato);
		AnimalesPersintencia.leerPerros();
		AnimalesPersintencia.leerGatos();		
		AnimalesPersintencia.modificarPerro(nombrePerro, campoModificar, registroModificar);
		AnimalesPersintencia.modificarGato(nombreGato,campo2Modificar,registro2Modificar);	
		AnimalesPersintencia.leerPerros();
		AnimalesPersintencia.leerGatos();
		AnimalesPersintencia.deletePerro(nombrePerro);
		AnimalesPersintencia.deleteGato(nombreGato);
		AnimalesPersintencia.leerPerros();
		AnimalesPersintencia.leerGatos();	
	}	
}
