package com.ank.rxjava;

import static com.ank.rxjava.helper.ObservableHelper.getBeerObservable;
import static com.ank.rxjava.helper.ObservableHelper.getStringObservable;

import com.ank.rxjava.resource.Beer;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class DisposableSubscribeTest {
 
	public static void main(String[] args) {
		
		Observable<Beer> myBeerObservable  = getBeerObservable();		
		Disposable disposable = myBeerObservable.subscribe(t -> System.out.print(t+" <-> "));
		
		Observable<String> myStringObservable = getStringObservable();
		
		Disposable disposable2 = myStringObservable.subscribe(t -> System.out.print(t+" <-> "));
		disposable.dispose();
		disposable2.dispose();
	}
}
