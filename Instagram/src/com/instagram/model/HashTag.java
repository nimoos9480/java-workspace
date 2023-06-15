package com.instagram.model;

import java.util.List;

public class HashTag {
	
	private String tagName;
    private List<Posting> relatedPostings;
    
	public HashTag() {
	}

	public HashTag(String tagName, List<Posting> relatedPostings) {
		this.tagName = tagName;
		this.relatedPostings = relatedPostings;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<Posting> getRelatedPostings() {
		return relatedPostings;
	}

	public void setRelatedPostings(List<Posting> relatedPostings) {
		this.relatedPostings = relatedPostings;
	}

	@Override
	public String toString() {
		return "HashTag [tagName=" + tagName + ", relatedPostings=" + relatedPostings + "]";
	}
	
	
    


}
