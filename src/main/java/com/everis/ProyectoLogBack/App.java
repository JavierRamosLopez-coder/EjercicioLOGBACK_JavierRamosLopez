package com.everis.ProyectoLogBack;

/**
 * Librerías necesarias
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ejercicio 1 - LOGBACK - Javier Ramos López
 * 
 * @author jramlope
 *
 */
public class App {

	// Declaración de un atributo estático LOGGER
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		LOGGER.info("ESTE ES EL PRINCIPIO DEL FOR");
		
		for(int i = 0; i < 2000; i++) {
			LOGGER.debug("Vamos repitiendo la sentencia {}",i);
		}
		
		LOGGER.info("ESTE ES EL FINAL DEL FOR");
		
		LOGGER.error("ERROR PARA COMPROBAR QUE DEBUG CONTIENE AL NIVEL ERROR");
		
		LOGGER.trace("ESTE TRACE NO LO DEBERÍA MOSTRAR EL DEBUG, PERO SI DESCOMENTAS EL TERCER APPENDER SALDRÁ ^^");
		
	}
}
