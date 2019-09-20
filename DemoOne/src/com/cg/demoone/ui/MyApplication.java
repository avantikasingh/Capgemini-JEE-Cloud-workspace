package com.cg.demoone.ui;

//import java.util.Scanner;

import com.cg.demoone.customexception.InvalidNameException;
import com.cg.demoone.dto.*;

public class MyApplication {
	

	public static void main(String[] args) {
	
		String a="abc";
		System.out.println(a.hashCode());
		a="bcd";
		System.out.println(a.hashCode());
		
		StringBuffer b=new StringBuffer("pqr");
		System.out.println(b.hashCode());
		
		b.append("mno");
		System.out.println(b.hashCode());
		

	}

}
