package com.ictcg.practical_assessment.repository;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

// Found this code at:
//https://books.google.be/books?id=13ECdYRKDXQC&pg=PA477&lpg=PA477&dq=java+get+date+from+remote+computer&source=bl&ots=F9Vsr3MUPo&sig=ACfU3U1TqTmQ-FTPUf5ZfzsGtTKjl0FpDQ&hl=en&sa=X&ved=2ahUKEwi4sZn6s-jhAhUFQBoKHbmxBB8Q6AEwBXoECAcQAQ#v=onepage&q=java%20get%20date%20from%20remote%20computer&f=false

public class DateAtHost extends java.util.Date {
    // seconds from start of 20th century to Jan 1, 1970 00:00 GMT
    static final long offset = 2208988800L;
    static int timePort = 37;

    public DateAtHost(String host) throws IOException {
        this(host, timePort);
    }

    public DateAtHost(String host, int port) throws IOException {
        Socket server = new Socket(host, port);
        DataInputStream din = new DataInputStream(server.getInputStream());
        int time = din.readInt();
        server.close();

        setTime(((1L << 32) + time - offset) * 1000);
    }
}
