
public class EvalVisitor extends Visitor
{
	public EvalVisitor(Expression e)
	{
		super(e);
	}
	public void visit()
	{
		int a = this.exp.computeExpression();
		System.out.print(a);
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
		
		/*EvalVisitor visitor1 = new EvalVisitor(test1);
		visitor1.visit();
		EvalVisitor visitor2 = new EvalVisitor(test2);
		visitor2.visit();
		EvalVisitor visitor3 = new EvalVisitor(test3);
		visitor3.visit();
		EvalVisitor visitor4 = new EvalVisitor(test4);
		visitor4.visit();
		EvalVisitor visitor5 = new EvalVisitor(test5);
		visitor5.visit();
		EvalVisitor visitor6 = new EvalVisitor(test6);
		visitor6.visit();*/
		EvalVisitor visitor7 = new EvalVisitor(test7);
		visitor7.visit();
		
	}
}
