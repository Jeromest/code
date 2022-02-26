package test;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=1+(i-1)*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
