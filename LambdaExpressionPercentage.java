@FunctionalInterface

interface percentageCal {
	 double percentage(double m1,double m2,double m3);
}
public class LambdaExpressionPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		percentageCal c=(x,y,z)->(x+y+z)/3;
		System.out.println("percentage "+c.percentage(55,44,88));

	}

}
