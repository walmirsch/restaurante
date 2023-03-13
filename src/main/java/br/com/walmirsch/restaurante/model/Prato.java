package br.com.walmirsch.restaurante.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_prato")
public class Prato {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="codigo")
	private int codigo;
@Column(name="nome", length=100)
private String nome;
@Column(name="foto", length=255)
private String foto;
@Column(name="preco")
private double preco;
@ManyToOne
@JoinColumn(name="cod_categoria")
private Categoria categ;
public Prato() {
	super();
}
public Prato(int codigo, String nome, String foto, double preco, 
int codCateg, String nomeCateg) {
	super();
	this.codigo = codigo;
	this.nome = nome;
	this.foto = foto;
	this.preco = preco;
	this.categ = new Categoria();
	this.categ.setCodigo(codCateg);
	this.categ.setNome(nomeCateg);
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getFoto() {
	return foto;
}
public void setFoto(String foto) {
	this.foto = foto;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public Categoria getCateg() {
	return categ;
}
public void setCateg(Categoria categ) {
	this.categ = categ;
}


} // Prato
