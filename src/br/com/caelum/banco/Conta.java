package br.com.caelum.banco;

	
	public abstract class Conta {
		
		protected double saldo;

		public void deposita(double valor) {
			if(valor < 0) {
				throw new IllegalArgumentException();
			}else {
			this.saldo += valor;
			}
		}
		
		public void saca(double valor) {
			this.saldo -= valor;
		}
		
		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public void atualiza(double taxa) {
			this.saldo += this.saldo * taxa;
		}
		
	}