
public class Bracets extends Expression
{
	private Expression binEx;
	
	public Bracets(Expression exp)
	{
		this.binEx = exp;
	}
	
	public int computeExpression()
	{
		return this.binEx.computeExpression();
	}
	
	public Expression getExpression()
	{
		return this.binEx;
	}
	
	public static void main(String [ ] args)
	{
		Literal test1 = new Literal(6);
		Literal test2 = new Literal(3);
		Division test3 = new Division(test1, test2);
		Bracets test4 = new Bracets(test3);
		
		System.out.print(test4.computeExpression());
	}
}
