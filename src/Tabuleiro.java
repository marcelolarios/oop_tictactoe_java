package jdv;

public class Tabuleiro {
    	
	private String quem;
	Storage sto = new Storage();
	Jogador jh = new Humano("x"); 
    Jogador jc = new Computador("o");//●
	private String[] v = sto.getJogo();
    
    public void rodada(){ // acum score futuro
    
		while(true) {
											
			if(!partida()) {
			
				System.out.println(aviso(3)); //interrup
				return;
			} 
			System.out.println(aviso(4)); //Nova partida
		}
    }

	private boolean partida() { //1 completa
        
        sto.zera();
		while (true){ 
			
			Jogador j = (sto.getVez())? jc:jh;
			quem = j.getTipo(); 	
			if(j instanceof Humano) mostra(); //aviso proximo a jogar
			if(!lance(j)) return false;
			if(compara()) break;
			sto.setVez();
		}
		mostra();
		return true;
	}
	
	private boolean lance(Jogador j) {
	
		while(true) {

			int casa = j.joga();
			if(casa == 0) return false;
			if(v[casa] == " ") {

				sto.setJogo(casa, j.getTipo());
				break;
			}
		}
		return true;
    }
			
	private boolean compara() {
		
		int[][] possibs = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {7, 4, 1}, {8, 5, 2}, {9, 6, 3}, {1, 5, 9}, {7, 5, 3}};
		
		for (int i=0; i<possibs.length; i++) {
			int pb[] = possibs[i];
			if( v[pb[0]] == v[pb[1]] &&
				v[pb[1]] == v[pb[2]] && v[pb[2]]!= " "){
			
				sto.setResultado(1); //há vencedor
				return true;
			} 
		}
		for (int i=1; i<10; i++) { //começa do 1 senão é loop infinito
		
			if(v[i] == " ")  return false;
		}
		sto.setResultado(2); // empatou
		return true;
	}
		
	private void mostra() {
			
		System.out.println("\n7|8|9\t\t|" + v[7] + "|" + v[8] + "|" + v[9] + "|   " + aviso(sto.getResultado()));
		System.out.println(  "4|5|6\t\t|" + v[4] + "|" + v[5] + "|" + v[6] + "|");
		System.out.println(  "1|2|3\t\t|" + v[1] + "|" + v[2] + "|" + v[3] + "|");
	}
	
	private String aviso(int i){
		
		switch(i) {
			case 1: return "jogador \"" + quem + "\" venceu!";
			case 2: return "Empatou!";
			case 3: return "\n*** Jogo Interrompido ***\n";
			case 4: return "\n\n*** Nova partida ***";
			default:  return "jogador \"" + quem + "\", sua vez";
		}
	}
}
