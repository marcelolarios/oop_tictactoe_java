package jdv;
import java.util.*;

public class Storage {

    private String[] jogo = new String[10];
    private boolean vez = true;
    private int resultado = 0; 
			
	public void zera(){
		Arrays.fill(this.jogo, " ");
		resultado = 0; 
	}
    public String[] getJogo() {
        return this.jogo;
    }
	public void setJogo(int casa, String tipo) {
		this.jogo[casa] = tipo;
    }
	public void setVez() {
		this.vez = !this.vez;
    }
    public boolean getVez() {
        return vez;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    public int getResultado() {
        return resultado;
    }
}
