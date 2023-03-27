package week6.day1.assignment;

public class Automation extends MultipelLanguage {

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium is automation tool");
	}

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("study java");
	}
	
	public void ruby() {
		System.out.println("ruby method");
	}
	
	public static void main(String[] args) {
		
		Automation ass = new Automation();
		ass.selenium();
		ass.java();
		ass.ruby();
		ass.python();
	}

}
