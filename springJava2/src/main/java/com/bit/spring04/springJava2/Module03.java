package com.bit.spring04.springJava2;

import java.util.List;

public class Module03 implements ModuleInter {
	
//	private String msg;
//	private String msg2;
	
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
	
//	public void setMsg2(String msg2) {
//		this.msg2 = msg2;
//	}
	
//	private int su1;
//	private int su2;
	
//	public void setSu1(int su1) {
//		this.su1 = su1;
//	}

//	public void setSu2(int su2) {
//		this.su2 = su2;
//	}
	
//	public Module03(String msg) {
//		this.msg = msg;
//	}
	
	List<String> alist;
	
	public void setAlist(List<String> alist) {
		this.alist = alist;
	}

	public void func1() {
//		System.out.println(su1+"+"+su2+"="+(su1+su2));
//		System.out.println(msg+"\r\n"+msg2);
//		System.out.println(msg);
		for(String msg : alist) {
			System.out.println(msg);
		}
	}
}
