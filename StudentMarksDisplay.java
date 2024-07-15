public class StudentMarksDisplay {

    public static void main(String[] args) {
        // Array to store student names
        String[] students = {"Alice", "Bob", "Carol", "David", "Eve"};
        
        // Array to store marks of each student
        int[] marks = {85, 90, 76, 88, 92};
        
        // Displaying the student names and their marks
        System.out.println("Student Name: Lubna");
        System.out.println("--------------");
        
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ": " + marks[i]);
        }
    }
}
