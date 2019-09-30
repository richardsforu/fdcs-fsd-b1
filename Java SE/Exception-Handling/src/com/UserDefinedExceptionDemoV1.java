package com;

public class UserDefinedExceptionDemoV1 {

	public static void main(String[] args) {

		String[] cities = { "HYD", "KOL", "DL", "KL" };

		String key = "UK";
		boolean flag = false;
		for (String cityName : cities) {
			if (cityName.equals(key)) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("Found");
		} else {

			throw new NoSuchCityFoundExceptionV1(key + " City Not Foound");

		}

	}

}
