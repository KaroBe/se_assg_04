
public abstract class BinaryExpression  extends Expression
{
	protected Expression a;
	protected Expression b;
	
	//public BinaryExpression () {}
	
	public BinaryExpression(Expression x, Expression y)
	{
		this.a = x;
		this.b = y;
	}
	
	public abstract int computeExpression();
}
