package standalone.domain;


public class BusData {
	private String id;
	private String type;
	private BusProperty properties;
//	private QuakeGeometry geometry;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public BusProperty getProperties() {
		return properties;
	}
	public void setProperties(BusProperty properties) {
		this.properties = properties;
	}
	
//	public QuakeGeometry getGeometry() {
//		return geometry;
//	}
//	public void setGeometry(QuakeGeometry geometry) {
//		this.geometry = geometry;
//	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BusData [id=" + id + ", type=" + type + ", properties="
				+ properties + "]";
	}

}
