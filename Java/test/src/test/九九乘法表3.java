package test;

public class test {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j=9; j>=i; j--) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
