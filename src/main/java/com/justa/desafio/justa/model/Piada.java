package com.justa.desafio.justa.model;

public class Piada {

	private String id;
	private String type;
	private String setup;
	private String punchline;

	public Piada() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSetup() {
		return setup;
	}

	public void setSetup(String setup) {
		this.setup = setup;
	}

	public String getPunchline() {
		return punchline;
	}

	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}

	@Override
	public String toString() {
		return "Piada [id=" + id + ", type=" + type + ", setup=" + setup + ", punchline=" + punchline + "]";
	}

}
