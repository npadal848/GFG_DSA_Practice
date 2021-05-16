package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Sort student based on Mark
 * If masks are same sort as per name
 */
public class SortStudent {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>(Arrays.asList(new Student("Ryan", 80),new Student("Anil", 50), new Student("Ayan", 80),
				new Student("Piyush", 50), new Student("Ramesh", 80)));

		Collections.sort(students, new Student());
		System.out.println(students);
	}
}

class Student implements Comparator<Student> {
	private String name;
	private int mark;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public int compare(Student student1, Student student2) {
		if (student1.mark == student2.mark) {
			return student1.name.compareTo(student2.name);
		}
		return student1.mark - student2.mark;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}

}
