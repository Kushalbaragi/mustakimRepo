interface AnonymousClass {
   public int x=20;
    public void getValue();
}
class MainClass{
    public static void main(String[] args) {
        AnonymousClass an=new AnonymousClass(){

            @Override
            public void getValue() {
                System.out.println(x);
            }
        };
        an.getValue();
    }
}
