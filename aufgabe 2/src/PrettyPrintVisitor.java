
public class PrettyPrintVisitor extends Visitor
{	
	public PrettyPrintVisitor(Expression e)
	{
		super(e);
	}
	
	public void visit()
	{
		if(this.exp instanceof Bracets)
		{
			System.out.print("( ");
			Expression exp1 =((Bracets)exp).getExpression();
			this.exp = exp1; 
			visit();
			System.out.print(" )");
		}
		else if(this.exp instanceof Literal)
		{
			System.out.print(((Literal)exp).getExpression());
		}
		else if(this.exp instanceof BinaryExpression)
		{
			if(this.exp instanceof Addition)
			{
				Expression exp1 = ((BinaryExpression)exp).getExpressionA();
				Expression exp2 = ((BinaryExpression)exp).getExpressionB();
				this.exp = exp1;
				visit();
				System.out.print(" + ");
				this.exp = exp2;
				visit();
			}
			else if(this.exp instanceof Subtraction)
			{
				Expression exp1 = ((BinaryExpression)exp).getExpressionA();
				Expression exp2 = ((BinaryExpression)exp).getExpressionB();
				this.exp = exp1;
				visit();
				System.out.print(" - ");
				this.exp = exp2;
				visit();
			}
			else if(this.exp instanceof Multiplication)
			{
				Expression exp1 = ((BinaryExpression)exp).getExpressionA();
				Expression exp2 = ((BinaryExpression)exp).getExpressionB();
				this.exp = exp1;
				visit();
				System.out.print(" * ");
				this.exp = exp2;
				visit();
			}
			
			else if(this.exp instanceof Division)
			{
				Expression exp1 = ((BinaryExpression)exp).getExpressionA();
				Expression exp2 = ((BinaryExpression)exp).getExpressionB();
				this.exp = exp1;
				visit();
				System.out.print(" / ");
				this.exp = exp2;
				visit();
			}
		}
	}
	
	public static void main(String [ ] args)
	{
		Literal test1 = new Literal(1);
		Literal test2 = new Literal(6);
		Literal test3 = new Literal(3);
		Addition test4 = new Addition(test1, test2);
		Bracets test5 = new Bracets(test4);
		Division test6 = new Division(test2, test3);
		Multiplication test7 = new Multiplication(test5, test6);
		
		/*PrettyPrintVisitor visitor1 = new PrettyPrintVisitor(test1);
		visitor1.visit();
		PrettyPrintVisitor visitor2 = new PrettyPrintVisitor(test2);
		visitor2.visit();
		PrettyPrintVisitor visitor3 = new PrettyPrintVisitor(test3);
		visitor3.visit();
		PrettyPrintVisitor visitor4 = new PrettyPrintVisitor(test4);
		visitor4.visit();
		PrettyPrintVisitor visitor5 = new PrettyPrintVisitor(test5);
		visitor5.visit();
		PrettyPrintVisitor visitor6 = new PrettyPrintVisitor(test6);
		visitor6.visit();*/
		PrettyPrintVisitor visitor7 = new PrettyPrintVisitor(test7);
		visitor7.visit();
		
	}
}
