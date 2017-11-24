
public class Bracets extends Expression
{
	private Expression binEx;
	
	public int computeExpression()
	{
		return this.binEx.computeExpression();
	}
}
