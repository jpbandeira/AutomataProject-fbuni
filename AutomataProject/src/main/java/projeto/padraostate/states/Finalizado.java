package projeto.padraostate.states;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import projeto.padraostate.pedido.Pedido;
import projeto.padraostate.state.State;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Finalizado implements State {

    public void seguirFluxo (Pedido pedido) {
    	System.out.println("Erro: Seu pedido j� foi finalizado.");
    }
    
	public void voltarFluxo (Pedido ped) {
		System.out.println("Erro: Esse estado n�o possui estado anterior.");
	}
	
	public void impedir (Pedido ped) {
		System.out.println("Erro: N�o � poss�vel impedir esse pedido.");	
	}

    public void printarStatus () {
    	System.out.println("Sucesso: Pedido finalizado!");
    }
}
