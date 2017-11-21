package it.raffo.springmvc.model;



import javax.validation.constraints.Min;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;


public class Triangolo {

	public Triangolo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private String type;
	@Min(value=30, message="Il valore dell''altezza deve essere maggiore di 30")
	@NumberFormat(style = Style.NUMBER)
	private int altezza;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	

}
