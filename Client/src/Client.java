import java.net.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket client = new Socket("localhost",4444);
		
		
		while(true) {
		InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		PrintWriter printWriter = new PrintWriter(client.getOutputStream());
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gönder---");
		
		printWriter.println(scanner.nextLine());
		
		printWriter.flush();
		
		System.out.println("Gelen Veri :"+bufferReader.readLine());
		
		}
	}

}
