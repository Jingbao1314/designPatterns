package abstractFactory;

import abstractFactory.Factory.AnimalFactory;
import abstractFactory.type.Cat;
import abstractFactory.type.Rabbit;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory=new AnimalFactory();
        Cat cat= (Cat) factory.getAnimal("cat");
        cat.print();
        Rabbit rabbit= (Rabbit) factory.getAnimal("rabbit");
        rabbit.print();
    }
}
