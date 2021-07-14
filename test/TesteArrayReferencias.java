package br.com.byteban.banco.test;

import br.com.byteban.banco.modelo.Cliente;
import br.com.byteban.banco.modelo.Conta;
import br.com.byteban.banco.modelo.ContaCorrente;
import br.com.byteban.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[]idades = new int[5]; 
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1; // "0" é a primeira posicao
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		
//		System.out.println(cc2.getNumero());
	
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println(referenciaGenerica.getNumero());
	
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	} 

}
