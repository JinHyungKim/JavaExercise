class Business implements Cloneable{
	private String company;
	private String work;	
	public Business(String company, String work){
		this.company = company;
		this.work = work;
	}
	
	public void changeCompany(String company){
		this.company = company;
	}
	
	public void changeWork(String work){
		this.work = work;
	}
	
	public void showBusinessInfo(){
		System.out.println("company: "+company);
		System.out.println("work: "+work);
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bz;
	public PersonalInfo(String name, int age, String company, String work){
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
	public void changeAge(int age){
		this.age = age;
	}
	
	public void changeCompany(String company){
		bz.changeCompany(company);	
	}
	
	public void changeWork(String work){
		bz.changeWork(work);
	}

	public void showPersonalInfo(){
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		bz.showBusinessInfo();
		System.out.println();
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		PersonalInfo copy = (PersonalInfo)super.clone();

		copy.bz = (Business)bz.clone();
		return copy;
	}
}

class JavaExercise19_2{
	public static void main(String[] args){
		
		try{
			PersonalInfo pRef = new PersonalInfo("Kim", 30, "samsung", "SI");
			PersonalInfo pCpy = (PersonalInfo)pRef.clone();
			
			pRef.showPersonalInfo();
			pCpy.showPersonalInfo();
			
			System.out.println();
			System.out.println("CHANGING...");
			System.out.println();
			
			pRef.changeName("Park");
			pRef.changeCompany("NHN");
		
			pRef.showPersonalInfo();
			pCpy.showPersonalInfo();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}
}
