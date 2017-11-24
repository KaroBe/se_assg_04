
public class Subtraction extends BinaryExpression
{
	public Subtraction(Expression x, Expression y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a.computeExpression() - this.b.computeExpression());
	}
}