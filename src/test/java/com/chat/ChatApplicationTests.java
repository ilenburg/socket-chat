package com.chat;

import com.chat.tcp.Server;
import com.chat.tcp.ChatConnection;
import java.io.IOException;
import java.net.Socket;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChatApplicationTests {

	@Test
	public void contextLoads() {
	}

        @Test
        public void connectionSetup() {
            try {
                Server server = new Server(198);
                ChatConnection client = new ChatConnection("127.0.0.1", 198, "user2");
            }
            catch(IOException ex) {
                ex.printStackTrace();
            }
        }
}
