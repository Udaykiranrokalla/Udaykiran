package com;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService

public class data {

@WebMethod
	public ArrayList<String> details()
	{
		return details();
	}
	@WebMethod
	public ArrayList<String> details(String al)
	{
		return details(al);
	}
}
