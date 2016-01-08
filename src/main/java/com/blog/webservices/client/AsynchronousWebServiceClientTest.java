package com.blog.webservices.client;

import com.blog.webservices.client.MyServiceStub.GetDataResponse;

public class AsynchronousWebServiceClientTest {

	public static void main(String[] args) throws Exception {
		MyServiceStub serviceStub = new MyServiceStub("http://localhost:8080/axis2/services/MyService");
		MyServiceStub.GetData g = new MyServiceStub.GetData();
		g.setInput("Huy");
		MyServiceCallbackHandler callbackHandler = new MyServiceCallbackHandler(){
			
			@Override
			public void receiveResultgetData(GetDataResponse result) {
				super.receiveResultgetData(result);
				System.out.println(result.get_return());
			}
		};
		
		serviceStub.startgetData(g, callbackHandler);
		
		Thread.sleep(5000);
	}

}
