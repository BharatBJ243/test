package Practice;

public class dw2
			{

				public static void main(String[] args)
				{
					String s1="program";
					System.out.println(s1);
					int size=s1.length();
					System.out.println(size);
					
					char res=s1.charAt(5);
					System.out.println(res);
					
					char [] ch=s1.toCharArray();
					
					for(int i=0;i<ch.length;i++)
					{
						System.out.println("ch["+i+"]="+ch[i]);
					}
					
					
					char [] ar= {'p','r','o'};
					//convert char array to string 
					String str=new String(ar);
					System.out.println("str="+str);
					
						
					
				}
			}
			

	


	

