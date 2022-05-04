package com.revature.pixott.model;

public class Top5Movie {
private int id;
private int top5movie;
private String name;
public Top5Movie() {	
}
public Top5Movie(int id, int top5movie, String name) {
	super();
	this.id = id;
	this.top5movie = top5movie;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTop5movie() {
	return top5movie;
}
public void setTop5movie(int top5movie) {
	this.top5movie = top5movie;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + top5movie;
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
	Top5Movie other = (Top5Movie) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (top5movie != other.top5movie)
		return false;
	return true;
}
@Override
public String toString() {
	return "Top5Movie [id=" + id + ", top5movie=" + top5movie + ", name=" + name + "]";
}

}
