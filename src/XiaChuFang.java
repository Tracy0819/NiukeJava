import java.io.*;

public class XiaChuFang {

	public static void main(String[] args) throws IOException
	{
		File file = new File("e:/1.txt");
		XiaChuFang a= new XiaChuFang();
		a.FileReader(file);
	}


public void FileReader(File file) throws IOException
{
	BufferedReader br = new BufferedReader(new FileReader(file));
	String s = null;
	int k = 0 ;
	boolean a = true;
	int count = 0;
	while(count<50 && ((s=br.readLine())!=null))
	{ 
		//System.out.println(" "+s);
		String[] input = new String[250];
				 input = s.split(" ");
		 
			for(int i = 0; i<input.length;i++)
			{  
				for(int j = 0 ; j<input[i].length();j++)
				{
					
			         char c = input[i].charAt(j);
			         if(Character.isUpperCase(c))
		 	          {
			        	//  System.out.print(input[i].charAt(j)+" ");
			        	  continue;
			          }	   
			         else{
			        	 a= false;
			        	 break;
			         }		 
				}	
				
			}
			 k= k+ input.length;
			count++;
			}if(a)
			{
			System.out.println(k);
			}
	br.close();
}
}