package controller;

public class ThreadMatriz extends Thread {
	
	private int vet[];

	public ThreadMatriz(int[] vetor) {
		this.vet = vetor;
	}
	
	public void run() {
		somaLinha();
	}
	private void somaLinha() {
		int soma = 0;
		String ans = "";
		for(int i = 0; i < vet.length; i++) {
			soma += vet[i];
			ans += vet[i] + " ";
		}
		System.out.println(ans + "\nSoma: " + soma);
	}
}