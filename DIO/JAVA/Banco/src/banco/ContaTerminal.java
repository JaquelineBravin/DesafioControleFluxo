package banco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
			System.out.println("Digite a agencia: ");
			String agencia = terminal.next();
			
			System.out.println("Digite o numero da conta: ");
			int numero = terminal.nextInt();
			
			System.out.println("Digite seu nome: ");
			String nome = terminal.next();
			
			System.out.println("Digite seu saldo: ");
			double saldo = terminal.nextDouble();
			
			System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
	}
}
