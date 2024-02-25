package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Receber a mensagem de qual informação será solicitada,
		
		System.out.print("Por favor, digite o número da sua Agência: ");
		int numero = entrada.nextInt();
		System.out.println("Usuário: 1021");
		
		System.out.print("Por favor, digite a sua Agência: ");
		String agencia = entrada.next();
		
		System.out.print("Por favor, digite o seu nome: ");
		String nomeCliente = entrada.next();
		
		System.out.print("Por favor, digite o seu saldo: ");
		double saldo = entrada.nextDouble();
		
		// Mensagem da abertura de conta para o usuario
		
		System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
		agencia + ", conta " + numero + " e seu saldo é " + saldo + " já está disponível para saque");
		
		entrada.close();
		
	}
	
}
