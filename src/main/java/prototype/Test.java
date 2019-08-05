package prototype;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public class Test {
    public static void main(String[] args) {
        Animal dog=AnimalCache.getAnimal(1);
        dog.eat();
    }
}
