interface Calculate<T>{
	T cal(T a, T b);
}

class JavaExercise27_1_1{
	public static <T> void calAndShow(Calculate<T> op, T n1, T n2){
		T r = op.cal(n1, n2);
		System.out.println(r);
	}

	public static void main(String[] args){
		calAndShow((a,b)->{return a+b;}, 3, 4);
		calAndShow((a,b)->{return a+b;}, 2.5, 7.1);
		calAndShow((a,b)->{return a-b;}, 4, 2);
		calAndShow((a,b)->{return a+b;}, 4.9, 3.2);
	}
}
