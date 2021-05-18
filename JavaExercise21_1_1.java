class DBox<L, R>{
	private L left;
	private R right;
	public void set(L a, R b){
		left = a;
		right = b;
	}
	@Override
	public String toString(){
		return left + " & " + right;
	}
}

class DDBox<U, D>{
	private U up;
	private D down;
	public void set(U a, D b){
		up = a;
		down = b;
	}
	@Override
	public String toString(){
		return up + "\n" + down;
	}
}

class JavaExercise21_1_1{
	public static void main(String[] args){
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		DDBox<DBox<String, Integer>, DBox<String, Integer>> ddbox = new DDBox<>();
		ddbox.set(box1, box2);
		System.out.println(ddbox);
	}
}
