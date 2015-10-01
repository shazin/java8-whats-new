package lk.cms.java8;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Shazin
 *
 */
public class Student {

    private String name;

    private Integer age;

    private List<Integer> marks;

    public Student(String record) {
    	String[] values = record.split("\\,");
        this.name = values[0];
        this.age = Integer.parseInt(values[1]);
        this.marks = Arrays.asList(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
    }

    public Student(String name, Integer age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public String toString() {
        return name;
    }
}
