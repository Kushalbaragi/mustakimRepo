package privatemethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrivateMethods {
    private void play(){
        System.out.println("Calling Private methods..!");
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c=Class.forName("privatemethods.PrivateMethods");
        Object o=c.newInstance();
        Method method=c.getDeclaredMethod("play",null);
        method.setAccessible(true);
        method.invoke(o,null);
    }
}
