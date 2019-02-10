
package multilevel2;


public class Multilevel2 {

   
    public static void main(String[] args) {
        Second ob=new Second();
        ob.bufo1();
        ob.fufo2();
    }
}
abstract class Super1{
    abstract public void bufo1();
    abstract public void fufo2();
}
class Second extends Super1{
    
    public void bufo1(){
    
    System.out.println("this is firdt funcyion1");
}
    public void fufo2(){
    
    System.out.println("this is firdt funcyion1"); 
}
}