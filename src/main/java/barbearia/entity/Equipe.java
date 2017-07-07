package barbearia.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Equipe implements Serializable {

	@Transient
	private static final long serialVersionUID = -3226125939725684416L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String descricao;
	private String foto;
	private Integer tempoprof;

	public Equipe() {
		// TODO Auto-generated constructor stub
	}

	public Equipe(Integer id, String nome, String descricao, String foto, Integer tempoprof) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.foto = foto;
		this.tempoprof = tempoprof;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Integer getTempoprof() {
		return tempoprof;
	}

	public void setTempoprof(Integer tempoprof) {
		this.tempoprof = tempoprof;
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
		Equipe other = (Equipe) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
