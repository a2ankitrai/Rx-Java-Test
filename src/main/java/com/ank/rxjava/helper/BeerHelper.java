package com.ank.rxjava.helper;

import java.util.ArrayList;
import java.util.List;

import com.ank.rxjava.resource.Beer;

public class BeerHelper {

	public static List<Beer> createBeerList(){
	
		 List<Beer> beerList = new ArrayList<>();
		 
		 Beer b1 = new Beer("Corona", Beer.Quality.AWESOME);
		 Beer b2 = new Beer("Heineken", Beer.Quality.AWESOME);
		 Beer b3 = new Beer("CarlsBerg", Beer.Quality.OK);
		 Beer b4 = new Beer("Budweiser", Beer.Quality.OK);
		 Beer b5 = new Beer("Bira", Beer.Quality.POOR);
		 
		 beerList.add(b1);
		 beerList.add(b2);
		 beerList.add(b3);
		 beerList.add(b4);
		 beerList.add(b5);
		 
		 return beerList;
	}
}
