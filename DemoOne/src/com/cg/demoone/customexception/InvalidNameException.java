package com.cg.demoone.customexception;

public class InvalidNameException extends Exception
{
	public InvalidNameException(String s)
	{
		super(s);
	}
}
