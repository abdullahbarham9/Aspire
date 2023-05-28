package Assignment8;

import java.util.Optional;
import java.util.stream.Stream;

public class Application {
    static Students[] students = new Students[]{
            Students.of("Ahmad", 20, 1),
            Students.of("Mohammad", 25, 2),
            Students.of("ESA", 27, 3),
            Students.of("ESRA", 19, 4),
            Students.of("DANA", 40, 5),
            Students.of("RUBA", 22, 6)

    };

    public static void main(String[] args) {
       System.out.println(getStudentById1(5));
//
        try {
            System.out.println(getStudentById2(2));
        } catch (StudentNotFoundException e) {
            System.out.println("error: can't find student by id");
        }

        System.out.println(getStudentById3(5));
    }

    // method 1
    public static Students getStudentById1(int id) {
        for (Students student1 : students) {
            if (student1.getId() == id) {
                return student1;
            }
        }

        throw new RuntimeException("Student not found with ID: " + id);
    }


    // method 2

    public static Students getStudentById2(int id) throws StudentNotFoundException {

        for (Students student2 : students) {
            if (student2.getId() == id) {
                return student2;
            }
        }
        throw new StudentNotFoundException("Student not found for ID: " + id);
    }

    private static class StudentNotFoundException extends Exception {
        public StudentNotFoundException(String message) {
            super(message);
        }
    }


    //method 3

    public static Optional<Students> getStudentById3(int id) {

        return Stream.of(students).
                filter(s -> s.getId() == id).findFirst();

    }



}



