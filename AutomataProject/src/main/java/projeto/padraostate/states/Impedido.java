package projeto.padraostate.states;

import projeto.padraostate.pedido.Pedido;
import projeto.padraostate.state.State;

public class Impedido implements State {

    public void seguirFluxo (Pedido ped) {
        ped.setState(new Cancelado());
        ped.setEstadoFinal(true);
    }

    public void voltarFluxo (Pedido ped) {
    	if (ped.getEstadoAnterior().getCodigo() == 1) {
            ped.setState(new PedidoNovo());
        } else if (ped.getEstadoAnterior().getCodigo() == 2) {
            ped.setState(new PagamentoRealizado());
        } else if (ped.getEstadoAnterior().getCodigo() == 3) {
        	ped.setState(new Aprovado());
        }
    }
    
	public void impedir (Pedido ped) {
		System.out.println("Erro: Esse pedido já esta em impedimento.");
	}

    public void printarStatus () {
    	System.out.println("Sucesso: Seu pedido esta pendente.");
    }
}
