package it.prisma.meteo.core;

public class Previsione {

	private Citta citta;
	private Temperatura temperatura;
	private boolean allertaMeteo;
	private CondizioneMeteo condizioneMeteo;

	public enum CondizioneMeteo {
		SOLE, PIOGGIA, NUVOLOSO, NEVE, TEMPORALE;
	}

}
