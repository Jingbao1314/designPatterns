package decorator.practice;

public abstract class AbstractExpansionDecorator implements ExpansionDecorator{
    protected Gun gun;

    public AbstractExpansionDecorator(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void fire(){
        gun.fire();
    }
}
