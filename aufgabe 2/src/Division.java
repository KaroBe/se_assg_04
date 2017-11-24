
public class Division extends BinaryExpression
{
	public Division(int x, int y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a / this.b);
	}
}