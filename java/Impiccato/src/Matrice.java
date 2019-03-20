import java.util.Random;


public class Matrice {

	static matr m1;
	static matr m2;
	

	public static void main(String[] args) {
        System.out.println("Operazioni su matrici!"); 
        m1=GeneraG("Matrice A",15,15,4);
        m2=GeneraP("Matrice B",2,2,4);
        m1.stampa();
        System.out.println("");
        m2.stampa();
        
        int trovata=TestMatch(m1,m2);
        if(trovata==0)
        {
        	System.out.println("NON Trovata!!!!");
        }
    }
	
	public static matr GeneraP(String str,int RIGA1,int COL1,int maxRandom)
	{
		matr appoM=new matr(str,RIGA1,COL1);
		Random randomGenerator = new Random();
		
		
		for(int r=0;r<RIGA1;r++)
		{
			for(int c=0;c<COL1;c++)
			{
			
				int randomInt = randomGenerator.nextInt(maxRandom);
				appoM.matrice[r][c]=randomInt;
				
			}
		}
		
		return appoM;
		
	}
	
	public static matr GeneraG(String str,int RIGA1,int COL1,int maxRandom)
	{
		matr appoM=new matr(str,RIGA1,COL1);
		Random randomGenerator = new Random();
		int randomInt;
		
		for(int r=0;r<RIGA1;r++)
		{
			for(int c=0;c<COL1;c++)
			{
			
				randomInt = randomGenerator.nextInt(maxRandom);
				
				if(c==COL1-1)
				{
					while(randomInt==appoM.matrice[r][0])
					{
						randomInt = randomGenerator.nextInt(maxRandom);
					}
					appoM.matrice[r][c]=randomInt;
				}else
				{
					appoM.matrice[r][c]=randomInt;
				}
			}
		}
		
		return appoM;
		
	}

	public static int TestMatch(matr a,matr b)
	{
		if ( (b.nCOLONNE<=a.nCOLONNE) && (b.nRIGHE<=a.nRIGHE))
		{
			for(int r=0;r<a.nRIGHE;r++)
			{
				for(int c=0;c<a.nCOLONNE;c++)
				{
				
					if(a.matrice[r][c] == b.matrice[0][0])
					{
						/* controllo se e' presente la b a partire dall indice r,c */
						// System.out.printf("(%d,%d)\n",r,c);
						if (confronta(r,c,a,b))
						{
							System.out.printf("%s Trovata all'indice: (%d,%d) di %s\n",b.nomeMatrice,r,c,a.nomeMatrice);
							return 1;
						}
					}
				}
				
			}
		}else
		{
			System.out.println("La matrice b e' dimensinalmente piu' grande di a!!!");
		}
			
		return 0;
	}
	
	private static boolean confronta(int rStart,int cStart,matr a,matr b)
	{
		boolean flag = false;
		if ( (rStart+b.nRIGHE) > a.nRIGHE )
		{
			//System.out.println("Fuori range");
			return false;
		}
		
		if ( (cStart+b.nCOLONNE) > a.nCOLONNE )
		{
			//System.out.println("Fuori range");
			return false;
		}
		
		for(int r=0;r<b.nRIGHE;r++)
		{
			for(int c=0;c<b.nCOLONNE;c++)
			{
				int rA=rStart+r;
				int cA=cStart+c;
				//System.out.printf("Confronto (%d,%d)=[%d] con (%d,%d)=[%d]\n",rA,cA,a.matrice[rA][cA],r,c,b.matrice[r][c]);
				if(a.matrice[rA][cA] == b.matrice[r][c])
				{
					flag=true;
				}
				else
				{
					flag=false;
					return flag;
				}
			}
			
		}
		return flag;
	}
}


