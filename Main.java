import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EducationCenter university = new School("AUCA", "Bishkek", LocalDate.of(1990, 8, 21));
        EducationCenter school = new School("Arykbai Osmonov", "Osh", LocalDate.of(1978, 3, 10));
        EducationCenter college = new School("Ala-Too", "Naryn", LocalDate.of(1923, 6, 11));

        Student student1 = new Student("Amanda", "Abdullaeva", "Female", LocalDate.of(2021, 7, 18), university);
        Student student2 = new Student("Farida", "Begimbai kyzy", "Female", LocalDate.of(2022, 7, 18), school);
        Student student3 = new Student("Ainazik", "Mamaeva", "Female", LocalDate.of(2021, 7, 18), college);
        Student student4 = new Student("Aigerim", "Kandybekova", "Female", LocalDate.of(2022, 7, 18), university);
        Student student5 = new Student("Bota", "Kasymova", "Female", LocalDate.of(2005, 7, 18), school);
        Student student6 = new Student("Sadraddin", "Ahmetov", "Female", LocalDate.of(2021, 7, 18), college);
        Student student7 = new Student("Asman", "Jandarbekov", "Female", LocalDate.of(1999, 7, 18), university);
        Student student8 = new Student("Nurtilek", "Okenov", "Female", LocalDate.of(2009, 7, 18), school);
        Student student9 = new Student("Nuriza", "Saidinbekova", "Female", LocalDate.of(2021, 7, 18), college);
        Student student10 = new Student("Zalkabek", "Zalkarbekov", "Female", LocalDate.of(2022, 7, 18), university);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        method(students);
    }

    public static void method(Student[] students) {
        for (Student student : students) {
            System.out.println("-----------------------------------------");
            System.out.println("Student name:\n"+ student.getName());
            System.out.println("Student surname:\n"+ student.getSurname());
            System.out.println("Student gender:\n"+ student.getGender());
            System.out.println("Student date of start:\n"+ student.getDateOfStart());
            System.out.println("Student Education Center:\n" + student.getEducationCenter().getEducationType());
            System.out.println("Kancha jyl okudu:"+student.getYearsStudied());
            System.out.println("-----------------------------------------");
        }
    }
}
