
public class Multiplication extends BinaryExpression
{	
	public Multiplication(Expression x, Expression y)
	{
		super(x, y);
	}
	
	public int computeExpression()
	{
		return (this.a.computeExpression() * this.b.computeExpression());
	}
}