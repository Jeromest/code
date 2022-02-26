package test;

public class Test {

	public static void main(String[] args) {
		
		for(int i=9; i>0; i--) {
			for(int j=0; j<9-i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
