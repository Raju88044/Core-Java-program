public class String_Array {
    public static void main(String[] args) {  

        Student s1 = new Student();
        s1.name = "Raju";
        s1.subject = "Math";
        s1.marks = 10;

        Student s2 = new Student();
        s2.name = "Raj";
        s2.subject = "Biology";
        s2.marks = 50;

        Student s3 = new Student();
        s3.name = "Sonam";
        s3.subject = "Commerce";
        s3.marks = 99;
        
        Student student1[] = new Student[3];
        student1[0] = s1;
        student1[1] = s2;
        student1[2] = s3;

        for(Student st : student1){
            System.out.println(st.name + " " + st.marks);
        }

    }
}

class Student {
    String name;
    String subject;
    int marks;
}
