package prototype;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public abstract class Animal implements Cloneable{
    private int id;
    protected String type;

    public abstract void eat();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
