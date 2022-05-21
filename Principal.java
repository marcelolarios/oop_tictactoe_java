/*************************************************** 
  Project
  - tic tac toe oop
  - jogo da velha poo

  Written by Marcelo Larios 2022MAR
  
  AGLP-3.0 license, all text above must be included in any redistribution
****************************************************/ 
package jdv;

public class Principal {

	public static void main(String[] args) {

		System.out.println("\n*** Jogo da velha ***");
		
		Tabuleiro tb = new Tabuleiro();
		
		tb.rodada();
	}
}
