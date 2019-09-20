package com.tcs;

public class Test {

	public static void main(String[] args) {

		Course[] courselist = new Course[4];
		
		courselist[0] = new Course("C001", "Java", 10, 500, 15000, 50);
		courselist[1] = new Course("C002", "CPP", 10, 15, 15000, 50);
		courselist[2] = new Course("C003", "JS", 10, 200, 15000, 50);
		courselist[3] = new Course("C004", "React JS", 14, 5, 15000, 50);

		Course[] cl = CourseDemo.findCourses(courselist, 60);
		
		for (Course c : cl) {
			
			c.getCourselD();
			System.out.println(c.getName());
		}

	}

}
