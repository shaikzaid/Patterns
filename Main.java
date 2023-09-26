package OOPS.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Student student=Student.builder()
                .setId(10)
                .setName("zaid")
                .setAge(19)
                .setGrade(2021)
                .build();
        System.out.println(student.toString());
        Student aug2023 = new Student()
    }
}
