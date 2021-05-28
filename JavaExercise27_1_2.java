import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

// class SLenComp implements Comparator<String>{
// 	@Override
// 	public int compare(String s1, String s2){
// 		return s1.length() - s2.length();
// 	}
// }

class JavaExercise27_1_2{
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");

//		SLenComp cmp = new SLenComp();
		Collections.sort(list, (s1, s2)->{return s1.length() - s2.length();});
		System.out.println(list); 
	}
}
