
public class Subtraction extends BinaryExpression
{
	public Subtraction(int x, int y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a - this.b);
	}
}