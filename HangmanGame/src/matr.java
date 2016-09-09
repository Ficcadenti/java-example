

public class matr
{
		int nRIGHE;
		int nCOLONNE;
		String nomeMatrice="";
		int[][] matrice;   
		
		matr(String str,int nrig, int ncol)   
		{              
			nRIGHE=nrig;
			nCOLONNE=ncol;
			matrice = new int[nrig][ncol];
			nomeMatrice=str;
		}
		
		public void stampa()
		{
			System.out.printf("%s:\n",nomeMatrice);
			for(int r=0;r<nRIGHE;r++)
			{
				for(int c=0;c<nCOLONNE;c++)
				{
					System.out.printf("%4d",matrice[r][c]);
				}
				System.out.println();
			}
		};
		
}
