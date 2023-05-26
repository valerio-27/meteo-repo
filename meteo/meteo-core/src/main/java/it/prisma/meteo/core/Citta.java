package it.prisma.meteo.core;

import org.apache.commons.lang3.StringUtils;

public class Citta {

	private String nome;

	public Citta(String nome) {
		super();

		checkAlfanumerico(nome);

		this.nome = nome;
	}

	private void checkAlfanumerico(String nome) {

		if (StringUtils.isAlphanumeric(nome)) {

			throw new IllegalArgumentException("Il nome " + nome + " non è alfanumerico");
		}

	}

	public String getNome() {
		return nome;
	}

}
