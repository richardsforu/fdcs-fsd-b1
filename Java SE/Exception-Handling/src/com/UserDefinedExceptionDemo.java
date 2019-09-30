package com;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {

		String[] cities = { "HYD", "KOL", "DL", "KL" };

		String key = "Bla";
		boolean flag = false;
		for (String cityName : cities) {
			if (cityName.equals(key)) {
				flag = true;
			}
		}

		if (flag) {
			System.out.println("Found");
		} else {
			try {
				throw new NoSuchCityFoundException(key + " City Not Foound");
			}catch(NoSuchCityFoundException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}

	}

}
