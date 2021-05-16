import java.util.Arrays;

class Person implements Comparable{
	private String name;
	private int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object obj){
		Person p = (Person)obj;
		return this.name.compareTo(p.name);
	}

	@Override
	public String toString(){
 		return name + ":"+age;
	}
}

class JavaExercise20_3{
	public static void main(String[] args){
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee", 29);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);

		try{
			int idx = Arrays.binarySearch(ar, new Person("Lqwe", 15));
			System.out.println(ar[idx]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("없음");
		}
	}
}
