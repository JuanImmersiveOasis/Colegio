package es.juan.colegio.aplicacion;

import es.juan.colegio.controlador.AlumnoControlador;
import es.juan.colegio.modelo.AlumnoDAO;
import es.juan.colegio.vista.AlumnoVista;

public class ColegioApp {

	public static void main(String[] args) {
		ColegioApp app = new ColegioApp();
		app.ejecutar();

	}
	
	public void ejecutar() {
		AlumnoVista vista = new AlumnoVista();
		AlumnoDAO dao = new AlumnoDAO();
		
		AlumnoControlador controlador = new AlumnoControlador(vista,dao);
		controlador.iniciar();
	}

}
