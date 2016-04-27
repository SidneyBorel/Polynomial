
public class Term {

	private int coef;
	private int deg;

	public Term(int coefficient, int degree) {
		// TODO Auto-generated constructor stub
		// coefficient * x^degree
		coef = coefficient;
		deg = degree;
	}
	
	public String toString()
	{
		String s;
		if (coef < 0)
		{
			if (deg ==  0) return (" - " + coef);
			if (deg ==  1) return (" - " + coef + "x");
			s = " - " + coef + "x^(" + deg + ")";
			return s;
		}
		if (deg ==  0) return ("" + coef);
		if (deg ==  1) return (coef + "x");
	    s = coef + "x^(" + deg + ")";
	    return s;
	}
	
	public int getCoefficient()
	{
		return coef;
	}
	
	public int getDegree()
	{
		return deg;
	}
}

