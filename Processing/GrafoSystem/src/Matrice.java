public class Matrice {

	private static int w = 80;
	private static int h = 80;
	private static Matrice matrice_istanza = null;
	private static int[][] matrice = new int[w][h];
	private static int diametro = SystemGraphProcessing.diametro;

	public static void main(String[] args) {
		generaCentro();
		Matrice.stampaMatrice();
	}

	private Matrice() {
		for(int x=1; x<w; x++) {
			for(int y=1; y<h; y++) {
				matrice[x][y]=1;
			}
		}
	}
	public static Matrice getIstance() {
		if(matrice_istanza == null) {
			matrice_istanza = new Matrice();
		}
		return matrice_istanza;
	}	

	public static void stampaMatrice() {
		for(int x=1; x<w; x++) {
			System.out.println("");
			for(int y=1; y<h; y++) {
				System.out.print(matrice[x][y]);
			}
		}
	}

	public static Centro generaCentro() {
		int ipotesiX= 3;
				//(int) ((Math.random() * w) - 1);
		int ipotesiY = 30;
				//(int) ((Math.random() * h) - 1);
		
		if (ipotesiX < diametro || ipotesiX > w) {
			ipotesiX= (int) ((Math.random() * w) - 1);
		}
		
		else if(ipotesiY < diametro || ipotesiY>h ) {
			ipotesiY = (int) ((Math.random() * h) - 1);
		}
		
		System.out.println("posizioneX ----->" + ipotesiX);
		System.out.println("posizioneY ----->" + ipotesiY);

		Centro centroIpotetico = new Centro(ipotesiX,ipotesiY);
		while(!controllaSeSicuro(centroIpotetico, matrice)) {
			generaCentro();
		}
			return centroIpotetico;
		}


	public static boolean controllaSeSicuro(Centro c, int[][] matrice) {
		int partenzaCortileX = c.x - diametro/2;
		System.out.println("partenzaCortileX ----->" + partenzaCortileX);
		int arrivoCortileX = c.x + diametro/2;
		System.out.println("arrivoCortileX ----->" + arrivoCortileX);
		int partenzaCortileY = c.y - diametro/2;
		System.out.println("partenzaCortileY ----->" + partenzaCortileY);
		int arrivoCortileY = c.y + diametro/2;
		System.out.println("arrivoCortileY ----->" + arrivoCortileY);

		for(int x = partenzaCortileX;  x <= arrivoCortileX; x++ ) {
			for(int y = partenzaCortileY;  y <= arrivoCortileY; y++) {
				matrice[x][y]= 1;
			}
		}
		return true;
	}
}



