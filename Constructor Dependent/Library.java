class Library{

	String libraryName;
	String librarianName;
	int    noOfBooks;
	boolean isLibraryOpen;
	Shelf shelf;
	
	public void getLibraryInfo(){
	
	System.out.println("The library details are: ");
	System.out.println("The library name is "+ libraryName);
	System.out.println("The librarian Name is "+ librarianName);
	System.out.println("The number Of Books available are "+ noOfBooks);
	System.out.println("Is library open "+ isLibraryOpen);
	
	this.shelf.getShelfInfo();
	}

}