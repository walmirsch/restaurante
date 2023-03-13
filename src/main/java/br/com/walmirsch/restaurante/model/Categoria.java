package br.com.walmirsch.restaurante.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_categoria")
public class Categoria {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name = "codigo")
	private int codigo;
@Column(name = "nome", length=100)
private String nome;
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

} // Restaurante
