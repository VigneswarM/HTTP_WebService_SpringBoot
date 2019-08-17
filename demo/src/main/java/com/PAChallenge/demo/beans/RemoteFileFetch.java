package com.PAChallenge.demo.beans;

public class RemoteFileFetch {

	private String url;
	private String jobID;

	public RemoteFileFetch(String url, String jobID) {
		this.url = url;
		this.jobID = jobID;
	}

	@Override
	public String toString() {
		return "RemoteFileFetch [url=" + url + ", jobID=" + jobID + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

}
