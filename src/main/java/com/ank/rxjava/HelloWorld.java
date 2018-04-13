package com.ank.rxjava;

import  io.reactivex.Flowable;
import io.reactivex.Observable;

public class HelloWorld {
	
	String result = "";
	
	public void returnAValue(){
		result = "";
        Observable<String> observer = Observable.just("Hello"); // provides datea
        observer.subscribe(s -> result=s); 
        System.out.println(result);
       
	}
	
	public static void main(String[] args) {
		Flowable.just("Starting React").subscribe(System.out::println);
         
		HelloWorld obj = new HelloWorld();
		obj.returnAValue();
        
    }
}
