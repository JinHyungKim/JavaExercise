import java.util.HashSet;
import java.util.Objects;

class Person{
	private String name;
	private int age;
	public Person(String n, int a){
		name = n;
		age = a;
	}

	@Override
	public String toString(){
		return name+"("+age+"세)";
	}

	@Override
	public boolean equals(Object obj){
		if(name.equals(((Person)obj).name) && age == ((Person)obj).age)
			return true;
		else
			return false; 
	}

	@Override
	public int hashCode(){
		//return (name.hashCode() + age)/4;
		return Objects.hash(name, age);
	}
}

class JavaExercise23_1{
	public static void main(String[] args){
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("KIM", 11));
		set.add(new Person("KIM", 14));
		set.add(new Person("KIM", 13));
		set.add(new Person("KIM", 16));
		set.add(new Person("LEE", 14));
		set.add(new Person("JANG", 16));
		set.add(new Person("PARK", 41));
		set.add(new Person("KIM", 14));
		set.add(new Person("PARK", 55));
		set.add(new Person("LEE", 14));
		System.out.println("num of instance: "+set.size());

		for(Person p:set)
			System.out.println(p.toString());
	}
}
