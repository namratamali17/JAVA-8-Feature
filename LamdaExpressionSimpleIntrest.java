@FunctionalInterface
interface SimpleIntrestcal{
	float simpleIntrest(float p,float n,float r);
}
public class LamdaExpressionSimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleIntrestcal c=(p,n,r)->p*n*r/100 ;
		System.out.println("simple intrest is ="+c.simpleIntrest(1055, 5, 45));
		
		
		
	}

}
