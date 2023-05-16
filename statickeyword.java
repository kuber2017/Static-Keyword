
class B{
    public 
    static int a= 729;
    static String b =  "john";
    static boolean yes = true;
    
    
    static boolean option(){
        System.out.println(yes);
        return yes;
    }
};
public class Main
{
	public static void main(String[] args) {
		B myobj = new B();
		B.option();
	}
}
