
public abstract class Visitor 
{
	protected Expression exp;
	
	public Visitor(Expression e)
	{
		this.exp = e;
	}
	
	public abstract void visit();
}
