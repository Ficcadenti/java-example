package it.raffo.login.services;

import java.io.File;

import javax.activation.MimetypesFileTypeMap;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import it.raffo.login.model.pojo.Document;

@SuppressWarnings("deprecation")
@ManagedBean
@ApplicationScoped
public class DocumentService
{

	public TreeNode createDocuments()
	{
		TreeNode root = new DefaultTreeNode(new Document("Files", "-", "-", "Folder"), null);

		File f = new File("D:/doganeprj/");
		this.recursiveSearch(f, root);
		return root;
	}

	private void recursiveSearch(File file, TreeNode root)
	{
		File[] filesList = file.listFiles();
		for (File f : filesList)
		{
			if (f.isDirectory() && !f.isHidden())
			{
				TreeNode directory = new DefaultTreeNode(new Document(f.getName(), f.getAbsolutePath(), "-", "Folder"),
						root);
				this.recursiveSearch(f, directory);
			}
			if (f.isFile())
			{
				TreeNode foglia = new DefaultTreeNode("document", new Document(f.getName(), f.getAbsolutePath(),
						"30 KB", new MimetypesFileTypeMap().getContentType(f)), root);
			}
		}
	}
}