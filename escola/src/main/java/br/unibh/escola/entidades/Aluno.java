package br.unibh.escola.entidades;


import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@Entity @PrimaryKeyJoinColumn
@Table(name="TB_ALUNO")
@NamedQuery(name="Aluno.findByName", query = "select a from Aluno a where a.nome like :nome")
public class Aluno extends Pessoa {
	
	
	@NotNull
	@Column(name="MATRICULA",unique=true, nullable=false)
	private Long Matricula;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_ANIVERSARIO", nullable=false)
	private Date dataAniversario;

	public Long getMatricula() {
		return Matricula;
	}

	public void setMatricula(Long matricula) {
		Matricula = matricula;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	public Aluno(){
		super(null, null, null);
	}
	public Aluno(Long id, Long matricula, String nome, String cpf, Date date) {
		super(id, cpf, cpf);
		Matricula = matricula;
		this.dataAniversario = date;
	}

	public Aluno(Long id, String nome, String cpf, Date date) {
		super(id, cpf, nome);
		this.dataAniversario = date;
	}

	public Aluno(Long id, Long matricula, String nome) {
		super(id, null, nome);
		Matricula = matricula;
	}
	
	public static boolean verificaMatricula(String matricula) {
		if (matricula.trim().equals("") || matricula == null
				|| matricula.length() < 6) {
			return false;
		}
		return true;
	}

	public String toString() {
		return super.toString() + "\nAluno [Matricula=" + Matricula
				+ ", dataAniversario=" + dataAniversario + "]";
	}

	public Aluno(Long id, String cpf, String nome, Long matricula,
			Date dataAniversario) {
		super(id, cpf, nome);
		Matricula = matricula;
		this.dataAniversario = dataAniversario;
	}

}