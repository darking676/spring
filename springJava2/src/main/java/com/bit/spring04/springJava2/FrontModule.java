package com.bit.spring04.springJava2;

public class FrontModule {
	ModuleInter module;

	public FrontModule(ModuleInter module) {
		this.module = module;
	}
	
//	public void setModule(ModuleInter module) {
//		this.module = module;
//	}
	
	public void started() {
    	module.func1();
	}
}
