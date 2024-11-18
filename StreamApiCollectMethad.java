import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiCollectMethad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name=Arrays.asList(" raj","Sakshi","karatikadevi","manikarnika");
		
     Stream<String> allname=name.stream();
     Stream<String> longNames=allname.filter(str->str.length()>7);
     System.out.println("using foreach loop");
     longNames.forEach(str->System.out.println(str));
     
     //single line
     List<String>nameCollect=name.stream().filter(str->str.length()>7).collect(Collectors.toList());
     System.out.println("\n using collector");
     nameCollect.forEach(System.out::println);
     }

}
