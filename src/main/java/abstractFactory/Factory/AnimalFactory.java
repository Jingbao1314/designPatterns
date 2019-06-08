package abstractFactory.Factory;

import abstractFactory.AbstractFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public class AnimalFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(String animal) {
        if (animal==null|animal.equals("")){
            return null;
        }
        try {
            Class c=Class.forName("abstractFactory.type."+animal.substring(0,1)
                    .toUpperCase()+animal.substring(1,animal.length()));
            Constructor constructor=c.getConstructor();
            return (Animal) constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Plant getPlant(String plant) {
        return null;
    }
}
