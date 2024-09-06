
public class Main {

	public static void main(String[] args) {
		Cliente Breno = new Cliente();
		Breno.setNome("Breno");
		
		Conta cc = new ContaCorrente(Breno);
		Conta poupanca = new ContaPoupanca(Breno);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}