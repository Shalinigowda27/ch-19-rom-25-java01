class Book{

	String bookName;
	String authorName;
	int    noOfCopies;
	String genre;
	boolean isBookAvailable;
	int    pageCount;
	
	public void getBookInfo(){
	
	System.out.println("The book name is "+ bookName);
	System.out.println("The author name is "+ authorName);
	System.out.println("The number of copies available are "+ noOfCopies);
	System.out.println("The genre is "+ genre);
	System.out.println("Is book available "+ isBookAvailable);
	System.out.println("The number of page counts are "+ pageCount);
	
	
	}

}