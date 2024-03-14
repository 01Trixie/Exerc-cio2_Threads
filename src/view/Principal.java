package view;

import java.util.Random;

import controller.ThreadMatriz; 

public class Principal {

	public static void main(String[] args) {
		
		int mat[][] = new int [3][5];
		Random R = new Random();
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				mat[i][j] = R.nextInt(101);
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		

		for(int i = 0; i < 3; i++) {
			Thread somaLinha = new ThreadMatriz(mat[i]);
			somaLinha.start();
		}
		
	}

}