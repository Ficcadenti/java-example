package it.mafr.grafo;
import java.io.File;

public class Nodo {
	File Nodo;
	String nome;
	File[]  figli;
	float posX;
	float posY; 

	public File getNodo() {
		return Nodo;
	}
	public void setNodo(File nodo) {
		Nodo = nodo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public File[] getFigli() {
		return figli;
	}
	public void setFigli(File[] figli) {
		this.figli = figli;
	}
	public float getPosX() {
		return posX;
	}
	public void setPosX(float posX) {
		this.posX = posX;
	}
	public float getPosY() {
		return posY;
	}
	public void setPosY(float posY) {
		this.posY = posY;
	} 
}
