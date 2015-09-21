package br.com.caelum.banco;

import org.omg.Messaging.SyncScopeHelper;

public class TesteErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim domain");
	}
	
	static void metodo1() {
		System.out.println("iniciio do metodo1");
		metodo2();
		System.out.println("fimdometodo1");
	}
	static void metodo2() {
		try {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		for(int i=0; i<=15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("erro :" + e);
		}
		
		System.out.println("fim do metodo2");
	}
	
}
