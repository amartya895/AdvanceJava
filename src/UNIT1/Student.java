package UNIT1;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    String name;
    String cityName;

    Student(String name, String cityName) {

        this.name = name;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }


    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student("Shivam ", "Khagaria"));
        ls.add(new Student("Sourav", "Gridhi"));
        ls.add(new Student("Akhil", "Lucknow"));
        ls.add(new Student("Shubham", "Banka"));

        Iterator<Student> it = ls.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Foreach loop");
        ls.forEach(s -> System.out.println(s));
    }
}



