package prototype;

import java.util.Hashtable;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public class AnimalCache {
    private static Hashtable<Integer, Animal> animalHashtable
            = new Hashtable();

    public static Animal getAnimal(int id) {
        Animal cachedShape = animalHashtable.get(id);
        return (Animal) cachedShape.clone();
    }


    static {
        Dog dog = new Dog();
        dog.setId(1);
        animalHashtable.put(dog.getId(),dog);

        Cow cow = new Cow();
        cow.setId(2);
        animalHashtable.put(cow.getId(),cow);
    }
}
