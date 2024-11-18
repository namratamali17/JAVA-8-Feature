@FunctionalInterface
interface CircleFun{
	float circle(float r);
}
public class LambdaExpressionCircleFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircleFun a=r->3.14f*r*r;
		System.out.println("Area of circle "+a.circle(12));
		
	}

}
