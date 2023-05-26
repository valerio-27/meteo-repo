package it.prisma.meteo.core;

import it.prisma.meteo.core.exceptions.TemperaturaException;

public class Temperatura {

	private int temperatura;

	private Temperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public static Temperatura crea(int temperatura) throws TemperaturaException {
		if (temperatura < -50 || temperatura > 50) {
			throw new TemperaturaException(temperatura);
		}
		return new Temperatura(temperatura);
	}

	public int getTemperatura() {
		return temperatura;
	}

}
