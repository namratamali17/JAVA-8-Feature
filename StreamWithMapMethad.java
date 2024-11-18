import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMapMethad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mark=new ArrayList<>();
		mark.add(45);
		mark.add(75);
		mark.add(70);
		mark.add(55);
		System.out.println("mark before greade"+mark);
		// we add the 10 gread mark
		List<Integer> updateMark=mark.stream().map(str->str+10).collect(Collectors.toList());
		System.out.println("update mark list is"+updateMark);
	}

}
