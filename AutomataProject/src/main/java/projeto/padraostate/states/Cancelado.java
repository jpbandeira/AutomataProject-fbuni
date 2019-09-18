package projeto.padraostate.states;

import projeto.padraostate.pedido.Pedido;
import projeto.padraostate.state.State;

public class Cancelado implements State {

    public void next(Pedido pedido) {
    	System.out.println("ERR: Seu pedido j� foi finalizado");
    }

    public void previous(Pedido pedido) {
    	System.out.println("Esse estado n�o possui estado anterior");
    }

	public void impedir(Pedido ped) {
		System.out.println("N�o � poss�vel impedir esse pedido.");	
	}    
    
    public void printStatus() {
    	System.out.println("Pedido cancelado :(");
    }
	
}
