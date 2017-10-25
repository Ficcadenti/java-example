package esempioZIP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class esempio_zip 
{
	
	
    public static void main(String[] args) 
    {
    	byte[] buffer = new byte[1024];
    	int len;
    	
    	try{
    		
	    	FileOutputStream fos = new FileOutputStream("MyFile.zip");
			ZipOutputStream zos = new ZipOutputStream(fos);
			
			System.out.println("Zip bici.txt ...");
			ZipEntry ze= new ZipEntry("bici.txt");
			zos.putNextEntry(ze);
			FileInputStream in = new FileInputStream("bici.txt");
    		while ((len = in.read(buffer)) > 0) 
    		{
    			zos.write(buffer, 0, len);
    		}
    		in.close();
    		zos.closeEntry();
    		
    		System.out.println("Zip acqua.txt ...");
    		ze= new ZipEntry("acqua.txt");
    		zos.putNextEntry(ze);
			in = new FileInputStream("acqua.txt");
    		while ((len = in.read(buffer)) > 0) 
    		{
    			zos.write(buffer, 0, len);
    		}
    		in.close();
    		zos.closeEntry();
    		
    		System.out.println("Zip xrtwtcorr.c ...");
    		ze= new ZipEntry("xrtwtcorr.c");
    		zos.putNextEntry(ze);
			in = new FileInputStream("xrtwtcorr.c");
    		while ((len = in.read(buffer)) > 0) 
    		{
    			zos.write(buffer, 0, len);
    		}
    		in.close();
    		zos.closeEntry();

    		//remember close it
    		zos.close();

        	System.out.println("Done");
    		
    	}
    	catch(IOException ex)
		{
    		ex.printStackTrace();
		}

    }
    
}