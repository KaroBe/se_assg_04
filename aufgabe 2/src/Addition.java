
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
	
	public static void main(String [ ] args)
	{
		Literal test1 = new Literal(6);
		Literal test2 = new Literal(3);
		Addition test3 = new Addition(test1, test2);
		
		System.out.print(test3.computeExpression());
		System.out.print(((Literal) test3.getExpressionA()).getExpression());
		System.out.print(((Literal) test3.getExpressionB()).getExpression());
	}
}
