package methods;

public class Main
{
    static int i = 0;

    public static int a(){
        String [] arr = null;
        main(arr);
        return 65;
    }

    public static int b(){

        return a();
    }
    public static void main(String[] args) {

        if(i>0) return;
        i++;
        System.out.print(""+b());


    }
}

