package co.unicauca.ordermanagement.domain.states;

import co.unicauca.ordermanagement.domain.Order;

/**
 * Estado perdido
 *
 * @author Astrid Carolina Cruz, Braian Alexis Bastidas
 */
public class LostState extends OrderState {

    /**
     * @param order to be processed
     */
    public LostState(Order order) {
        super(order);
    }

    /**
     * @return description
     */
    @Override
    public String getStateDescription() {
        return "Perdida";
    }

    /**
     * @return nuevo estado como CanceledState
     */
    @Override
    public OrderState cancel() {
        return new CanceledState(getOrder());
    }

    /**
     * @param number
     * @return nuevo estado como DeliveredState
     */
    @Override
    public OrderState orderSendOut() {
        return new SendState(getOrder());
    }
}
