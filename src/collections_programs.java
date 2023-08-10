import java.util.*;

class Key implements Comparable<Key>{

    private String key;
    public Key(String key){
        this.key=key;
    }
    public String printKey(){
        return this.key;
    }
    @Override
    public int compareTo(Key o) {
        return key.compareTo(o.key);
    }
}
class collections_programs {
    public static void main(String[] args) {

        Map<Key,String> map=new TreeMap<>();
        map.put(new Key("121"),"Mustakim");
        map.put(new Key("122"),"Mohan");
        map.put(new Key("123"),"Kushal");
        map.put(new Key("124"),"Kaashim");

//        By using for Each Loop
        System.out.println("1.Using for each loop");
        for (Map.Entry<Key,String> entry: map.entrySet()
             ) {

            System.out.println(entry.getKey().printKey()+ " "+entry.getValue());
        }

        System.out.println("2.Using for each Iterator loop");
        //Using foreach iterator
        map.entrySet().forEach(a-> System.out.println(a.getKey().printKey()+" "+a.getValue()));

        System.out.println("3.Using Iterator interface ");
        Iterator<Map.Entry<Key,String>> itr=map.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getKey().printKey()+" "+itr.next().getValue());
        }
    }
}
