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
		return this.name.length() - p.name.length();
	}
	@Override
	public String toString(){
 		return name + ":"+age;
	}
}

class JavaExercise20_2_2{
	public static void main(String[] args){
		Person[] ar = new Person[3];
		ar[0] = new Person("Le", 29);
		ar[1] = new Person("Gooooo", 15);
		ar[2] = new Person("Soo", 37);

		Arrays.sort(ar);
		for(Person e:ar){
			System.out.println(e);
		}
	}
}
