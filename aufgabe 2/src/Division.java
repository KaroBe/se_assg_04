
public class Division extends BinaryExpression
{
	public Division(Expression x, Expression y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a.computeExpression() / this.b.computeExpression());
	}
}