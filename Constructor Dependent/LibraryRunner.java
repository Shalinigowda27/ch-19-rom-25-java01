class LibraryRunner{

	public static void main(String[] args){
	
	Library library = new Library();
	Shelf  shelf = new Shelf();
	Book book = new Book();
	
	library.libraryName = "State Central Library";
	library.librarianName = "Babu Rao";
	library.noOfBooks = 1000;
	library.isLibraryOpen = true;
	library.shelf = shelf;
	
	shelf.noOfShelf = 100;
	shelf.book = book;
	
	book.bookName = "Malegalalli Madhumagalu";
	book.authorName = "Kuvempu";
	book.noOfCopies = 5;
	book.genre = " epic historical‑social realist novel";
	book.isBookAvailable = true;
	book.pageCount = 272;
	
	library.getLibraryInfo();
	
	}
}