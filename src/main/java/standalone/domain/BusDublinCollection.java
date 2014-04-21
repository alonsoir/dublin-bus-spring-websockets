package standalone.domain;

import java.util.List;

public class BusDublinCollection {
	private String type;
	private List<BusData> features;
	private BusCollectionMetaData metadata;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<BusData> getFeatures() {
		return features;
	}
	public void setFeatures(List<BusData> features) {
		this.features = features;
	}
	
	public BusCollectionMetaData getMetadata() {
		return metadata;
	}

	public void setMetadata(BusCollectionMetaData metadata) {
		this.metadata = metadata;
	}
	@Override
	public String toString() {
		return "BusDublinCollection [type=" + type + ", features=" + features
				+ ", metadata=" + metadata + "]";
	}

}
