package builder;

/**
 * @author jijngbao
 * @date 19-5-19
 */
public class Director {
    private static Builder builder = new ConcreteBuilder();
    public static Product getProduct(String name,String eatSome) {
        return builder.buildName(name).buildEatSome(eatSome).build();
    }
}
