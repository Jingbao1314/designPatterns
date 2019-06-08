package abstractFactory.type;

import abstractFactory.Factory.Animal;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public class Dog implements Animal{
    @Override
    public void print() {
        System.out.println("This is dog (Animal)");
    }
}
