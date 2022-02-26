package test;

public class ¾Å¾Å³Ë·¨±í6 {

	public static void main(String[] args) {

		for(int i=1; i<=9; i++)
        {
            for(int j=i; j<9; j++)
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
