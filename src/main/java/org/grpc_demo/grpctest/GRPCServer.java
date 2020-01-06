package org.grpc_demo.grpctest;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GRPCServer {

	public static void main(String[] args) {
		
		Server server = ServerBuilder.forPort(9090).addService(new EmpService()).build();
		try {
			server.start();
			System.out.println("GRPC server is started running on the port: " + server.getPort());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			server.awaitTermination();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

}
