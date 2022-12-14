package br.com.treinaweb.twprojetos.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Projeto {

	private Long id;
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private Cliente cliente;
	private Funcionario lider;
	private BigDecimal orcamento;
	private BigDecimal gastos;
	private List<Funcionario> equipe;
}
