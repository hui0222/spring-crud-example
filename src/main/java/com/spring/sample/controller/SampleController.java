package com.spring.sample.controller;

import com.spring.sample.domain.Sample;
import com.spring.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleController {
    @Autowired
    SampleService sampleService;


    @RequestMapping(path = "/getTest",method = RequestMethod.GET)
    public String getTest2() {
        return "getTest1";
    }

    @RequestMapping(path = "/getsss",method = RequestMethod.GET)
    public String getsss() {
        return "ssss";
    }

    @RequestMapping(path = "/getSampleList",method = RequestMethod.GET)
    public List<Sample> getSampleList() {
        List<Sample> sampleList = sampleService.selectSampleList();
        return sampleList;
    }
}
