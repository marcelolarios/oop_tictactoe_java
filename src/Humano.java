package jdv;
import java.util.*;

public class Humano extends Jogador {

    // construtor
    public Humano(String tipo){
        super(tipo); //tem que ser 1a linha
    }
        
    public int joga(){
	
		String posics = "0123456789";
		Scanner teclado = new Scanner(System.in);
		System.out.print("digite o nr: ");
		String pos = teclado.nextLine();
		if(!pos.equals("")) {
			if(posics.indexOf(pos)>-1) {
	
				return Integer.parseInt(pos);
			}
		}
		return 0;
    }
}
