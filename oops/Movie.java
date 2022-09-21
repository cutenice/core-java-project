/*
@author:Neelam Ghodake
@date  :20 sep 2022
Program:Declaring a class and its objects
*/
  //declaring a theatre class
  class Theatre
  {
    //declaring properties
	private String movieName;
	private String movieTime;
	private double ticketPrice;
	
	//method to insert movie
	void insertMovie(String movieName,String movieTime,double ticketPrice)
	{
	  this.movieName=movieName;
	  this.movieTime=movieTime;
	  this.ticketPrice=ticketPrice;
	  }
	  //method to display movie
	  void displayMovie()
	  {
	  System.out.println("Movie Name:"+this.movieName+"  "+ "Time:"+ this.movieTime+"  "+"Ticket Price:"+this.ticketPrice);
	  }
	}   //end of the class
	
	
	  //declaring class Theatre
	 class Movie
	 {
		 //main method
	 public static void main(String ...args)
	 {
		 //creating movie objects
		 Theatre movie1= new Theatre();
		 movie1.insertMovie("3 Idiots","6pm,9pm",500);  //implicit
		 
		 Theatre movie2= new Theatre();
		 movie2.insertMovie("KGF","10am,11pm",400);
		 
		 Theatre movie3= new Theatre();
		 movie3.insertMovie("Inception 3D","1pm,4pm",650);
		 
		 //display all the movie
		 movie1.displayMovie();
		 movie2.displayMovie();
		 movie3.displayMovie();
		 
		 
		 
	    }
	 }
	
  