import java.util.*;
public class problemone
{
	public static void main(String[] args) 
	{
		int vowels=0;
		int consonants=0;
		int digits=0;
		int specialcharacters=0;
		Scanner obj=new Scanner(System.in);
		String text=obj.nextLine();
		char x[]=text.toCharArray();
		for(char i:x)
		{
			if(i=='a'||i=='e'||i=='o'|i=='u'||i=='i')
			{
				vowels++;
			}
			else if(i>='a'&&i<='z'||i>='A'&&i<='Z')
			{
				consonants++;
			}
			else if(i>=48&&i<=57)
			{
				digits++;
			}
			else
			{
				specialcharacters++;
			}
		}
		System.out.println("Vowels "+vowels);
		System.out.println("Consonants "+consonants);
		System.out.println("Digits "+digits);
		System.out.println("Special Characters "+specialcharacters);
		obj.close();
		
	}
	
}
