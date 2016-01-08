package com.blog.webservices.client;

public class SynchronousWebServiceClientTest {

	public static void main(String[] args) throws Exception {
		MyServiceStub serviceStub = new MyServiceStub("http://localhost:8080/axis2/services/MyService");
		MyServiceStub.GetData request = new MyServiceStub.GetData();
		request.setInput("Huy");
		
		MyServiceStub.GetDataResponse response = serviceStub.getData(request);
		System.out.println(response.get_return());
	}

}
