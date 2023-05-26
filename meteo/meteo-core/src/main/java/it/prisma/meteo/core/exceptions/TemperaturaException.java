package it.prisma.meteo.core.exceptions;

public class TemperaturaException extends Exception {

	public TemperaturaException(int temperatura) {
		super("temperatura:" + temperatura + "invalida");
	}

}
