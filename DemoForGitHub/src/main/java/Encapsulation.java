class Book{
	private int pages;

	public void setData(int i) {
		pages=i;
		
	}

	public int getData() {
		return pages;
		
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		Book b = new Book();
		b.setData(10);
		System.out.println(b.getData());
		
		
	}

}
