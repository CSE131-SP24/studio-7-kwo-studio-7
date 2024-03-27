package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator=denominator;
	}
	
	public Fraction Add(Fraction b)
	{
		Fraction sum = new Fraction(this.numerator*b.denominator+b.numerator*this.denominator, this.denominator*b.denominator);
		return sum;
	}
	
	public Fraction Multiply (Fraction b)
	{
		Fraction product = new Fraction (this.numerator*b.numerator, this.denominator*b.denominator);
		return product;
	}
	
	public Fraction Reciprocal() { 
		return new Fraction(this.denominator, this.denominator);
	}
	
	public Fraction Simplification () {
		if (this.denominator % this.numerator == 0) {
			return new Fraction((this.numerator/ this.numerator), (this.denominator/ this.numerator));
		} else {
			return this; 
		}
	}
	
	
	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator=" + denominator + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
