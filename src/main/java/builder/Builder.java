package builder;

/**
 * @author jijngbao
 * @date 19-5-19
 */
public abstract class Builder {
    public abstract Builder buildName(String name);
    public abstract Builder buildEatSome(String eatSome);
    public abstract Product build();
}
