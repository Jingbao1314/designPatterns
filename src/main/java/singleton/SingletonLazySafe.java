package singleton;

/**
 * @author jijngbao
 * @date 19-8-3
 */
public class SingletonLazySafe {
    public static SingletonLazySafe singleton;
    private SingletonLazySafe(){}
    public static SingletonLazySafe getSingleton(){
        if(singleton==null){
            synchronized (singleton){
                if(singleton==null){
                    singleton=new SingletonLazySafe();
                }
            }
        }
        return singleton;
    }
}
