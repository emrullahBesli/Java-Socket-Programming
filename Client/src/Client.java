import java.net.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket client = new Socket("localhost",4444);
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\pc\\Videos\\Radeon ReLive\\unknown.png");
		
		while(true) {
		InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());
		
		BufferedReader bufferReader = new BufferedReader(inputStreamReader);
		
		PrintWriter printWriter = new PrintWriter(client.getOutputStream());
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("G�nder---");
		
		printWriter.println(scanner.nextLine());
		
		printWriter.flush();
		
		System.out.println("Gelen Veri :"+bufferReader.readLine());
		
		}
	}

}
