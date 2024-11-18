@FunctionalInterface
interface addable{
	int add(int a ,int b);
}
public class LambdaExpressionMultipleParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     addable a=(x,y)-> x+y;
     System.out.println("add "+a.add(10,20));
     
     addable a2=(int x,int y)->{
    	 return x+y;
     };
     System.out.println("add "+a2.add(5,4));
     
	}

}
