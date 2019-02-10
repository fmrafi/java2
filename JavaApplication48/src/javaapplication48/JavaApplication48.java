package javaapplication48;

public class JavaApplication48 {

    public static void main(String[] args) {
        
        StringBuffer a=new StringBuffer("masud");
        StringBuffer b=new StringBuffer("dusaM");
        b.reverse();
          
          System.out.println("Reverse:"+b);
        
       
        String c=ToLowerCase(a);
         String d=ToLowerCase(b);
         if(d.equals(c))  System.out.println("Mached");
          else
         System.out.println(" Not Mached");

             


        
      
       
        
    }

    public static String ToLowerCase(StringBuffer a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String ToUpperCase(StringBuffer a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    

