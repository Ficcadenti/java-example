package testCatch;

public class testCatch {

	public static void test() throws Exception{
		// TODO Auto-generated constructor stub
		String s2=null;
		
		s2.toUpperCase();
	}
	
	public static void test2(){
		// TODO Auto-generated constructor stub
		String s3=null;
		
		try
		{
			System.out.printf("UPPERCASE: %s",s3.toUpperCase());
		}catch(Exception ex)
		{
			System.out.printf("Eccezzione test2\n\n\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=null;
		try
		{
			System.out.printf("UPPERCASE: %s",s.toUpperCase());
		}catch(Exception ex)
		{
			System.out.printf("Eccezzione senza finally\n\n\n");
		}
		
		System.out.printf("Che dici ci passo qui!!!!!!\n\n");
		
		try
		{
			System.out.printf("UPPERCASE: %s",s.toUpperCase());
		}catch(Exception ex)
		{
			System.out.printf("Eccezzione con finally \n\n\n");
		}finally
		{
			System.out.printf("Finally \n\n\n");
		}
		
		
		
		System.out.printf("Che dici ancora convinto che non ci passo qui!!!!!!\n\n");
		
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.printf("Eccezzione Test \n\n\n");
		}
		
		System.out.printf("e qua????? Che dici ancora convinto che non ci passo qui!!!!!!\\n\\n");
		
		test2();
		
		System.out.printf("Allora il try-catch è chiaro ????!!!!!!\\n\\n");
		
		
	}

}
