package com.spring.sample.service.impl;

import com.spring.sample.dao.SampleMapper;
import com.spring.sample.domain.Sample;
import com.spring.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SampleService")
public class SampleServiceImpl implements SampleService {
    //private static final Logger log = LoggerFactory.getLogger(SampleServiceImpl.class);
    @Autowired
    SampleMapper sampleMapper;

    public List<Sample> selectSampleList() {
        return sampleMapper.selectSampleList();
    }

    public int insertSample(Sample sample){
        return sampleMapper.insertSample(sample);
    }

    public int deleteSample(Sample sample){
        return sampleMapper.deleteSample(sample);
    }

    public int updateSample(Sample sample){
        return sampleMapper.updateSample(sample);
    }
}
