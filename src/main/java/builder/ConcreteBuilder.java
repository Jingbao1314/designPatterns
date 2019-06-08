package builder;

/**
 * @author jijngbao
 * @date 19-5-19
 */
public class ConcreteBuilder extends Builder{
    private Product product;
    private Element element=new Element();

    @Override
    public Builder buildName(String name) {
        element.setName(name);
        return this;
    }

    @Override
    public Builder buildEatSome(String eatSome) {
        element.setEatSome(eatSome);
        return this;
    }

    @Override
    public Product build() {
        product=new Product();
        product.setName(element.getName());
        product.setEatSome(element.getEatSome());
        return product;
    }

    private static class Element{
        private String name;
        private String eatSome;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEatSome() {
            return eatSome;
        }

        public void setEatSome(String eatSome) {
            this.eatSome = eatSome;
        }
    }
}
