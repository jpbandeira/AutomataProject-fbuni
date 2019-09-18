package projeto.padraostate.states;

import projeto.padraostate.pedido.Pedido;
import projeto.padraostate.state.State;
import projeto.padraostate.states.enuns.EstadoAnterior;

public class Aprovado implements State {

    public void next(Pedido ped) {
    	ped.setState(new Trasportado());
    }
    
	public void previous(Pedido ped) {
		System.out.println("Esse estado n�o possui estado anterior");
	}
	
    public void impedir(Pedido ped) {
    	ped.setState(new Impedido());
    	ped.setEstadoAnterior(EstadoAnterior.APROVADO);
    }
	
    public void printStatus() {
    	System.out.println("Seu pedido foi aprovado com sucesso");
    }

}
