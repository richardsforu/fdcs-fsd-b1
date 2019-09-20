package com;

public class CourseTest {

	public static void main(String[] args) {
		
		Course[] courseList=new Course[5];
		
		courseList[0]=new Course(10, "Abc", 100, 1500);
		courseList[1]=new Course(11, "Xyz", 200, 1200);
		courseList[2]=new Course(12, "Abj", 300, 1100);
		courseList[3]=new Course(13, "Kjy", 900, 1600);
		courseList[4]=new Course(14, "Avf", 200, 1900);
		
		for(Course course:courseList) {
			course.display();
		}
		

	}

}
