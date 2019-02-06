package it.raffo.login.views.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.TreeNode;
import org.primefaces.model.UploadedFile;

import it.raffo.login.model.pojo.Document;
import it.raffo.login.services.DocumentService;

@ManagedBean
@javax.faces.bean.ApplicationScoped
public class TreeIconView implements Serializable
{

	/**
	 *
	 */
	private static final long	serialVersionUID	= 3898022674643818558L;
	private static final Logger	log					= Logger.getLogger(TreeIconView.class);

	private TreeNode			root;

	private TreeNode			selectedNode;
	private String				nomeFile;
	private String				uploadPath;
	private StreamedContent		file;
	private UploadedFile		fileUpload;

	@ManagedProperty("#{documentService}")
	private DocumentService		service;

	public void displaySelectedSingle()
	{
		if (this.selectedNode != null)
		{
			Document nodo = (Document) this.selectedNode.getData();
			this.nomeFile = nodo.getPath();
			log.info("View file:" + this.nomeFile);
			this.root.getChildren();
		}
	}

	public StreamedContent downloadNode()
	{
		if (this.selectedNode != null)
		{
			Document nodo = (Document) this.selectedNode.getData();
			this.nomeFile = nodo.getPath();

			log.info("Downloading file:" + this.nomeFile);

			try
			{
				this.setFile(
						new DefaultStreamedContent(new FileInputStream(this.nomeFile), nodo.getType(), nodo.getName()));
			}
			catch (FileNotFoundException e)
			{
				log.error(e.getMessage(), e);
			}
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", this.nomeFile);
			FacesContext.getCurrentInstance().addMessage(null, message);
			this.root.getChildren();
			return this.getFile();
		}
		return null;
	}

	public StreamedContent getFile()
	{
		return this.file;
	}

	public UploadedFile getFileUpload()
	{
		return this.fileUpload;
	}

	public String getNomeFile()
	{
		return this.nomeFile;
	}

	public TreeNode getRoot()
	{
		return this.root;
	}

	public TreeNode getSelectedNode()
	{
		return this.selectedNode;
	}

	public String getUploadPath()
	{
		return this.uploadPath;
	}

	public void handleFileUpload(FileUploadEvent event)
	{
		UploadedFile f = event.getFile();
		log.info("Try coping... :" + f.getFileName());

		Path folder = Paths.get(this.getUploadPath() + FilenameUtils.EXTENSION_SEPARATOR_STR);
		String filename = FilenameUtils.getBaseName(f.getFileName());
		String extension = FilenameUtils.getExtension(f.getFileName());

		Path fullPathFile = folder.resolve(filename + "." + extension);

		try (InputStream input = f.getInputstream())
		{
			// Path file = Files.createTempFile(folder, filename + "-", "." + extension);
			Path fileNew = Files.createFile(fullPathFile);

			Files.copy(input, fileNew, StandardCopyOption.REPLACE_EXISTING);
			log.info("File copiato in... :" + fileNew);
			this.root = this.service.createDocuments();
		}
		catch (IOException e)
		{
			log.error(e.getMessage(), e);
		}
	}

	@PostConstruct
	public void init()
	{
		this.root = this.service.createDocuments();
		this.setUploadPath("D:/doganeprj/");

		DataSource ds = null;

		try
		{
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:/test");
		}
		catch (NamingException e)
		{
			log.error("Naming Exception: ", e);
		}

		if (ds == null)
		{
			throw new IllegalArgumentException("No Control Database could be found");
		}

	}

	public void selectFolder()
	{

		Document nodo = (Document) this.selectedNode.getData();
		this.setUploadPath(nodo.getPath());

		log.info(nodo.getPath());

	}

	public void setFile(StreamedContent file)
	{
		log.info("get Uploading...");
		this.file = file;
	}

	public void setFileUpload(UploadedFile fileUpload)
	{
		this.fileUpload = fileUpload;
	}

	public void setNomeFile(String nomeFile)
	{
		this.nomeFile = nomeFile;
	}

	public void setRoot(TreeNode root)
	{
		this.root = root;
	}

	public void setSelectedNode(TreeNode selectedNode)
	{
		this.selectedNode = selectedNode;
	}

	public void setService(DocumentService service)
	{
		this.service = service;
	}

	public void setUploadPath(String uploadPath)
	{
		this.uploadPath = uploadPath;
	}
}
