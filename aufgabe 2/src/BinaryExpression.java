
public abstract class BinaryExpression  extends Expression
{
	protected int a;
	protected int b;
	
	//public BinaryExpression () {}
	
	public BinaryExpression(int x, int y)
	{
		this.a = x;
		this.b = y;
	}
	
	public abstract int computeExpression();
}
