package com.example.couseplusplus.data.course;

/**
 * @author Yuki Misumi (u7582380)
 */
public class FirebaseCourse {
  String courseCode;

  String courseName;

  public FirebaseCourse() {}

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }
}
