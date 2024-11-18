import java.util.Optional;

public class OptinalClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] =new String[5];
		arr[3]="hello namu";
		Optional<String>result=Optional.ofNullable(arr[3]);
		if (result.isPresent()) {
			String uppercase=arr[3].toUpperCase();
			System.out.println(uppercase);
			
		}
		else {
			System.out.println("not present ...");
		}
		

	}

}
