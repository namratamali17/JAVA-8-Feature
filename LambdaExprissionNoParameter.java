@FunctionalInterface
interface Sayable{
	String sayHello();
}
public class LambdaExprissionNoParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s=()->{
			return "hello";
		};
     System.out.println(s.sayHello());
	}

}
