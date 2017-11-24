
public class Literal extends Expression
{
	private int a;

	public Literal(int x)
	{
		this.a = x;
	}
	
	public int computeExpression()
	{
		return a;
	}
	
	public int getExpression()
	{
		return this.a;
	}
}