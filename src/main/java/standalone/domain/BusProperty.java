package standalone.domain;




public class BusProperty {
	
	private String href;
	private String name; 
	private String location; 
	private String active;
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "BusProperty [href=" + href + ", name=" + name + ", location="
				+ location + ", active=" + active + "]";
	}
	
}