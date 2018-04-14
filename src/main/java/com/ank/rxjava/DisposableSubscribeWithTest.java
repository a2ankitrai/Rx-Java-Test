package com.ank.rxjava;

import static com.ank.rxjava.helper.ObservableHelper.getPersonObservable;

import com.ank.rxjava.resource.Person;

import io.reactivex.observers.DisposableObserver;

public class DisposableSubscribeWithTest {

	public static void main(String[] args) {
		
		DisposableObserver<Person> disposableObserver = getPersonObservable().subscribeWith(new  DisposableObserver<Person>() {

		    @Override
		    public void onNext(Person p) { 
		    	System.out.println("Person name: " + p.getName() +" :: Person age: "+ p.getAge());
		    }

		    @Override
		    public void onError(Throwable e) { 
		    	System.out.println("Error occured : " + e.getMessage());
		    }

		    @Override
		    public void onComplete() { 
		    	System.out.println("Observing complete."); 
		    }
		});
		
		if(!disposableObserver.isDisposed()) {
			
			System.out.println("Observer not disposed yet. Disposing...");
			disposableObserver.dispose();
			System.out.println("Is Observer disposed? -> " + disposableObserver.isDisposed());
			
		} 
	}
}
