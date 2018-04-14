package com.ank.rxjava.helper;

import java.util.Arrays;
import java.util.List;

import io.reactivex.Single;

public class SingleHelper {
  
	public static Single<List<String>> getStringSingle() {

		Single<List<String>> myStrSingleLambda = Single.create(emitter -> {

			try {
				List<String> numberList = Arrays.asList("1", "2", "3", "4", "5");

				emitter.onSuccess(numberList);
			} catch (Exception e) {
				emitter.onError(e);
			}
		});

		return myStrSingleLambda;
	}
}
