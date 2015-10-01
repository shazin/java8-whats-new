package lk.cms.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Shazin
 *
 */
public class Main {

    public static void main(String... args) throws Exception {        

        // Mark1 Total
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		int total1 = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map((s) -> { 
    			String[] values = s.split("\\,");
    			return new Student(values[0], Integer.parseInt(values[1]), Arrays.asList(Integer.parseInt(values[2]), Integer.parseInt(values[3])));
    		})
    		.map((s) -> s.getMarks().get(0))
    		.reduce(0, (c, p) -> c + p);
    		
    		System.out.println("Mark 1 Total : "+total1);
    	}
        
        // Mark 2 Total
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		int total1 = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.map((s) -> s.getMarks().get(1))
    		.reduce(0, (c, p) -> c + p);
    		
    		System.out.println("Mark 2 Total : "+total1);
    	}
                
        // Mark 2 Average
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		double total1 = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.mapToInt((s) -> s.getMarks().get(1))
    		.average()
    		.getAsDouble();
    		
    		System.out.println("Mark 2 Average : "+total1);
    	}
        
        // Names of High Scorers
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		List<String> highscores = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.filter((s) -> s.getMarks().get(0) >= 50)
    		.map((s) -> s.getName())
    		
    		.collect(Collectors.toList());
    		
    		System.out.println("High Scorers : "+highscores);
    	}
        
        // Names and Total Marks of High Scorers
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		Map<String, Integer> highscores = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.collect(Collectors.toMap(s -> s.getName(), s -> s.getMarks().stream().reduce(0, (c,p) -> c+p).intValue() ));
    		
    		System.out.println("High Scorers : "+highscores);
    	}
                
        // Names and Age of High Scorers
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		Map<String, Integer> highscores = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.collect(Collectors.toMap(s -> s.getName(), Student::getAge ));
    		
    		System.out.println("High Scorers Name and Age : "+highscores);
    	}
                
        // Partition Pass and Fail
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		Map<Boolean, List<Student>> passFail = br.lines()
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.collect(Collectors.partitioningBy(s -> s.getMarks().stream().reduce(0, Integer::sum) >= 100));
    		
    		System.out.println("Pass and Fail : "+passFail);
    	}
    	
        

        // Sort Name by Descending Order
        // Limit to only top 5
        // Print Student Name and Each Mark Separately
    	try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
    		br.lines()
    		.sorted(Comparator.<String>reverseOrder())
    		.limit(5)
    		.filter((s) -> !s.startsWith("Name"))
    		.map(Student::new)
    		.peek(s -> System.out.println("Student Name : "+s.getName()))
    		.flatMap(s -> s.getMarks().stream())
    		.peek(s -> System.out.println("\t\tMark : "+s))
    		.count();
    		
    		
    	}
        
    }
}
