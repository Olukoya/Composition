
public class Person
{
	//composition has-a relationship
    private Job job;
    
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }
    
    Education item= new Education ();
    Job work = new Job ();
    
	public String toString(){
		return job.toString();
}
	public Job getJob() {
		return job;
	}
	
}
