package variables;

class Test
{
    public static final int param=20;
    static
    {
        System.out.println("Why I am not executing ");
    }
    public static void my(){
        final String name = new String();
        System.out.println("I am Static method..!");
        System.out.println(param);
        System.out.println(name.toString());
    }

}

public class Demo
{
    public static void main(String[] args)
    {
        System.out.println(Test.param);
        Test.my();
    }
}
