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