package com.ank.rxjava;

import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;

public class CompositeDisposableTest {

	public static void main(String[] args) {
		
		CompositeDisposable compositeDisposable = new CompositeDisposable();
		
		Single<String> single1 = Single.just("Alpha");
		Single<String> single2 = Single.just("Beta");
		Single<String> single3 = Single.just("Gamma");
		
		compositeDisposable.add(single1.subscribeWith(new DisposableSingleObserver<String>() {
		    @Override
		    public void onError(Throwable e) {
		        // handle the error case
		    }

			@Override
			public void onSuccess(String t) {
				System.out.println(t);
			}
		}));
		
		compositeDisposable.add(single2.subscribe(System.out::println));
		 
		compositeDisposable.add(single3.subscribe(System.out::println));
		
		compositeDisposable.dispose();
	}
}
