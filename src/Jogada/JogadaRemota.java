package Jogada;

import components.Cordenada;
import java.util.Scanner;


//import components.Cordenada;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//
 public class JogadaRemota extends Jogada {
		public Cordenada solicitarJogada(){
		//sockets
			return new Cordenada(0, 0);
		}
 }
//	private ServerSocket serverSocket;
//
//	public Servidor() {
//		super(port);
//	}
//	@Override
//	public void conectarNoServidor() throws IOException {
//			serverSocket = new ServerSocket(port);
//			clienteSocket = serverSocket.accept();
//			out = new PrintWriter(clienteSocket.getOutputStream(), true);
//			in = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
//	}
//
//	@Override
//	public void parar() throws IOException {
//		super.parar();
//		serverSocket.close();
//	}
//
//	public Cordenada jogar() {
//		// conectar no servidor remoto e receber a jogada que ele enviou
//
//		// logica para receber a jogado do inimigo
//		return new Cordenada(0, 0);
//		// substituir por uma jogada remota
//	}
//}
