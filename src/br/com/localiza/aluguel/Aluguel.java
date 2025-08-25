package br.com.localiza.aluguel;

import br.com.localiza.cliente.Cliente;
import br.com.localiza.veiculo.Veiculo;

public class Aluguel {
	private int id;
	private Cliente cliente;
	private Veiculo veiculo;
	private String dataInicio;
	private String dataFimPrevista;
	private String dataDevolucao;
	private double valor;
	private double valorTotal;
	
	
	
	public Aluguel(int id, Cliente cliente, Veiculo veiculo, String dataInicio, String dataFimPrevista,
			String dataDevolucao, double valor, double valorTotal) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.dataInicio = dataInicio;
		this.dataFimPrevista = dataFimPrevista;
		this.dataDevolucao = dataDevolucao;
		this.valor = valor;
		this.valorTotal = valorTotal;
	}
	
	public void calcularValorTotal() {
		
	}
	

	
	
}
