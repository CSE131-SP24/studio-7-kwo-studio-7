package studio7;

public class Die {

	private int sides; 
	public Die (int sides) {
		this.sides = sides;
		
	}
	
	public int roll () {
		return (int)(Math.random() * (sides)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die joe = new Die(10);
		
		
		System.out.println(joe.roll());
		

	}

}
