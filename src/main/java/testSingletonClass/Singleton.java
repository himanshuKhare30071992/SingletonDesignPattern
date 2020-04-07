package testSingletonClass;

public class Singleton 
{
	private Singleton()
	{
		System.out.println("I am in Singleton class");
	}

	static Singleton reference;
	
	public static Singleton createObject()
	{
		if(reference == null)
		{
			reference = new Singleton();
		}
		return reference;
	}
	
	
	public static void main(String[] args) 
	{
		Singleton obj1 =Singleton.createObject();
		Singleton obj2 =Singleton.createObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}
