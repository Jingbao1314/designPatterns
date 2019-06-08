package abstractFactory.type;

import abstractFactory.Factory.Animal;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public class Rabbit implements Animal{
    @Override
    public void print() {
        System.out.println("This is Rabbit (Animal)");
    }
}
