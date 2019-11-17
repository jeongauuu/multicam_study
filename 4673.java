package practice;

public class Main {

	public static void main(String[] args) {
		{

			boolean[] NUM= new boolean[100001] ;
			
			for(int i=1;i<=10001;i++) {
				if(i<10) {
					NUM[i+i] = true;
				}else if(10<= i&&i<100) {
					int a = i+Integer.toString(i).charAt(0)+
							Integer.toString(i).charAt(1)-96;
					NUM[a] = true;
				}else if(100<= i&&i<1000) {
					int a = i+Integer.toString(i).charAt(0)+
							Integer.toString(i).charAt(1)+
							Integer.toString(i).charAt(2)-144;
					NUM[a] = true;
				}else if(1000<= i&&i<10000) {
					int a = i+Integer.toString(i).charAt(0)+
							Integer.toString(i).charAt(1)+
							Integer.toString(i).charAt(2)+
							Integer.toString(i).charAt(3)-192;
					NUM[a] = true;
				}else {
						int a = i+Integer.toString(i).charAt(0)+
								Integer.toString(i).charAt(1)+
								Integer.toString(i).charAt(2)+
								Integer.toString(i).charAt(3)+
								Integer.toString(i).charAt(4)-240;
						NUM[a] = true;
				}
			}
			
			for(int i=1;i<=10001;i++) {
				if(NUM[i]==false) System.out.println(i);
			}

		}

	}
}
