package util;

import components.Cordenada;
import components.Embarcacao;
import components.EmbacacaoFactory;
import components.Tabuleiro;
import view.Visualizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class CarregadorEmbarcacoes {
	private static final Logger LOG = Logger.getAnonymousLogger();

	public static List<Embarcacao> carregar(String nomeArquivo) {
		List<Embarcacao> embarcacoes = new ArrayList<>();

		try {
			int contador = 0;
			File name = new File(nomeArquivo);
			FileReader file = new FileReader(name);
			BufferedReader reader = new BufferedReader(file);
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parts = line.split(",");
				String tipo = parts[0].trim();
				int linhaInicial = Integer.parseInt(parts[1].trim());
				int colunaInicial = Integer.parseInt(parts[2].trim());

				Cordenada c = new Cordenada(linhaInicial, colunaInicial);
				Embarcacao embarcacao = EmbacacaoFactory.criar(tipo, c);
				if (embarcacao != null) {
					embarcacoes.add(embarcacao);
					contador++;
					LOG.info("Embarcacao adicionada " + contador);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return embarcacoes;
	}
	public static List<Embarcacao> loaderUsuario() {
		String[] nomes = {"Submarino", "Submarino", "Submarino", "Submarino", "ContraTorpedeiro", "ContraTorpedeiro", "ContraTorpedeiro", "NavioTanque", "NavioTanque", "PortaAvião"};
		int contador = 0;
		int linhaInicial = 0;
		int colunaInicial = 0;

		List<Embarcacao> embarcacoes = new ArrayList<>();

			for (String nome : nomes) {
				System.out.println("Posicione as embarcações: " + nome);
				Scanner scanner = new Scanner(System.in);
				System.out.println("Digite a linha inicial: ");
				linhaInicial = scanner.nextInt();
				System.out.println("Digite a coluna inicial: ");
				colunaInicial = scanner.nextInt();
				System.out.println("Digite a direção: ");

			Cordenada c = new Cordenada(linhaInicial, colunaInicial);
			Embarcacao embarcacao = EmbacacaoFactory.criar(nome, c);
			if (embarcacao != null) {
				embarcacoes.add(embarcacao);
				contador++;
				//LOG.info("Embarcacao adicionada " + contador);
			}
		}
		return embarcacoes;
	}
}
