package innerclasses;

class MainClass{
    int x=20;

    void add(){
        x=x+20;
        System.out.println("x : "+x);
    }
    public void finalize(){
        System.out.println("Object is garbage collected..!");
    }

    public static void main(String[] args) {
        new MainClass().add();
        System.gc();
        new MainClass().add();
        System.gc();
    }
}
