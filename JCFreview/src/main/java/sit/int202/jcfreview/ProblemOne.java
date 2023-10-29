package sit.int202.jcfreview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProblemOne {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>(125, 0.75f);
        studentSet.add(new Student(10001,"Somsri",3.25));
        studentSet.add(new Student(10002,"Somsak",3.0));
        studentSet.add(new Student(10009,"Somchai",3.26));
        studentSet.add(new Student(10007,"Somsiri",3.25));
        studentSet.add(new Student(10037,"Srisopaphan",3.25));
        for (Student s : studentSet) {
            System.out.println(s+ " ->"+ s.hashCode());
        }


        Set<Student> studentSet1 = new TreeSet<>();
        studentSet1.add(new Student(10001, "Somsri", 3.25));
        studentSet1.add(new Student(10002, "Somsak", 3.0));
        studentSet1.add(new Student(10009, "Somchai", 3.26));
        studentSet1.add(new Student(10007, "Somsiri", 3.25));
        studentSet1.add(new Student(10037, "Srisopaphan", 3.25));
        System.out.println("----------");
        for (Student s : studentSet1) {
            System.out.println(s + "->" + s.hashCode());
        }
        System.out.println("---- Sort by gpax Desc ---------");
        List<Student> studentsSorted = studentSet1.stream().sorted(Student.SORT_BY_GPAX).toList();
        for (Student s : studentsSorted) {
            System.out.println(s + " ->" + s.hashCode());
        }
        System.out.println("---- Sort by Name Desc ---------");
        List<Student> studentsSortedName = studentSet1.stream().sorted(Student.SORT_BY_NAME).toList();
        for (Student s : studentsSortedName) {
            System.out.println(s + " ->" + s.hashCode());
        }
    }
}
