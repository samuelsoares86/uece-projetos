package br.uece.locais;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(schema = "locais", name = "cidade")
public class Cidade implements Serializable {

	@Id
	@Column(name = "cod_cidade", nullable = false)
	private Integer id;
	
	@JoinColumn(name = "cod_estado", nullable = false)
	@ManyToOne
	private Estado estado = new Estado();
	
	@Column(name = "nom_cidade", nullable = false)
	private String nome;

	@Column(name = "distancia_uece")
	private Double distanciaUece;
	
	@Column(name = "cod_munic_censo")
	private Integer codigoCenso;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDistanciaUece() {
		return distanciaUece;
	}

	public void setDistanciaUece(Double distanciaUece) {
		this.distanciaUece = distanciaUece;
	}

	public Integer getCodigoCenso() {
		return codigoCenso;
	}

	public void setCodigoCenso(Integer codigoCenso) {
		this.codigoCenso = codigoCenso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
