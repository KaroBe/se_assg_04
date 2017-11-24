
public class Bracets extends Expression
{
	private BinaryExpression binEx;
	
	public int computeExpression()
	{
		return this.binEx.computeExpression();
	}
}
