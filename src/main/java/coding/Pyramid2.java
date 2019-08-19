package coding;

public class Pyramid2 {

	public static void main(String[] args) {
		
		int input = 10,temp=1;
		for(int i=1;i<=input;i++)
		{
			if (i<=input/2) {
				for(int j=1; j<=input/2-i;j++)
				{
					System.out.print(" ");
				}
				for(int k=0; k<=temp;k++)
				{
					System.out.print("*");
				}
				temp=temp+2;
			}
			else {
				for(int j=-1; j>input/2-i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1; k<=temp-1;k++)
				{
					System.out.print("*");
				}
				temp=temp-2;
			}
			System.out.println();
		}

	}

}
