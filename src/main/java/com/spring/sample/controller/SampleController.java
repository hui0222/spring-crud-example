package com.spring.sample.controller;

import com.spring.sample.common.ResultBody;
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

    @RequestMapping(path = "/sample/list",method = RequestMethod.GET)
    public ResultBody sampleList() {
        ResultBody resultBody = new ResultBody();

        List<Sample> sampleList = sampleService.selectSampleList();

        resultBody.setResults(sampleList);
        resultBody.setServerCode("200");

        return resultBody;
    }

    @RequestMapping(path = "/sample/insert",method = RequestMethod.GET)
    public ResultBody sampleInsert(Sample sample) {
        //ResultBody resultBody = new ResultBody();

        //todo try catch
        sampleService.insertSample(sample);

        return new ResultBody("insert Success");
    }

    @RequestMapping(path = "/sample/delete",method = RequestMethod.GET)
    public ResultBody sampleDelete(Sample sample) {
        //ResultBody resultBody = new ResultBody();

        //todo hederparam으로 받아도될듯

        //todo try catch
        sampleService.deleteSample(sample);

        return new ResultBody("Delete Success");
    }

    @RequestMapping(path = "/sample/update",method = RequestMethod.GET)
    public ResultBody sampleUpdate(Sample sample) {
        //ResultBody resultBody = new ResultBody();

        //todo 유효성검사

        //todo try catch
        sampleService.updateSample(sample);

        return new ResultBody("update Success");
    }
}
