package com.islomar.bigdata.thrift1;

import com.baeldung.thrift.impl.CrossPlatformService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class CrossPlatformClient {

    public void start() throws TException {
        System.out.println("Starting the client...");
        TTransport transport = new TSocket("localhost", 9090);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        CrossPlatformService.Client client = new CrossPlatformService.Client(protocol);

        boolean result = client.ping();
        System.out.println("Result: " + result);

        transport.close();
    }
}
