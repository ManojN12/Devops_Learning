package string;

public class String_lenght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String A = "hello";
	        String B = "hellojava";
	        int Alength = A.length();
	        int Blength = B.length();
	        int sum = Alength + Blength;
	        int diff = Alength - Blength;
	        System.out.println(sum);
	        int count = Alength < Blength? Alength : Blength ;
	        System.out.println(count);
	        for(int i = 0;i<count;i++)
	        {
	        char one = A.charAt(i);
	        char two = B.charAt(i);
	        if(one!=two)
	        {
	        	diff = one - two;
	        	System.out.println(diff);
	        	System.out.println(one);
	        	System.out.println(two);
	        	break;
	        }
	        }
	        if(diff>0)
	        {
	        	System.out.println("Yes");
	        }
	        else if(diff<0)
	        {
	        	System.out.println("No");
	        }
	        

	}
	

}
