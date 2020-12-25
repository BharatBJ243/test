package Practice;

public class demo1 {
   public static void main(String[] args) {
	
	   String a="abc123@xyz$";
	   int alp=0;
	   int spl=0;
	   int number=0;
	   
	   char[] ch=a.toCharArray();
	   
	   for (int i = 0; i < ch.length; i++) {
		   if(ch[i]>='a' && ch[i]<='z')
		   {
         	 alp++;
    	   }
		   else if (ch[i]>='0' && ch[i]<='9')
		   {
			   number++;
		   }
		   else
		   {
			   spl++;
		   }
	   }
		System.out.println(alp);	   
		System.out.println(spl);	
		System.out.println(number);	
	}
}

