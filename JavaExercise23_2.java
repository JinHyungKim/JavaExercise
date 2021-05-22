import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class IntegerComparator implements Comparator<Integer>{
	public int compare(Integer n1, Integer n2){
		return n2-n1;
	}
}

class JavaExercise23_2{
	public static void main(String[] args){
		TreeSet<Integer> tree = new TreeSet<>(new IntegerComparator());
		tree.add(30);
		tree.add(10);
		tree.add(20);
		System.out.println(tree);
	}
}
