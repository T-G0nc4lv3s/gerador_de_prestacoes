package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {
	
	private Date dataVenc;
	private Double valor;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Prestacao() {
	}

	public Prestacao(Date dataVenc, Double valor) {
		this.dataVenc = dataVenc;
		this.valor = valor;
	}
	
	
	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return sdf.format(getDataVenc()) + " - " + String.format("%.2f ", getValor());
	}
	
	
}
