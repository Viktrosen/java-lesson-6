import java.io.*;
import java.net.Socket;

public class EchoClient {
    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8189;
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_ADDR, SERVER_PORT);
        DataInputStream  in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String strIn = in.readUTF();
                        System.out.println(strIn);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        while (true){
            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
           out.writeUTF("От клиента: "+str);
        }
    }

}
