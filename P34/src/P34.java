import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�n���L�ĴX�����B�z�O?(1~10)");
		
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		
		String sstr = br.readLine();
		int tt = Integer.parseInt(sstr);
		
		for(int i=1;i<=10;i++)
		{
			
			if(i==tt)
				continue;
			System.out.println("��"+i+"�����B�z�C");
		}
	}
}
