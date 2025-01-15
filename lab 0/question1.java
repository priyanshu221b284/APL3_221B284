public class question1 {
public static void main(String [] argv){
   Juet.setage(20);
   Juet.setname("Priyansh Saxena");
   System.out.println(Juet.getname());
   System.out.println(Juet.getage());
}    
}

class Juet{
    static int age;
    static String name;
    public static void setname(String name){
        Juet.name=name;
    }
    public static void setage(int age){
        Juet.age=age;
    }
    public static   String getname(){
        return name;
    }
    public static int getage(){
        return age;
    }
}