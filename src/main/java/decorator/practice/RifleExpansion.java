package decorator.practice;

public class RifleExpansion extends AbstractExpansionDecorator{
    public RifleExpansion(Gun gun) {
        super(gun);
    }

    @Override
    public void expansion() {
        System.out.println("弹夹容量  +  10");
    }
}
