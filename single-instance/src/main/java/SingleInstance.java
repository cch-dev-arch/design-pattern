/**
 * @author chenc
 * @version 1.0.0
 * @description
 * @date 2021/8/14
 */
public class SingleInstance {
    private static volatile SingleInstance instance;
    private SingleInstance(){}
    public static SingleInstance getInstance(){
        if(instance==null){
            synchronized (SingleInstance.class){
                if(instance==null){
                    instance=new SingleInstance();
                }
            }
        }
        return instance;
    }
}
