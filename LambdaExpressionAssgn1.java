@FunctionalInterface
interface SqureNo{
	int squre(int a);
}
public class LambdaExpressionAssgn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqureNo s=a->a*a;
		System.out.println("squre "+s.squre(5));
		

	}

}
