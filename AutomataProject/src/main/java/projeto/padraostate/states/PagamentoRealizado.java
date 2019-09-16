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
public class PagamentoRealizado implements State {

    public void next(Pedido ped) {
        ped.setState(new Aprovado());
    }

    public void previos(Pedido ped) {
        System.out.println();

    }

    public void printStatus() {
        // TODO Auto-generated method stub

    }
}
