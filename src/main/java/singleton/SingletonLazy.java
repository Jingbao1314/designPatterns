package singleton;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public class SingletonLazy {
    public static SingletonLazy singleton;
    private SingletonLazy(){}
    public static SingletonLazy getSingleton(){
        if(singleton==null){
            singleton=new SingletonLazy();
        }
        return singleton;
    }
}
