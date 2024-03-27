package studio7;

public class Complex {

		private double real;
		private double imaginary;
		public Complex (double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
		}
        public Complex add(Complex b) {
        	double newReal = this.real + b.real;
        	double newImaginary = this.imaginary + b.imaginary;
        	return new Complex(newReal, newImaginary);
        	
        }
		// TODO Auto-generated method stub

	}

