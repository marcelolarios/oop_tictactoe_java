package jdv;

public abstract class Jogador {
	
	private String tipo; //var de instãncia

    public Jogador(String tipo){    // construtor
        this.tipo = tipo; 
    }
    
    public abstract int joga(); //se não tiver, j não joga
    
    public String getTipo() {
        return tipo;
    }

}
