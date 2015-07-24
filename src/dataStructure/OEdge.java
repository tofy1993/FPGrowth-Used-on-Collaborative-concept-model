package dataStructure;

public class OEdge {
	Integer sourceId;
	Integer sourceType;
	Integer targetId;
	Integer targetType;
	double rate;
	
	public OEdge() {
		sourceId=-1;
		sourceType=-1;
		targetId=-1;
		targetType=-1;
		rate=-1.0;
	}
	
	public OEdge(Integer sourceId, Integer sourceType, Integer targetId,
			Integer targetType, double rate) {
		this.sourceId = sourceId;
		this.sourceType = sourceType;
		this.targetId = targetId;
		this.targetType = targetType;
		this.rate = rate;
	}

	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public Integer getSourceType() {
		return sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}
	public Integer getTargetId() {
		return targetId;
	}
	public void setTargetId(Integer targetId) {
		this.targetId = targetId;
	}
	public Integer getTargetType() {
		return targetType;
	}
	public void setTargetType(Integer targetType) {
		this.targetType = targetType;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
}
