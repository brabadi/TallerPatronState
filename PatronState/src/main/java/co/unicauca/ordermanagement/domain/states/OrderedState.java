package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 * Estado ordenado
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class OrderedState extends OrderState {

    /**
     * @param order to be processed
     */
    public OrderedState(Order order) {
        super(order);
    }

    /**
     * @return description
     */
    @Override
    public String getStateDescription() {
        return "Ordenada";
    }

    @Override
    public OrderState cancel() {
        return new CanceledState(getOrder());
    }

    /**
     *
     * @param parcelNumber
     * @return
     */
    @Override
    //metodo adicionado
    public OrderState orderedPayed (String parcelNumber){
        if(!getOrder().isPaymentReceived()){
            throw new IllegalStateException("An order should not be send out when payment is not received.");
        }
        return new PayedState(getOrder());
    }
}