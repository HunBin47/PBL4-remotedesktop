import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI t = new GUI();
		System.out.println("HELLO");
		Initialize(t.GetIP(),t.GetPort());
	}
	public static void Initialize(String IP, int port) {
		try {
			Socket socket = new Socket(IP, port);
			DataInputStream input = new DataInputStream(System.in);
			 
            // sends output to the socket
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String line = "";
            
            // keep reading until "Over" is input
            while (!line.equals("Over"))
            {
                try
                {
                    line = input.readLine();
                    out.writeUTF(line);
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
