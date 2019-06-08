package abstractFactory;

import abstractFactory.Factory.Animal;
import abstractFactory.Factory.Plant;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public  abstract class AbstractFactory {
    public abstract  Animal getAnimal(String animal);
    public abstract  Plant  getPlant(String plant);
}
