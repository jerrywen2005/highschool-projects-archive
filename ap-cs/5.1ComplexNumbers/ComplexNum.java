public class ComplexNum implements Comparable<ComplexNum>{
	private double real; // real part
	private double imag; //imaginary part
	private double r;
	private double theta;
	
	//default constructor.
	//set real = imag = 0;
	public ComplexNum()
	{
	real = 0;
	imag = 0;
	}
	
	//specific constructor
	//use this. keyword to set private variables
	//set r and theta by using polarize method
	public ComplexNum(double real, double imag)
	{
		this.real = real;
		this.imag = imag;
		polarize();
	}
	
	// return the real part
	public double getReal(){
		return this.real;
	}
	
	// return the imaginary part
	public double getImag(){
		return this.imag;
	}
	
	//add a complex number to this
	//complex number. return a ComplexNum
	public ComplexNum plus(ComplexNum a)	{
	    double r = this.real + a.getReal();
	    double i = this.imag + a.getImag();
	    ComplexNum num = new ComplexNum(r, i);
	    return num;
	    
	}
	
	//subtract the passed object from the calling object
	// return a complex number.
	public ComplexNum minus(ComplexNum a)
	{
	    double r = this.real - a.getReal();
	    double i = this.imag - a.getImag();
	    ComplexNum num = new ComplexNum(r, i);
	    return num;
	    
		
	}
	
	// multiply the passed object by the calling object
	// return an object that is a complex number
	public ComplexNum times (ComplexNum a)
	{
	    double r = this.real*a.getReal() + -1*this.imag*a.getImag();
	    double i = this.real*a.getImag() + this.imag*a.getReal();
	    ComplexNum num = new ComplexNum(r, i);
	    return num;
	    
	}
	
	// return the complex conjugate of the object
	// return an object that is a complex number
	public ComplexNum conjugate()
	{
	    
	
	ComplexNum num = new ComplexNum(this.real, -imag);
	
	return num;
		
	}
	
	// return the rationalized version of this 
	// complex number.
	// 1/(a+bi) where a+bi is the current object
	public ComplexNum rationalize()
	{
	double d = Math.pow(real, 2) + Math.pow(imag,2);
	double r = real/d;
	double i = imag/d;
	ComplexNum num = new ComplexNum(r, i);
	return num;
	}
	
	// calculate r and theta given a and b
	public void polarize()
	{
		theta = Math.atan((this.imag)/(this.real));
		r = Math.sqrt(Math.pow(this.real, 2.0) + Math.pow(this.imag, 2.0));
		
		
		return;
	}
	
	//used to see if two complex numbers are equal
	// two complex numbers are equal if their real parts
	// and imaginary parts are equal.
	public boolean equals (ComplexNum second){
	if (this.real == second.getReal() && this.imag == second.getImag()) {
	    return true;
	}
	else{
	    return false;
	}
	}
	
	@Override
	public int compareTo(ComplexNum second){
		return 0;
	}
	
	// write code here to return a string
	// in the form a + bi
	public String toString(){
	    
	String comp = "";
	if (imag<0){
	    comp = real + " - " + Math.abs(imag) + "i";
	}
	else{
	    comp = real + " + " + imag + "i";
	}
	return comp;
	}
}