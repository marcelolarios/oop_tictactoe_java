package jdv;
import java.util.Random;

public class Computador extends Jogador {

    // construtor
    public Computador(String tipo){
        super(tipo); //tem que ser 1a linha
    }
    
	public int joga(){
		
		Random rnd = new Random();
		int p = rnd.nextInt(9)+1;
		return p; 
	}
	
}
