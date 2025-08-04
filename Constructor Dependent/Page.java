class Page{

	int pageNumber;
    String pageTitle;
	Article article;

	public void getPageInfo(){
	
	System.out.println("The page number is "+ pageNumber);
	System.out.println("The page title is "+ pageTitle);
	
	this.article.getArticleInfo();
	}
}