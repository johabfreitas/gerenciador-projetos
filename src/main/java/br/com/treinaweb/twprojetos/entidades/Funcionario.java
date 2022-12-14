package br.com.treinaweb.twprojetos.entidades;

import java.time.LocalDate;

public class Funcionario {

	private Long id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private LocalDate dataNascimento;
	private Endereco endereco;
	private LocalDate dataAdmissao;
	private LocalDate dataDemissao;
	private Cargo cargo;
}
