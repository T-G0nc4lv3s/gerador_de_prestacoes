package servicos;

public interface PagamentoOnline {
	
	public abstract Double taxaPagamento(Double quantia);
	public abstract Double juros(Double quantia);
}
