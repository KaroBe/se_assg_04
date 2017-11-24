
public class EvalVisitor extends Visitor
{
	public void visit (Expression exp)
	{
		int a = exp.computeExpression();
	}
}
