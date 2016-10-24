public class Exercise5{
	
	public static void main(String[] args){
		
		Exercise5 e = new Exercise5();
		e.Launch();
		
		
		
		
	}
	
	public void Launch(){

		
		System.out.print("enter string: ");
		String input = System.console().readLine();
		int hash = input.hashCode();
		System.out.println(hash);
		System.out.println(HashUtilities.shortHash(212));
		
				
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}