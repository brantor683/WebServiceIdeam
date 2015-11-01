package com.example.brandon.myapplication;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by Brandon on 19/10/2015.
 */
public class WebServiceIdeam {


    public WebServiceIdeam(){

    }

    public String getFenomenos() throws IOException, XmlPullParserException
    {

        SoapObject soap = new SoapObject("http://WebServices/","getFenomenos");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(soap);

        HttpTransportSE httpTrans = new HttpTransportSE("http://tausa.ideam.gov.co/portal/WebServicesIDEAMService?WSDL");

        httpTrans.call("getFenomenos",envelope);

        Object resultado = envelope.getResponse();
    return resultado.toString();
    }
}
