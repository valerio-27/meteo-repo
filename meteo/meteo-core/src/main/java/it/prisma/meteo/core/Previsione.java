package it.prisma.meteo.core;

public class Previsione {

	private Citta citta;
	private Temperatura temperatura;
	private boolean allertaMeteo;
	private CondizioneMeteo condizioneMeteo;

	private Previsione(Citta citta, Temperatura temperatura, boolean allertaMeteo, CondizioneMeteo condizioneMeteo) {
		super();
		this.citta = citta;
		this.temperatura = temperatura;
		this.allertaMeteo = allertaMeteo;
		this.condizioneMeteo = condizioneMeteo;
	}

	public static Previsione crea(Citta citta, Temperatura temperatura, CondizioneMeteo condizioneMeteo)
			throws PrevisioneException {
		if (citta == null || temperatura == null || condizioneMeteo == null) {
			throw new PrevisioneException("Impossibile creare la previsione se ci sono dei dati mnacanti");
		}
		boolean allertaMeteo = false;
		if (condizioneMeteo.equals(CondizioneMeteo.NEVE) || condizioneMeteo.equals(CondizioneMeteo.TEMPORALE)) {
			allertaMeteo = true;
		}

		return new Previsione(citta, temperatura, allertaMeteo, condizioneMeteo);
	}

	public enum CondizioneMeteo {
		SOLE, PIOGGIA, NUVOLOSO, NEVE, TEMPORALE;
	}

}
