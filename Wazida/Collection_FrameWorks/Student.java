package CollectionTypes;

public class Student implements Comparable<Student>{
   private String name;
    private int marks;

 // Constructor
     public Student(String name, int marks) {
         this.name = name;
         this.marks = marks;
     }

     // Getters
     public String getName() {
         return name;
     }

     public int getMarks() {
         return marks;
     }

     // Implement compareTo for natural ordering by marks
     @Override
     public int compareTo(Student other) {
         return Integer.compare(this.marks, other.marks); // Ascending order
     }

     @Override
     public String toString() {
         return name + " (" + marks + ")";
     }

}



