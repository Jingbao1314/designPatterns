package prototype;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog eat done");
    }

    public Dog(){
        type = "Dog";
    }
}
