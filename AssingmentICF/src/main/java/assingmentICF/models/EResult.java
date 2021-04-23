package assingmentICF.models;

public class EResult {
	
	private int status;
	private Employee content; // will have account details of inserted, updated, deleted
	private String reason;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Employee getContent() {
		return content;
	}
	public void setContent(Employee content) {
		this.content = content;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public EResult()
	{
		
	}
	public EResult(int status, Employee content, String reason) {
		this.status = status;
		this.content = content;
		this.reason = reason;
	}
	

}
