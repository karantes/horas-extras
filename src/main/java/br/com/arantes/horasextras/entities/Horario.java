package br.com.arantes.horasextras.entities;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "horarios")
@Table(name = "horarios")
public class Horario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate dia;

	private LocalTime entrada;

	private LocalTime saidaAlmoco;

	private LocalTime retornoAlmoco;

	private LocalTime saida;

	@OneToMany
	private List<HoraExtra> horasExtras = new ArrayList<>();

	private Duration duracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}

	public LocalTime getSaidaAlmoco() {
		return saidaAlmoco;
	}

	public void setSaidaAlmoco(LocalTime saidaAlmoco) {
		this.saidaAlmoco = saidaAlmoco;
	}

	public LocalTime getRetornoAlmoco() {
		return retornoAlmoco;
	}

	public void setRetornoAlmoco(LocalTime retornoAlmoco) {
		this.retornoAlmoco = retornoAlmoco;
	}

	public LocalTime getSaida() {
		return saida;
	}

	public void setSaida(LocalTime saida) {
		this.saida = saida;
	}

	public List<HoraExtra> getHorasExtras() {
		return horasExtras;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public void setDuracao(Duration duracao) {
		this.duracao = duracao;
	}

	/**
	 * @param dia
	 * @param entrada
	 * @param saidaAlmoco
	 * @param retornoAlmoco
	 * @param saida
	 * @param duracao
	 */
	public Horario(LocalDate dia, LocalTime entrada, LocalTime saidaAlmoco, LocalTime retornoAlmoco, LocalTime saida, Duration duracao) {
		super();
		this.dia = dia;
		this.entrada = entrada;
		this.saidaAlmoco = saidaAlmoco;
		this.retornoAlmoco = retornoAlmoco;
		this.saida = saida;
		this.duracao = duracao;
	}

	public Horario() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null)
				? 0
				: id.hashCode());
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
		Horario other = (Horario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
