package com.ank.rxjava.helper;

import java.util.Arrays;
import java.util.List;

import com.ank.rxjava.resource.Beer;
import com.ank.rxjava.resource.Person;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

public class ObservableHelper {

	public static Observable<Beer> getBeerObservable() {
		Observable<Beer> myBeerObservable = Observable.create(new ObservableOnSubscribe<Beer>() {

			@Override
			public void subscribe(ObservableEmitter<Beer> emitter) throws Exception {

				try {
					List<Beer> beerList = BeerHelper.createBeerList();

					for (Beer b : beerList) {
						emitter.onNext(b);
					}
					emitter.onComplete();
				} catch (Exception e) {
					emitter.onError(e);
				}
			}
		});

		return myBeerObservable;
	}

	public static Observable<String> getStringObservable() {

		Observable<String> myStrObservableLambda = Observable.create(emitter -> {

			try {
				List<String> numberList = Arrays.asList("1", "2", "3", "4", "5");

				for (String num : numberList) {
					emitter.onNext(num);
				}
				emitter.onComplete();
			} catch (Exception e) {
				emitter.onError(e);
			}
		});

		return myStrObservableLambda;
	}

	public static Observable<Person> getPersonObservable() {

		Observable<Person> myPersonObservableLambda = Observable.create(emitter -> {

			try {
				List<Person> personList =  PersonHelper.createPersonList();
						
				for (Person person : personList) {
					emitter.onNext(person);
				}
				emitter.onComplete();
			} catch (Exception e) {
				emitter.onError(e);
			}
		});

		return myPersonObservableLambda;
	}
}
