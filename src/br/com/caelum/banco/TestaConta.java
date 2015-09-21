package br.com.caelum.banco;


public class TestaConta {
	
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		
		c.deposita(1000);
		cc.deposita(1000);
		
		c.atualiza(0.01);
		cc.atualiza(0.01);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
	}

}
