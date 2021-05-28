import java.util.function.BiPredicate;

class JavaExercise27_3{
	public static void main(String[] args){
		BiPredicate<String, Integer> conv = (String s, Integer n)->	s.length()>n;

		if(conv.test("Robot", 3))
			System.out.println("문자열 길이 3초과");
		else
			System.out.println("문자열 길이 3이하");

		if(conv.test("Box", 3))
			System.out.println("문자열 길이 3초과");
		else
			System.out.println("문자열 길이 3이하");	
	}
}
