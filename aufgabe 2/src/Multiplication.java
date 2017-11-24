
public class Multiplication extends BinaryExpression
{	
	public Multiplication(int x, int y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a * this.b);
	}
}