package test;

public class ¾Å¾Å³Ë·¨±í7 {

	public static void main(String[] args) {

		for(int i=9; i>0; i--)
	    {
	        for(int j=0; j<9-i; j++)
	        {
	            System.out.print("\t");
	        }

	        for(int j=i; j>0; j--)
	        {
	            System.out.print(j+"*"+i+"="+j*i+"\t");
	        }
	        System.out.println();
	    }
	}

}
