package com.sccs.dao;

import com.sccs.entity.Score;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScoreDao {
    public int create(Score pi);

    public int delete(Map<String, Object> paramMap);

    public int update(Map<String, Object> paramMap);

    public List<Score> query(Map<String, Object> paramMap);

    public Score detail(Map<String, Object> paramMap);

    public int count(Map<String, Object> paramMap);

    public List<HashMap> queryAvgScoreBySection(Map<String, Object> paramMap);

    public List<HashMap> queryScoreByStudent(Map<String, Object> paramMap);
}