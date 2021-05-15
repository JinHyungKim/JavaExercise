class Point{
	private int xPos;
	private int yPos;
	public Point(int x, int y){
		xPos = x;
		yPos = y;
	}

	 @Override
	 public boolean equals(Object obj){
	 	if(this.xPos == ((Point)obj).xPos && this.yPos == ((Point)obj).yPos)
	 		return true;
	 	else 
	 		return false;
	}
}

class Rectangle{
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int x2, int y1, int y2){
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}

	  @Override
	  public boolean equals(Object obj){
	  	if(this.upperLeft.equals(((Rectangle)obj).upperLeft) && this.lowerRight.equals(((Rectangle)obj).lowerRight))
	  		return true;
	  	else
	  		return false;
	 }
}

class JavaExercise19_1{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(1,4,1,4);
		Rectangle r2 =r1;
		Rectangle r3 = new Rectangle(1,4,1,4);

		if(r1.equals(r3))
			System.out.println("smae");
		else	
			System.out.println("diff");
	}
}
