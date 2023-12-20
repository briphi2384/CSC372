//option 1
import java.util.ArrayList;
import java.util.Comparator;
public class ctaMod6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a student arraylist
		ArrayList<Student> students = new ArrayList<>();
		
		//create Students
		Student stu1 = new Student(132, "James", "Blackberry Ln");
		Student stu2 = new Student(211, "Jerry", "Strawberry Ln");
		Student stu3 = new Student(443, "Anthony", "Peach Ln");
		Student stu4 = new Student (1094, "Becky", "Avocado Ln");
		Student stu5 = new Student(56, "Arnold", "Blueberry Ln");
		Student stu6 = new Student(7896, "Rachel", "Banana Ln");
		Student stu7 = new Student(007, "William", "Cranberry Ln");
		Student stu8 = new Student(89, "Ashley", "Purple Ln");
		Student stu9 = new Student (19, "Mary", "Raspberry Ln");
		Student stu10 = new Student(140, "Cameron", "Carrot Ln");
		
		//add students to array list
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu4);
		students.add(stu5);
		students.add(stu6);
		students.add(stu7);
		students.add(stu8);
		students.add(stu9);
		students.add(stu10);
		
		
		//show original list
		System.out.println("Original list of students: ");
		for (int i =0; i < students.size(); i++) {
			students.get(i).displayStudent();
		}
		
		System.out.println("\n\n\n Sorted by name: ");
		
		//show list sorted by name
		selectionSort(students, new NameComparator());
		for (int i=0; i < students.size(); i++) {
			students.get(i).displayStudent();
		}
		
		
		System.out.println("\n\n\n Sorted by rollno: ");
		//show list sorted by roll no
		selectionSort(students, new RollnoComparator());
		for (int i=0; i<students.size(); i++) {
			students.get(i).displayStudent();
		}
	}//end of main
	

	//recreating the selection sort method
	public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
		
		for (int i = 0; i < students.size()-1; i++) {
			int min = i;
			for (int j = i +1; j< students.size(); j++) {
				if(comparator.compare(students.get(j),students.get(min)) <0) {
					min = j;
				}//end if
			}//end inner for
			
			Student temp = students.get(min);
			students.set(min, students.get(i));
			students.set(i,temp);
			
		}//end outer for
		
	}//end of selection sort method

}//end of ctaMod6


class Student {
	private int rollno;
	private String name;
	private String address;
	
	public Student(){
	rollno=0;
	name = null;
	address=null;
	}
	
	public Student (int rollno, String name, String address) {
		this.rollno = rollno;
		this. name=name;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void displayStudent() {
		System.out.println (getName() +" "+ getRollno() + " " + getAddress());
	}
	
}//end of class student


//this class implements the Comparator class and compares the students
//roll no
class RollnoComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student stu1, Student stu2) {
		return Integer.compare(stu1.getRollno(), stu2.getRollno());
	}
}


//this class compares the students names
class NameComparator implements Comparator<Student>{
	
	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.getName().compareTo(stu2.getName());
	}
	
	
}
