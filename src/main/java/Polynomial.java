import java.util.*;

public class Polynomial {

	ArrayList<Term> list;
	public Polynomial() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Term>();
	}
	
	public void insert(int c, int d)
	{
		Term newTerm = new Term(c, d);
		for(int i = 0; i < list.size(); i++)
		{
			
			if(d > list.get(i).getDegree())
			{
				list.add(i, newTerm);
				break;
			}
			else if(i = (list.size() - 1))
			{
				list.add(newTerm);
				break;
			}
		}
		
	}
	
	public void delete(int c, int d)
	{
		for(int i = 0; i < list.size(); i++)
		{
			if((list.get(i).getCoefficient() == c) && (list.get(i).getDegree() == d))
			{
				remove(i);
			}	
		}
	}
	
	public int product()
	{
		int product = 1;
		for(Term t: list)
		{
			product = product * t.getCoefficient() * t.getDegree();
		}
		return product;
	}
	
	public void reverse()
	{
		
	}
	
	public String toString()
	{
		String s = "";
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getCoefficient() < 0)
			{
				if(i == 0) s = list.get(i).toString();
				else s = s + list.get(i).toString();
				
			}
			else if(list.get(i).getCoefficient() > 0)
			{
				if(i == 0) s = list.get(i).toString();
				else s = s + " + " + list.get(i).toString();
			}
		}
		return s;
	}

}
