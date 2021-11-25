package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Prestacao;
import servicos.ServicoContrato;
import servicos.ServicoPayPal;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Integer numero = null;
		Date data = null;
		Double valorContrato = null;
		
		try {
			System.out.println("Entre com os dados do contrato:");
			System.out.print("Número: ");
			numero =sc.nextInt();
			sc.nextLine();
			System.out.print("Data (dd/MM/yyyy): ");
			data = sdf.parse(sc.nextLine());
			System.out.print("Valor do Contrato: ");
			valorContrato = sc.nextDouble();
			
		}
		catch(ParseException e) {
			System.out.println("Erro! " + e.getMessage());
		}
		
		Contrato contrato = new Contrato(numero, data, valorContrato);
		
		System.out.print("Entre com o número de prestações: ");
		Integer qtdPrestacoes = sc.nextInt();
		sc.nextLine();
		
		ServicoPayPal svcPayPal = new ServicoPayPal();
		
		ServicoContrato svcContrato = new ServicoContrato(svcPayPal);
		svcContrato.ProcessaContrato(contrato, qtdPrestacoes);
		
		System.out.println();
		System.out.println("Prestações:");
		
		for(Prestacao p: contrato.getPrestacoes()) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
