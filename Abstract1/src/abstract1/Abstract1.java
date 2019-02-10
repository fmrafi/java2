
package abstract1;


public class Abstract1 {

    
    public static void main(String[] args) {
        Mehedi abs=new Mehedi();
        abs.fibonacci();
    }
}
   abstract class Super{
  abstract public void fibonacci();
   }
class Mehedi extends Super{
	public void fibonacci(){
		int i,x=2,y=0,z,n=8;
		
		

		System.out.print(x+" "+y+" ");

		for(i=1;i<=n-2;i++)
		{
			z=x+y;
			x=y;
			y=z;
			System.out.print(z+" ");
                }
        }
}