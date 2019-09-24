package com.tcs;

public class CourseDemo {
	

	public static int getCount(Course[] courselist, int duration) {
		int length=0;
		for (int i = 0; i < courselist.length; i++) {
			if (courselist[i].getDuration() < duration) {
				if (courselist[i].getMaxCapacity() - courselist[i].getNoOfLearners() > 10) {
					
					length++;
				}

			}
		}
		return length;
		
	}
	
	public static Course[] findCourses(Course[] courselist, int duration) {

		
		Course[] courses = new Course[CourseDemo.getCount(courselist, duration)];
		int length=0;
		
		for (int i = 0; i < courselist.length; i++) {
			if (courselist[i].getDuration() < duration) {
				if (courselist[i].getMaxCapacity() - courselist[i].getNoOfLearners() > 10) {
					courses[length] = courselist[i];
					length++;
				}

			}
		}

		return courses;
	}
	

	public static String updateFees(Course course) {

		return null;
	}

}
