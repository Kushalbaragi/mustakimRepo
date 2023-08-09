import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassforNameMethods {
    public static void main(String[] args) {

        try{
            String newString=removeSpecialChar("Mus@5-67t0(a!k90i#@m"," ");
            System.out.println("New String : "+newString);
            String str=reverseString("My name is Mustakim.");
            System.out.println("Reversed Word : "+str);
            int num=reverseNumber(1234);
            System.out.println(num);
            Scanner sc=new Scanner(System.in);
            String classname=sc.next();
            Class<?> cls=Class.forName(classname);
            System.out.println("Class Name : "+cls.getName());
            System.out.println("Package Name : "+cls.getPackage());
            Method[] declaredMethods = cls.getDeclaredMethods();
            System.out.println("Methods available are ");
            for (Method method : declaredMethods
            ){
                System.out.println(method.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String reverseString(String s){
        if(s.isEmpty())
            return s;
        return reverseString(s.substring(1))+s.charAt(0);
    }

    public static String removeSpecialChar(String str,String str1){
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'||str.charAt(i)>='a' && str.charAt(i)<='z') {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }
    public static int reverseNumber(int num){
        int rev=0;
        for(;num>0;num=num/10){
            int rem=num%10;
            rev=rev*10+rem;
        }
        return rev;
    }
    public static void wrapthem(){
        Integer x=10;
        Character ch='M';
        String str="New";
    }
}
