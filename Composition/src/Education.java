
public class Education 
{

	private String school;
	
	public String getSchool() {
		return "LIST OF SCHOOLS\n\n"
				+ "1. Havard\n"
				+ "2. Montgomery\n"
				+ "3. Simon Business School\n"
				+ "4. Yale\n"
				+ "5. Chicago Booth\n"
				+ "6. CMU\n"
				+ "7. GWU\n"
				+ "8. University of Maryland\n"
				+ "9. Tepper\n"
				+ "10. Kelloggs Business School\n";
	}

	public void setSchool(String school) {
		this.school = school;
	}
	public Education()
	{
			
	}
	
	public String toString(){
		return school.toString();
	}
}
