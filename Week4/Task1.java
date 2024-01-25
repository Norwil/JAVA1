// Base Class: Person
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Derived Class: Student
public class Student extends Person {
    private String studentID;

    // Constructor
    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    // Getter and Setter
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

// Derived Class: Teacher
public class Teacher extends Person {
    private String teacherID;

    // Constructor
    public Teacher(String name, int age, String teacherID) {
        super(name, age);
        this.teacherID = teacherID;
    }

    // Getter and Setter
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
}

// Derived Class: HighSchoolStudent
public class HighSchoolStudent extends Student {
    // Additional properties and methods specific to high school students can be added here

    // Constructor
    public HighSchoolStudent(String name, int age, String studentID) {
        super(name, age, studentID);
    }

    // Additional getters and setters can be added here
}
