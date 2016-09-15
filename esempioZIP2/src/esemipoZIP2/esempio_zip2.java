package esemipoZIP2;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class esempio_zip2 
{
	
	private static List<String> fileList;
    private static final String OUTPUT_ZIP_FILE = "MyFile2.zip";
    private static final String SOURCE_FOLDER = "./testzip";

    esempio_zip2()
    {
    	fileList = new ArrayList<String>();
    }

    public static void main( String[] args )
    {
    	esempio_zip2 appZip = new esempio_zip2();
    	esempio_zip2.generateFileList(new File(SOURCE_FOLDER));
    	esempio_zip2.zipIt(OUTPUT_ZIP_FILE);
    }

    /**
     * Zip it
     * @param zipFile output ZIP file location
     */
    public static void zipIt(String zipFile)
    {

     byte[] buffer = new byte[1024];

     try
     {

    	FileOutputStream fos = new FileOutputStream(zipFile);
    	ZipOutputStream zos = new ZipOutputStream(fos);

    	System.out.println("Output to Zip : " + zipFile);

    	for(String file : fileList)
    	{

    		System.out.println("File Added : " + file);
    		
    		ZipEntry ze= new ZipEntry(file);
        	zos.putNextEntry(ze);

        	FileInputStream in = new FileInputStream(SOURCE_FOLDER + File.separator + file);

        	int len;
        	while ((len = in.read(buffer)) > 0) 
        	{
        		zos.write(buffer, 0, len);
        	}

        	in.close();
    	}

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

    /**
     * Traverse a directory and get all files,
     * and add the file into fileList
     * @param node file or directory
     */
    public static void generateFileList(File node)
    {
    	//add file only
		if(node.isFile())
		{
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
		}
	
		if(node.isDirectory())
		{
			String[] subNote = node.list();
			for(String filename : subNote)
			{
				generateFileList(new File(node, filename));
			}
		}
    }

    /**
     * Format the file path for zip
     * @param file file path
     * @return Formatted file path
     */
    private static String generateZipEntry(String file)
    {
    	String add_file=file.substring(file.indexOf(SOURCE_FOLDER)+SOURCE_FOLDER.length()+1,file.length());
    	return add_file;
    }
}
