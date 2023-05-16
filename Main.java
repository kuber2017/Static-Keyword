/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class H {
    static int a = 342;
    static void offend(){
      System.out.println(a);
       
    }
};
public class Main
{
	public static void main(String[] args) {
		H myobj1  = new H();
		  System.out.println(H.a);
		  
		H myobj2 =  new H();
		System.out.println(H.a);
		
		H myobj3  = new H();
		System.out.println(H.a);
	}
}
