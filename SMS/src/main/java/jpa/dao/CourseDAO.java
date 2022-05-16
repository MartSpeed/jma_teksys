package jpa.dao;

import jpa.entitymodels.courseEntity;
import java.util.List;

public interface CourseDAO {
	List<Course> getAllCourses(); // one to many table?
}
