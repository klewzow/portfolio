package com.gmail.klewzow.services;

import com.gmail.klewzow.entity.WorkExample;
import com.gmail.klewzow.repositories.WorkExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WorkExampleService {

    private final WorkExampleRepository workExampleRepository;

    @Autowired
    public WorkExampleService(WorkExampleRepository workExampleRepository) {
        this.workExampleRepository = workExampleRepository;
    }

    public ResponseEntity<WorkExample> addDemoProject(WorkExample workExample) {
        System.out.println( workExample.getTitleProject().equals(""));
        if(
                workExample.getTitleProject().equals("") ||
                workExample.getSubTitleProject().equals("")
        )
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else{
            workExampleRepository.save(workExample);
            return new ResponseEntity<>(workExample,HttpStatus.OK);
        }




    }

}
