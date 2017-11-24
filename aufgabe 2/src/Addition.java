
public class Addition extends BinaryExpression
{
	public Addition(int x, int y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a + this.b);
	}
}
