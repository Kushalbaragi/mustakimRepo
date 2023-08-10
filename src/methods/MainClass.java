interface A{
    void msg();
}
interface B{
    void msg();
    //{System.out.println("Welcome");}
}

interface c extends A,B{

}
class C implements A,B{//suppose if it were


    public static void main(String args[]){
        C obj=new C();
        obj.msg();//Now which msg() method would be invoked?
    }

    @Override
    public void msg() {

    }
}

class MyClass{
    int a=20;
   static int b=20;

    public static void access(){
        System.out.println(b);
    }

    public static void main(String[] args) {
        access();
        System.out.println(new MyClass().a);
    }
}