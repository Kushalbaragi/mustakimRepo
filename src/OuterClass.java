public class OuterClass {

    private static int x=20;

     class A {

    }
   public static void getValue(){

       int y=20;
       class InnerClass{
           public int z;
           public int b;

           public InnerClass(){
               z=4;
               b=z+2;
           }
           private int getAll(){
               return z+b+y+x;
           }

       }
       InnerClass ic=new InnerClass();
       int all = ic.getAll();
       System.out.println(all);
   }


    public static void main(String[] args) {
        getValue();

    }
}
