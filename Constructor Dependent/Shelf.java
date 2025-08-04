class Shelf{

	int noOfShelf;
	Book book;
	
	public void getShelfInfo(){
	
	System.out.println("The number of shelf are "+ noOfShelf);
	
	this.book.getBookInfo();
	}
}