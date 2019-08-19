package coding;

public class Pyramid {

	public static void main(String[] args) {
		
		int input = 10,temp=0;
		for(int i=1;i<=input;i++)
		{
			for(int j=0; j<=input-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=temp;k++)
			{
					System.out.print("*");
			}
			temp=temp+2;
			
			System.out.println();
		}

	}

}
