package streams;

import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class streamsFilterMapReduceExample {
	static Predicate<Student> genderPredicte =(student -> {
        return student.getGender().equals("male");
    });

    static Predicate<Student> gradeLevel =(student -> {
        return student.getGradeLevel()==2;
    });

    private static int noOfNoteBooks(){

        int totalNoOfnoteBooks = StudentDatabase.getAllStudents().stream()
                //.filter(genderPredicte)
                .filter(gradeLevel)
              /*  .peek(s->{
                    System.out.println("s : "+ s);
                })*/
                .map((Student::getNoteBooks))
               /* .peek(s1->{
                    System.out.println("s1 : "+ s1);
                })*/
               // .reduce(0,(a,b)->a+b); //summing the notebooks.
                .reduce(0,Integer::sum); //summing the notebooks.
        return  totalNoOfnoteBooks;

    }
    public static void main(String[] args) {

        System.out.println("Total No of NoteBooks are : " + noOfNoteBooks());
    }

}
