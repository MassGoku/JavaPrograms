package coding;

public class StarProgram4 {

	public static void main(String[] args) {
		
		int input = 10,temp = 0;
		for (int i=input; i>=0; i--)
		{
			temp = input - i;
			for(int j=1;j<=input; j++)
			{
				if(temp>0)
					System.out.print(" ");
				else
					System.out.print("*");
				temp--;
			}
			System.out.println();
		}

	}

}
