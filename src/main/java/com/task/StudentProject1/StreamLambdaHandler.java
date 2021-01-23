package com.task.StudentProject1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.amazonaws.serverless.exceptions.ContainerInitializationException;
import com.amazonaws.serverless.proxy.internal.LambdaContainerHandler;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;
import com.amazonaws.serverless.proxy.spring.SpringBootLambdaContainerHandler;
import com.amazonaws.serverless.proxy.spring.SpringBootProxyHandlerBuilder;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;


public class StreamLambdaHandler   implements  RequestStreamHandler {


	private static SpringBootLambdaContainerHandler<AwsProxyRequest, AwsProxyResponse> handler;
	static {
		try 
		{
			LambdaContainerHandler.getContainerConfig().setInitializationTimeout(50_000);
			handler=new SpringBootProxyHandlerBuilder<AwsProxyRequest>()
			.defaultProxy()
			.asyncInit()
			.springBootApplication(StudentProject1Application.class )
			.buildAndInitialize();
			
		}
		catch (ContainerInitializationException e) 
		{
			e.printStackTrace();
			 throw new RuntimeException("error", e);
			// TODO: handle exception
		}
	}

	
	// override method

	@Override
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	
	
}
