package coding;

public class Colourful {

	public static void main(String[] args) {
		String str = "Colourful";
		int temp = str.length()-1;
		 for (int i = 0; i < str.length(); i++) {
			if(i==str.length()/2)
			{
				for (int k = 0; k <= i; k++)
					System.out.print(" ");
				System.out.print(str.charAt(i));
			}
			else
			{
				if(i<str.length()/2)
				{
					for (int k = 0; k <= i; k++)
						System.out.print(" ");
					System.out.print(str.charAt(i));
					for (int j = 1; j < temp; j++)
						System.out.print(" ");
					System.out.print(str.charAt(i));
					temp=temp-2;
				}
				else
				{
					for (int k = 0; k <= str.length()-i-1; k++)
						System.out.print(" ");
					System.out.print(str.charAt(i));
					for (int j = 0; j < temp+1; j++)
						System.out.print(" ");
					System.out.print(str.charAt(i));
					temp=temp+2;
				}
			}
			System.out.println();
		}
	}
}
