package com.spring.sample.dao;

import com.spring.sample.domain.Sample;

import java.util.List;

public interface SampleMapper {
    List<Sample> selectSampleList();
    int insertSample(Sample sample);
    int deleteSample(Sample sample);
}
