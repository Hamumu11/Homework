
public class ReaderProfile {
	private String name;
	private String familyName;
	private int grade;
	private String Class;
	private int phoneNum;
	private int collectedBooksCount;
	private Book[] collectedBooks;
	
	ReaderProfile(){
		collectedBooksCount = 0;
	}
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}
	}
	
	public void setFamilyName(String name) {
		if(name != null && !name.isEmpty()) {
			this.familyName = name;
		}
	}
	
	public void setGrade(int grade) {
		if(grade > 0 && grade < 13) {
			this.grade = grade;
		}
	}
	
	public void setClass(String Class) {
		if(Class != null && !Class.isEmpty()) {
			this.Class = Class;
		}
	}
	
	public void setPhoneNum(int num) {
		if(num > 0) {
			this.phoneNum = num;
		}
	}
	
	public void setBookCount(int bookCount) {
		if(bookCount > 0) {
			this.collectedBooksCount = bookCount;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getClassIndex() {
		return Class;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public int getCollectedBooksCount() {
		return collectedBooksCount;
	}
	
	ReaderProfile(String name, String familyName, int grade, String Class, int phoneNum,int collectedBooksCount){
		setName(name);
		setFamilyName(familyName);
		setGrade(grade);
		setClass(Class);
		setPhoneNum(phoneNum);
		setBookCount(collectedBooksCount);
		collectedBooks = new Book[collectedBooksCount];
	}
	
	ReaderProfile(String name, String familyName, int grade, String Class, int phoneNum){
		setName(name);
		setFamilyName(familyName);
		setGrade(grade);
		setClass(Class);
		setPhoneNum(phoneNum);
	}
	
	public String toString() {
		return String.format("Name: %s, Family Name: %s, %dth Grade, Class: %s, Phone Number: %d, Books Taken: %d", getName(), getFamilyName(), getGrade(), getClassIndex(),getPhoneNum(),getCollectedBooksCount());
	}
	
}


