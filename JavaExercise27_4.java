import java.util.function.BiConsumer;

class Box<T>{
	private T ob;
	public void set(T o){ob = o;}
	public T get(){return ob;}
}

class JavaExercise27_4{
	public static void main(String[] args){
		BiConsumer<Box<Integer>,Box<Double>> c = (b1, b2)->{
			b1.set(10);
			b2.set(3.14); 
		};

		Box<Integer> box1 = new Box<>();
		Box<Double> box2 = new Box<>();
		c.accept(box1, box2);

		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
