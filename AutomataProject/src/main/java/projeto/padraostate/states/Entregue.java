package projeto.padraostate.states;

import projeto.padraostate.pedido.Pedido;
import projeto.padraostate.state.State;

public class Entregue implements State {

    public void next(Pedido ped) {
    	ped.setState(new Finalizado());
    	ped.setEstadoFinal(true);
    }
    
	public void previous(Pedido ped) {
		System.out.println("Esse estado n�o possui estado anterior");
	}
	
	public void impedir(Pedido ped) {
		System.out.println("N�o � poss�vel impedir esse pedido.");	
	}

    public void printStatus() {
    	System.out.println("Seu pedido foi entregue com sucesso");
    }
}
