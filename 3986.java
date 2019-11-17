package practice;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			sc.nextLine();
			Stack<Character> stack = new Stack<Character>();
			
			int cnt =0;
			
			for(int i =0; i<N; i++) {
				
				String word = sc.nextLine();
				
				for(int j=0;j<word.length();j++) {
					
					char ch = word.charAt(j);
					
					if(stack.empty()) {
						stack.push(ch);
					}
	
					else {
						if((char)stack.peek()==ch) {
							stack.pop();
						}else {
							stack.push(ch);
						}		
					}
				}
				
				if(stack.empty()) cnt++;
				else stack.clear();
			}
			
			System.out.println(cnt);
			
			sc.close();
		}
	}
}
