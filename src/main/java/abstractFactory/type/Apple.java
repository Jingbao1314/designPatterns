package abstractFactory.type;

import abstractFactory.Factory.Plant;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public class Apple implements Plant{
    @Override
    public void print() {
        System.out.println("This is Apple (Plant)");
    }
}
