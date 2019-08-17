package com.PAChallenge.demo.beans;

public class Job {

	private String jobID;
	private String status;
	private double progress;
	

	public Job(String jobID, String status, double d) {
		this.jobID = jobID;
		this.status = status;
		this.progress = d;
	}


	public String getJobID() {
		return jobID;
	}


	public void setJobID(String jobID) {
		this.jobID = jobID;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public double getProgress() {
		return progress;
	}


	public void setProgress(float progress) {
		this.progress = progress;
	}


	@Override
	public String toString() {
		return "Job [jobID=" + jobID + ", status=" + status + ", progress=" + progress + "]";
	}
	
	
}
