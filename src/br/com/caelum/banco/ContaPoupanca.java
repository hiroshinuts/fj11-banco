package br.com.caelum.banco;


public  class ContaPoupanca extends Conta {
	
	public  void atualiza(double taxa) {
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
}
