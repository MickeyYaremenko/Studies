package by.htp.persons;

public class Worker extends Person{
	private String jobName;
	
	public Worker(int age, String name, Adress adress, String jobName){
		super(age, name, adress);
		this.jobName = jobName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public void cry() {
		System.out.println("I'm proud worker");
	}
	
	

}
