package com.bit.spring04.springJava2;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // Java
    	
//    	Module01 module = new Module01();
//    	module.func1();
    	
    	FrontModule f = new FrontModule(new Module01());
//    	f.module = new Module01();
//    	f.started();
//    	f.module = new Module02();
//    	f.setModule(new Module01());
    	f.started();
    }
}
