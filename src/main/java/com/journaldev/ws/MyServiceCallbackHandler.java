/**
 * MyServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
package com.journaldev.ws;


/**
 *  MyServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class MyServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public MyServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public MyServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getObjectData method
     * override this method for handling normal response from getObjectData operation
     */
    public void receiveResultgetObjectData(
        com.journaldev.ws.MyServiceStub.GetObjectDataResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getObjectData operation
     */
    public void receiveErrorgetObjectData(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getData method
     * override this method for handling normal response from getData operation
     */
    public void receiveResultgetData(
        com.journaldev.ws.MyServiceStub.GetDataResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getData operation
     */
    public void receiveErrorgetData(java.lang.Exception e) {
    }
}
