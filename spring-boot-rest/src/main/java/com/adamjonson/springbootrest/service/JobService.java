package com.adamjonson.springbootrest.service;


import com.adamjonson.springbootrest.model.JobPost;
import com.adamjonson.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {

    @Autowired
    private JobRepo repo;
    public void addJob(JobPost jobPost){
        repo.addJobs(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }

}
