package other;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = new int[] {14, 27, 1, 4, 2, 50, 3, 1};
//		int[] b = new int[] {2, 4, -4, 3, 1, 1, 14, 27, 50};
//		System.out.print(solution(a, b));
		
		System.out.print(price(8));
		
	}
	
    public static int solution(int[] x, int[] y) {
        // Your code here
        HashSet<Integer> a = new HashSet<Integer>();
        for(int e : x){
            a.add(e);
        }
        
        HashSet<Integer> b = new HashSet<Integer>();
        for(int e : y){
            b.add(e);
        }
        
        int count = 0;
        for(int n : y){

            if( !a.contains(n) ) count = n;
        }
        for(int n : x){

            if( !b.contains(n) ) count = n;

        }
        return count;
    }
    
    
    public static float price( int num) {
    	int weight = num * 765;
    	float c = (float)weight / 500;
    	
    	
    	float price = (c - 1) * 36 + 118;
    	
    	int sp = 238 * num;
    	
    	float total = price + sp;
    	
    	float convert = (float) (total / 5.09);
    	
    	return convert;
    }
}
