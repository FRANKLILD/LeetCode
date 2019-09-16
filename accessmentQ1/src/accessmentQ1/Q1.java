package accessmentQ1;

import java.util.ArrayList;
import java.util.List;

// company deal with a lot of orders
// There are two kind of order: Prime order and no-Prime order
// Prime order: {sd2 echo sss aaa ccc}
// no-Prime order: {sdf 123 333 222}
// the second part is letter or not decide which is Prime
// Now, we want to only sort the Prime order, the no-Prime order just after Prime order by Original order
// For Prime order: the capital character of second part 'a' in {ts2 aaa bbb ccc} has priority over 'b' in {ts2 bbb ddd ccc}; put it first.
// if {ts2 aaa bbb ccc} {ts2 aaa ddd ccc}, 'a' is same, continue compare the capital character of next character
public class Q1 {
	
	public List<String> sortList(Integer numberOfList, List<String> orderList){
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < numberOfList; i++) {
			sort();
			
		}
		
		
		
		return list;
	}
	
	private boolean compare() {
		return true;
	}

}
