package decorator.practice;

public class Test {
    public static void main(String[] args) {
        Gun gun=new M4();
        ExpansionDecorator decorator=new RifleExpansion(gun);
        decorator.expansion();
        decorator.fire();
    }
}
