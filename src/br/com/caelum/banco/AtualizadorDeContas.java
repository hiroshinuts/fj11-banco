package br.com.caelum.banco;

public class AtualizadorDeContas {
	
	private static double saldoTotal = 0;
	private double selic;
	
	public double getSelic() {
		return selic;
	}
	public void setSelic(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println(c.getSaldo());
		c.atualiza(0.01);
		System.out.println(c.getSaldo());
	}

}
