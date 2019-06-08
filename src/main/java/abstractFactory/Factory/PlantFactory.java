package abstractFactory.Factory;

import abstractFactory.AbstractFactory;
import abstractFactory.type.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jijngbao
 * @date 19-5-13
 */
public class PlantFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(String animal) {
        return null;
    }

    @Override
    public Plant getPlant(String plant) {
        if (plant==null|plant.equals("")){
            return null;
        }
        try {
            Class c=Class.forName("abstractFactory.type."+plant.substring(0,1)
                    .toUpperCase()+plant.substring(1,plant.length()));
            Constructor constructor=c.getConstructor();
            return (Plant) constructor.newInstance();
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
}
