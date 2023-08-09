package interview;

abstract class InerviewQuestions {
     abstract int multiply(int a,int b);
}


 class Main{
    public static void main(String[] args) {

        int result=new InerviewQuestions(){
            @Override
             int multiply(int a, int b){
                return a*b;
            }
        }.multiply(2,12);
        System.out.println("Result : "+result);

    }
}
