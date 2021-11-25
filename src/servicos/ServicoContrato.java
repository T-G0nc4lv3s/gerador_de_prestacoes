package servicos;

import java.util.Calendar;
import java.util.Date;

import entidades.Contrato;
import entidades.Prestacao;

public class ServicoContrato {
	
	private PagamentoOnline pgOnline;
	

	public ServicoContrato(PagamentoOnline pgOnline) {
		this.pgOnline = pgOnline;
	}
	
	public void ProcessaContrato(Contrato contrato, Integer numPrestacoes) {
		Date d = contrato.getData();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		Double valor;
		
		for(int i = 1; i <= numPrestacoes; i++) {
			valor = contrato.getValorTotal() / numPrestacoes;
			valor += pgOnline.juros(valor) * i;
			valor += pgOnline.taxaPagamento(valor);
			
			
			cal.add(Calendar.MONTH, 1);
			d = cal.getTime();
			
			contrato.adicionaPrestacao(new Prestacao(d, valor));
			}
		}
	
}
