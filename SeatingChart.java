class SeatingChart
{
  Student[][] seats = new Student[5][4];
  int row, column;
  
  public void addStudent(String firstName, String lastName, int row, int column)
  {
    Student newStudent = new Student(firstName, lastName);
    seats[row][column] = newStudent;
  }

  public void printChart()
  {
    System.out.println("-----------------------");
    for(int row = 0; row < seats.length; row++)
    {
      for(column = 0; column < seats[row].length; column++)
      {
        if(seats[row][column] == null)
        {
          System.out.print("*");
        }else{
          System.out.print(seats[row][column].getFirstName());
        }
      }
       System.out.println();
    }
    System.out.println("-----------------------\n");
  }

  public void swapStudents(String firstName, String lastName, int newRow, int newColumn)
  {
    int ogStudentRow=0;
    int ogStudentColumn=0;
    boolean studentExists=false;
      for (int row = 0; row < seats.length; row++)
      {
        for(int column = 0; column < seats[row].length; column++)
        {
          if ( seats[row][column]!=null
          &&seats[row][column].getFirstName().equals(firstName) 
          && seats[row][column].getLastName().equals(lastName) )
         {
           studentExists=true;
           ogStudentRow = row;
           ogStudentColumn = column;
         }
        }
      }
       
      if( studentExists==true)
      {
        Student switchStudent = new Student(firstName, lastName);
        //getting student from original row and assigning to temp variable
        switchStudent = seats[ogStudentRow][ogStudentColumn];
        //assigning student at new spot to original students spot
        seats[ogStudentRow][ogStudentColumn] = seats[newRow][newColumn];
        //moving original student to new student spot
        seats[newRow][newColumn] = switchStudent;
      }else{
          System.out.println("student does not exist");
      }
  }
}
