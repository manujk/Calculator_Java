package client;

import java.net.*;
import java.io.*;

public class Client {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	public static int SERVER_PORT = 5000;

	// Make a connection to the server
	private void connectToServer() {
		try {
			socket = new Socket(InetAddress.getLocalHost(), Client.SERVER_PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			System.out.println("CLIENT: Cannot connect to server");
			System.exit(-1);
		}
	}

	// Disconnect from the server
	private void disconnectFromServer() {
		try {
			socket.close();
		} catch (IOException e) {
			System.out.println("CLIENT: Cannot disconnect from server");
		}
	}

	// Ask the server for the current time
	private void askForAdd(int num1,int num2) {
		connectToServer();
		out.println("Add " +num1 + " " + num2);
		out.flush();
		try {
			String response = in.readLine();
			System.out.println("SERVER:" + response);
		} catch (IOException e) {
			System.out.println("CLIENT: Cannot receive time from server");
		}
		disconnectFromServer();
	}

	// Ask the server for the number of requests obtained
	private void askForDivide(int num1,int num2) {
		connectToServer();
		out.println("Divide " +num1 + " " + num2);
		out.flush();
		try {
			String response = in.readLine();
			System.out.println("SERVER:" + response);
		} catch (IOException e) {
			System.out.println("CLIENT: Cannot receive time from server");
		}
		disconnectFromServer();
	}

	// Ask the server to order a pizza
	private void askForMultiply(int num1,int num2) {
		connectToServer();
		out.println("Multiply " +num1 + " " + num2);
		out.flush();
		try {
			String response = in.readLine();
			System.out.println("SERVER:" + response);
		} catch (IOException e) {
			System.out.println("CLIENT: Cannot receive time from server");
		}
		disconnectFromServer();
	}



	public static void main(String[] args) {
		Client c = new Client();
		int num1 = 10;
		int num2 = 20;
		c.askForAdd(num1,num2);
		c.askForDivide(num1, num2);
		c.askForMultiply(num1, num2);
	}
}
