package com.springrest.springrest.services;

/*import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;*/
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	/* List<Course> list; */

	public CourseServiceImpl() {
		/*
		 * list = new ArrayList<>();
		 * 
		 * list.add(new Course(145, "Java core Course", "This is core Java Course"));
		 * list.add(new Course(4343, "Spring Boot Course",
		 * "This is Spring Boot Course")); list.add(new Course(1524, "Python Course",
		 * "This is python"));
		 */
	}

	@Override
	public List<Course> getCourses() {
		/* return list; */
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourses(long courseId) {
		/* Course c = null; */
		/*
		 * for(Course course:list) { if(course.getId() == courseId) { c=course; break; }
		 * }
		 */
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		/* list.add(course); */
		courseDao.save(course);
		return course;
		
	}

	/*@Override
	public Course updateCourse(Course course) {
		Course c  = null;
		for(Course course1:list) {
			if(course1.getId() == course.getId())
			{
				list.remove(course1);
				list.add(course);
				c=course;
				break;
			}
		}
		return c;
	} */
	public Course updateCourse(Course course) {
		/*
		 * list.forEach(e ->{ if(e.getId()== course.getId()) {
		 * e.setTitle(course.getTitle()); e.setDescrition(course.getDescrition()); } });
		 */
		courseDao.save(course);
		return course;
	}
	/*@Override
	public Course deleteCourse(long courseId) {
		Course c  = null;
		for(Course course:list) {
			if(course.getId() == courseId)
			{
				list.remove(course);
				c=course;
				break;
			}
		}
		return c;
	} */
	@SuppressWarnings("deprecation")
	public void deleteCourse(long courseId) {
		/*
		 * list=this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.
		 * toList());
		 */
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}
}
