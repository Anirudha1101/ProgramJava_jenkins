
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		int b =2;
		int c;
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			System.out.println("fibo sereise="+i +" " +c);
			a=b;
			b=c;
			
		}

	}

}
