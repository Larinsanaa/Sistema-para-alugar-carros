package br.com.localiza.veiculo;

public class Veiculo {
	private String modelo, placa, categoria;
	private int ano;
	private double valorDiaria;
	private boolean disponivel = true;
	
	
	public Veiculo(String modelo, String placa, String categoria, int ano, double valorDiaria) {
		super();
		this.modelo = modelo;
		this.placa = placa;
		this.categoria = categoria;
		this.ano = ano;
		this.valorDiaria = valorDiaria;
		this.disponivel = true;
		
	}
	

}
