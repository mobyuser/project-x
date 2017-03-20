package br.edu.universityx.project;

import java.util.Date;

public class Localizacoes {
	private String coordenadas;
	private String id;
	private Date datetime;
	
	public Localizacoes(){
		
	}
	
	public Localizacoes(String coordenadas, String id, Date datetime) {
		this.coordenadas = coordenadas;
		this.id = id;
		this.datetime = datetime;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	
	
}
