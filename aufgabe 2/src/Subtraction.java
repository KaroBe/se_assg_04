
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
	
	public static void main(String [ ] args)
	{
		Literal test1 = new Literal(6);
		Literal test2 = new Literal(3);
		Subtraction test3 = new Subtraction(test1, test2);
		
		System.out.print(test3.computeExpression());
	}
}