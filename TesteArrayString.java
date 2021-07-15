package br.com.byteban.banco.test;

import br.com.byteban.banco.modelo.Cliente;
import br.com.byteban.banco.modelo.Conta;
import br.com.byteban.banco.modelo.ContaCorrente;
import br.com.byteban.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		
		System.out.println("Funcionou!!");
		
		for (int i = 0; i < args.length; i++) {
			
			System.out.println(args[i]);
		}
	} 

}
