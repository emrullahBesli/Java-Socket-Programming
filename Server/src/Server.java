import java.net.*;
import java.io.*;
import java.util.*;

public class Server {

	public static void main(String[] args) throws IOException {
	
ServerSocket serverSocket = new ServerSocket(4444);

Socket client = serverSocket.accept();

while(true) {
	
InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream()); 

BufferedReader bufferReader = new BufferedReader(inputStreamReader);

PrintWriter printWriter = new PrintWriter(client.getOutputStream());

 String inComingData = bufferReader.readLine();
 
 System.out.println("Gelen Veri: "+inComingData);
 
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Gönder---");
 
 String text = scanner.nextLine();
 
 printWriter.println(text);
 
 printWriter.flush();
}

	}

}
