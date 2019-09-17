package accessmentQ1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student 
{ 
    int rollno; 
    String name, address; 
  
    // Constructor 
    public Student(int rollno, String name, 
                               String address) 
    { 
        this.rollno = rollno; 
        this.name = name; 
        this.address = address; 
    } 
  
    // Used to print student details in main() 
    public String toString() 
    { 
        return this.rollno + " " + this.name + 
                           " " + this.address; 
    } 
} 
  
class Sortbyroll implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.rollno - b.rollno; 
    } 
}

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ArrayList<Student> ar = new ArrayList<Student>(); 
//	        ar.add(new Student(111, "bbbb", "london")); 
//	        ar.add(new Student(131, "aaaa", "nyc")); 
//	        ar.add(new Student(121, "cccc", "jaipur")); 
//	  
//	        System.out.println("Unsorted"); 
//	        for (int i=0; i<ar.size(); i++) 
//	            System.out.println(ar.get(i)); 
//	  
//	        // Sorting a list of students in descending order of 
//	        // roll numbers using a Comparator that is reverse of 
//	        // Sortbyroll() 
//	        Comparator c = Collections.reverseOrder(new Sortbyroll()); 
//	        Collections.sort(ar, c); 
//	  
//	        System.out.println("\nSorted by rollno"); 
//	        for (int i=0; i<ar.size(); i++) 
//	            System.out.println(ar.get(i)); 

	    ArrayList<String> countryList = new ArrayList<>();         
	    countryList.add("France");         
	    countryList.add("USA");         
	    countryList.add("India");         
	    countryList.add("Spain");         
	    countryList.add("England");                        
	    System.out.println("Unsorted ArrayList: " + countryList);    
	    Collections.sort(countryList);    
	    System.out.println("Sorted ArrayList in Ascending Order : " + countryList);         
	    Collections.sort(countryList, Collections.reverseOrder());         
	    System.out.println("Sorted ArrayList in Descending Order: " + countryList);  
		
		
		
	}

}
