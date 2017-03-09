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
@Table(schema = "locais", name = "estado")
public class Estado implements Serializable {

	@Id
	@Column(name = "cod_estado", nullable = false)
	private Integer id;
	
	@Column(name = "sgl_estado", nullable = false)
	private String sigla;
	
	@Column(name = "nom_estado", nullable = false)
	private String nome;
	
	@JoinColumn(name = "cod_pais", nullable = false)
	@ManyToOne
	private Pais pais = new Pais();
	
	@Column(name = "cod_uf_censo")
	private Integer codigoCenso;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
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
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
		Estado other = (Estado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sigla == null) {
			if (other.sigla != null)
				return false;
		} else if (!sigla.equals(other.sigla))
			return false;
		return true;
	}
}
