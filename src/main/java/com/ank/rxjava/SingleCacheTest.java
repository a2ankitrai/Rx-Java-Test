package com.ank.rxjava;

import java.util.List;

import com.ank.rxjava.helper.SingleHelper;

import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;

public class SingleCacheTest {

	public static void main(String[] args) {

		Single<String> single = Single.just("Hello, Single world!");
		single.subscribe(System.out::println);

		Single<List<String>> numberStream = SingleHelper.getStringSingle().cache();

		Disposable disposable = numberStream.subscribeWith(new DisposableSingleObserver<List<String>>() {

			@Override
			public void onSuccess(List<String> numbersList) {
				System.out.println(numbersList);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Error:: " + e.getMessage());
			}
		});

		// continue working and dispose when value of the Single is not interesting any
		// more
		disposable.dispose();

	}

}
