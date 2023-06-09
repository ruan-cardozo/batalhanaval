package Jogada;
import components.Cordenada;

import java.util.Scanner;

public class JogadaLocal extends Jogada {
//	public Cliente (String ip, int port) {
//		super(ip, port);
//	}

//	public Cliente() {
//		super();
//	}

//	@Override
//	public void conectarNoServidor() throws IOException {
//		clienteSocket = new Socket(ip, port);
//		out = new PrintWriter(clienteSocket.getOutputStream(), true);
//		in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
//	}
	public Cordenada solicitarJogada() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Digite a linha e a coluna da jogada.");
			System.out.println("Lembre-se que o tabuleiro é de 10x10.");
			System.out.println("Linha e coluna devem ser números entre 0 e 9.");
			System.out.println("Exemplo: Linha: 0 & Coluna:0");
			System.out.println("Digite a linha da jogada: ");
			int linha = scanner.nextInt();
			if (linha == -1) {
				try {
					throw new Exception("Jogada inválida, tente novamente.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Digite a coluna da jogada: ");
			int coluna = scanner.nextInt();
			if (coluna == -1) {
				try {
					throw new Exception("Jogada inválida, tente novamente.");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					scanner.close();
				}
			}
			return new Cordenada(linha, coluna);
//			this.enviar(c);
//			return c;
		} while (true);

	}

//	private void enviar(Cordenada c) {
//		// logica para enviar para o servidor
//	}
}
