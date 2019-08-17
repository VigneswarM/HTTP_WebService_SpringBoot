package com.PAChallenge.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.PAChallenge.demo.beans.Job;
import com.PAChallenge.demo.beans.RemoteFileFetch;

@Service
public class FileService {

	private RemoteFileFetch remoteFileFetch;
	private Job job;
	Random rand = new Random();
	
	//Sample Jobs
	private List<Job> jobList = new ArrayList<>(
			Arrays.asList(new Job("1234", "inprogress", 0.6), new Job("1235", "completed", 1.0)));

	public Job getProgress(String jobID) {
		return jobList.stream().filter(x -> x.getJobID().equals(jobID)).findFirst().get();
	}

	public RemoteFileFetch FetchFile(String filename) {

		String id = String.format("%04d", rand.nextInt(10000));
		remoteFileFetch = new RemoteFileFetch(filename, id);
		AddtoJobs(id);
		return remoteFileFetch;
	}

	private void AddtoJobs(String id) {
		job = new Job(id, "inprogress", Math.round(rand.nextFloat()));
		jobList.add(job);
	}
	
	public List<Job> getallJobs(){
	return jobList;
	}
	
	}
