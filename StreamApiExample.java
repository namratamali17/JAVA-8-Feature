import java.util.ArrayList;

public class StreamApiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list=new ArrayList<>();
		list.add("namrata");
		list.add("kartikadevi");
		list.add("meghna");
		list.add("rincy");
		list.add("rani");
		
		//without stream api
		int count=0;
		for (String string : list) {
			if (string.length()<7) {
				count++;
			}
		
		}
		System.out.println("String are "+count);
		
		
		//with Stream api
		long count1=list.stream().filter(str->str.length()<7).count();
		System.out.println("String available "+count1);

	}

}
