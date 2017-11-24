
public class PrettyPrintVisitor extends Visitor
{
	public void visit (Expression exp)
	{
		if(exp instanceof Bracets)
		{
			System.out.print("( ");
			System.out.print(visit(((Bracets)exp).getExpression()));
			System.out.print(" )");
		}
		else if(exp instanceof Literal)
		{
			System.out.print(((Literal)exp).getExpression());
		}
		else if(exp instanceof BinaryExpression)
		{
			if(exp instanceof Addition)
			{
				System.out.print(visit(((Addition)exp).getExpressionA()));
				System.out.print(" + ");
				System.out.print(visit(((Addition)exp).getExpressionA()));
			}
			else if(exp instanceof Subtraction)
			{
				System.out.print(visit(((Addition)exp).getExpressionA()));
				System.out.print(" - ");
				System.out.print(visit(((Addition)exp).getExpressionA()));
			}
			else if(exp instanceof Multiplikation)
			{
				System.out.print(visit(((Addition)exp).getExpressionA()));
				System.out.print(" * ");
				System.out.print(visit(((Addition)exp).getExpressionA()));
			}
			else if(exp instanceof Division)
			{
				System.out.print(visit(((Addition)exp).getExpressionA()));
				System.out.print(" / ");
				System.out.print(visit(((Addition)exp).getExpressionA()));
			}
		}
	}
}
