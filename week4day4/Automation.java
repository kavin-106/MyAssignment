package week4day4;

public class Automation extends MultipleLanguage{

	@Override
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
		
	}

	@Override
	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby");
	}
	public static void main(String[] args) {
		Automation tools = new Automation();
		tools.java();
		tools.selenium();
		tools.ruby();
	}

}
