package com.krishna.JobApp.repo;

import com.krishna.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo
{
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Devloper", "Must have good experience", 2, List.of("Java")),
            new JobPost(1, "Python Devloper", "Must have good experience in PYSpark", 2, List.of("Pthon, Pyspark"))
    ));

    public List<JobPost> getAllJobs()
    {
        return jobs;
    }

    public void addJob(JobPost job)
    {
        jobs.add(job);
        System.out.println(jobs);
    }

}
