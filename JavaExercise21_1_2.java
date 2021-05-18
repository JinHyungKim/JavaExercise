class DBox<L, R>{
	private L left;
	private R right;
	public void set(L a, R b){
		left = a;
		right = b;
	}
	@Override
	public String toString(){
		
		return left +  + right;
	}
}

class JavaExercise21_1_2{
	public static void main(String[] args){
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);
		DBox<DBox<String, Integer>, DBox<String, Integer>> box3 = new DBox<>();
		box3.set(box1, box2);
		System.out.println(box3);
	}
}
