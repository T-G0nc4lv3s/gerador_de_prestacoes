package servicos;

public class ServicoPayPal implements PagamentoOnline {
	
	
	public ServicoPayPal() {
	}

	@Override
	public Double taxaPagamento(Double quantia) {
		return quantia * 0.02;
	}

	@Override
	public Double juros(Double quantia) {
		return quantia * 0.01;
	}

}
