package testNormalClass;

public class Normal
{
	
	private Normal()
	{
		System.out.println("I am in Normal class");
	}
	
	public static void main(String[] args) 
	{
		Normal obj1 = new Normal();
		Normal obj2 = new Normal();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
