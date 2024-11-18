
@FunctionalInterface
interface Sayable1{
  abstract	String hello(String name);
}
public class LambdaExpressionWithSingleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable1 s= name ->{
			return "hello"+ name;
		};
		System.out.println(s.hello("he"));

	}

}
