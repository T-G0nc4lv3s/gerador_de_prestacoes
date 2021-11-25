package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private Date data;
	private Double valorTotal;
	private List<Prestacao> prestacoes = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(Integer numero, Date data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public Integer getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void adicionaPrestacao(Prestacao prestacao) {
		prestacoes.add(prestacao);
	}
	
	public void removePrestacao(Prestacao prestacao) {
		prestacoes.remove(prestacao);
	}

	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}
	
}
