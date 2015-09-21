package br.com.caelum.banco;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		//Testando poliformismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
	}
}
