package com.umut.rest.webservices.restfulwebservices.bean;

public class Entry {
	
	private long id;
	private String writer;
	private String type;
	private String thumbnail;
	private String title;
	private String subTitle;
	private String mainBody;
	
	public Entry() {
		
	}

	public Entry(long id,String writer, String type,  String thumbnail, String title, String subTitle, String mainBody) {
		this.id = id;
		this.writer = writer;
		this.type = type;
		this.thumbnail = thumbnail;
		this.title = title;
		this.subTitle = subTitle;
		this.mainBody = mainBody;
	}
	
	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getMainBody() {
		return mainBody;
	}

	public void setMainBody(String mainBody) {
		this.mainBody = mainBody;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
