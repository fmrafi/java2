
package interface4;


public class Interface4 {

   
    public static void main(String[] args) {
       Rolendra ob=new Rolendra();
       ob.method1();
       ob.method2();
       ob.method3();
    }
}
interface MehediInterface1{
    public void method1();
}
interface MehediInterface2{
    public void method2();
}
interface MehediInterface3 extends MehediInterface2,MehediInterface1{
    public void method3();
}
class Rolendra implements MehediInterface3{
    int hadith,quain,cost;
    
    
     public void method1(){
         
         quain=5;
     }
    
     public void method2(){

        hadith=100;
}
   public void method3(){
        cost=quain*hadith;
        
     System.out.println("Total prize="+cost);
     
     
     }  
}