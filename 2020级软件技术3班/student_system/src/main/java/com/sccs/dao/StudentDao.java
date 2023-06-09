package com.sccs.dao;

import com.sccs.entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentDao {
    public int create(Student pi);

    public int delete(Map<String, Object> paramMap);

    public int update(Map<String, Object> paramMap);

    public List<Student> query(Map<String, Object> paramMap);

    public Student detail(Map<String, Object> paramMap);

    public int count(Map<String, Object> paramMap);

    public List<HashMap> querySelectStudent(Map<String, Object> paramMap);

    public List<Student> queryStudentByTeacher(Map<String, Object> paramMap);
}