import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P21
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�аݭn��ܭ������u?");
		System.out.println("�п�J���");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String au=br.readLine();
		int tt=Integer.parseInt(au);
			
		char ans =(tt == 1)?'A':'B';
		
		System.out.println("��ܤF" + ans +"���u");
	}
}