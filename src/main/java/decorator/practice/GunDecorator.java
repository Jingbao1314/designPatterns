package decorator.practice;

public abstract class GunDecorator{
    protected Gun gun;

    public GunDecorator(Gun gun) {
        this.gun = gun;
    }

    public void fire(){
        gun.fire();
    }
}
