package dev.evertonsavio.springdemo;

public class MainWithoutIoCInjection {

	public static void main(String[] args) {
		
		Treinador treinadorRastreador = new TreinadorRastreador();
		
		System.out.println(treinadorRastreador.getTreinoDiario());
		
	}

}
