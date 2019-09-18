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

    public void next(Pedido pedido) {
    	System.out.println("ERR: Seu pedido j� foi finalizado");
    }

    public void printStatus() {
    	System.out.println("Pedido finalizado");
    }
}
