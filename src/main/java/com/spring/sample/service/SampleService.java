package com.spring.sample.service;

import com.spring.sample.domain.Sample;

import java.util.List;

public interface SampleService {
    List<Sample> selectSampleList();
    int insertSample(Sample sample);
}
