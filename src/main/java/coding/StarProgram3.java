package coding;

public class StarProgram3 {

	public static void main(String[] args) {
		
		int input = 5,temp = 0;
		for (int i=1; i<=input; i++)
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
