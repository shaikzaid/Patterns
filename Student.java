package OOPS.BuilderPattern;

import java.security.PublicKey;

public class Student {
    private int age;
    private String name;
    private int id;
    private long grade;

    public Student(String name,int age,long grade,int id){
        this.age=age;
        this.grade=grade;
        this.name=name;
        this.id=id;

    }
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private int age;
        private String name;
        private int id;
        private long grade;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setGrade(long grade) {
            this.grade = grade;
            return this;
        }
        public void validate(){
            if(grade >= 2023)
                throw new InvalidGradeException();
            if(age < 18)
                throw new InvalidageException();
            if(name == null)
                throw new InvalidNameException();
        }
        public Student build(){
            validate();
            return new Student(this.name,this.age,this.grade,this.id);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}