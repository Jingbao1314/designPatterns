package prototype;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public class Cow extends Animal{
    @Override
    public void eat() {
        System.out.println("cow eat grass");
    }

    public Cow(){
        type = "Cow";
    }



}
