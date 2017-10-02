package it.raffo.compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<nazione> nazioni=new ArrayList<nazione>();
		nazioni.add(new nazione("Italia",10));
		nazioni.add(new nazione("Franzcia",30));
		nazioni.add(new nazione("Germania",20));
		nazioni.add(new nazione("Spagna",1));
		
		Collections.sort(nazioni);
		
		for(nazione n: nazioni)
		{
			System.out.printf("%02d - %s\n",n.getCodice(),n.getNome());
		}

	}
	
	

}
