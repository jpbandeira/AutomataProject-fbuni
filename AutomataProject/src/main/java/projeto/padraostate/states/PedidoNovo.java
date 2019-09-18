package projeto.padraostate.states;

import projeto.padraostate.pedido.Pedido;
import projeto.padraostate.state.State;
import projeto.padraostate.states.enuns.EstadoAnterior;

public class PedidoNovo implements State {

    public void next (Pedido ped) {
        ped.setState(new PagamentoRealizado());
    }
    
	public void previous(Pedido ped) {
		System.out.println("Esse estado n�o possui estado anterior");
	}
	
	public void impedir (Pedido ped) {
        ped.setState(new Impedido());
        ped.setEstadoAnterior(EstadoAnterior.PEDIDONOVO);
    }

    public void printStatus () {
        System.out.println("Sucesso: Seu pedido foi iniciado.");
    }
    
}
