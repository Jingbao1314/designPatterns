package builder;

/**
 * @author jijngbao
 * @date 19-5-19
 */
public class BuildClient {
    public static void main(String[] args) {
        Product product=Director.getProduct("dog","apple");
        System.out.println(product.getEatSome());
    }
}
