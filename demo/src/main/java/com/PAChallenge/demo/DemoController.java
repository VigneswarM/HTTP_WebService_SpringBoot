package com.PAChallenge.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.PAChallenge.demo.beans.Job;
import com.PAChallenge.demo.beans.RemoteFileFetch;
import com.PAChallenge.demo.service.FileService;


@RestController
@RequestMapping("/jobs")
public class DemoController {

	@Autowired
	private FileService fileService;

	@ResponseBody
	@RequestMapping(value = "/progress", method = RequestMethod.GET)
	public Job getStatus(@RequestParam String jobID) {
		System.out.println("JobID : " + jobID);
		return fileService.getProgress(jobID);
	}

	@ResponseBody
	@RequestMapping(value = "/fetch", method = RequestMethod.POST)
	public RemoteFileFetch fetchFile(@RequestParam String filename) {
		System.out.println("File URL : " + filename);

		return fileService.FetchFile(filename);
	}

	@ResponseBody
	@RequestMapping(value = "/getallJobs", method = RequestMethod.GET)
	public java.util.List<Job> getStatus() {
		System.out.println("GetaALL_JobID : ");
		return fileService.getallJobs();
	}
	
}