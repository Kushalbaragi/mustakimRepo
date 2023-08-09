package implementation;

public class Main{
    public static void main(String []args){
        String str="My name is Mustakim";
        String str1[]=str.split(" ");
        String rev="";
        String full="";
        for (String s:str1) {
            System.out.println(s);
            for (int i=s.length()-1;i>=0;i--){
                rev+=s.charAt(i);
            }
            rev+=" ";
        }
        System.out.println(rev);
        System.out.println(full);

    }
}
