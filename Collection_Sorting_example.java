import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Collection_Sorting_example {
    
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(634);
        list.add(617);
        list.add(601);
        list.add(890);
        list.add(203);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("=======================================");
        System.out.println("Sorting based last digit");

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare (Integer i, Integer j) {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;

            }
        };
        Collections.sort(list,com);
        System.out.println(list);

        System.out.println("stundet object sorting based on age");
        List<Student> stud = new ArrayList();

        stud.add(new Student(26,"raju"));
        stud.add(new Student(24,"sonam"));
        stud.add(new Student(27,"sona"));
        stud.add(new Student(87,"raj"));
        stud.add(new Student(21,"raju"));

        Comparator<Student> com1 = (i,j) -> i.age>j.age?1:-1;

        Collections.sort(stud,com1);
        System.out.println(stud);

        for(Student s : stud) 
        System.out.println(s); 

        
    }
}

class Student implements Comparable<Student> {

    int age;
    String name;
    public Student(int age,String name) {
        this.age=age;
        this.name=name;
    }
    @Override
    public int compareTo(Student s1) {
        if(this.age > s1.age)
                    return 1;
                else
                    return -1;
    }
    
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}
