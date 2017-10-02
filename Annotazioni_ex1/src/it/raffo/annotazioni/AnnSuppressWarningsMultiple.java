package it.raffo.annotazioni;

public class AnnSuppressWarningsMultiple {


//	@SuppressWarnings({"fallthrough","divzero"})
	public static void manyWarnings()
	{
		int num=0;
		switch(num)
		{
			case 3:System.out.printf("..3 !!!!\n");
			case 5:System.out.printf("..5 !!!!\n");
			case 0:System.out.println( 5 / 0 + " divisione per 0");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Annotazioni - Suppress Warning !!!!\n");
		manyWarnings();
	}

}
