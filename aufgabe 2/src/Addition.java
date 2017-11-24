
public class Addition extends BinaryExpression
{
	public Addition(Expression x, Expression y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a.computeExpression() + this.b.computeExpression());
	}
}
