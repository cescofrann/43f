package classiOggetti;

public class Diploma {
	int voto;
	int durata;
	String tipo;
	
	
	public Diploma(int voto, int durata, String tipo) {
		setVoto(voto);
		setDurata(durata);
		this.tipo = tipo;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		if (voto < 0 ) {
			this.voto= 0;
		}else {
			this.voto = voto;
		}
		
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		if (durata < 0 ) {
			this.durata= 0;
		}else {
			this.durata = durata;
		}
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
