class Main {
  public static void main(String[] args) {
    SeatingChart classChart = new SeatingChart();
    classChart.addStudent("Tehilla", "Feldman", 0, 0);
    classChart.addStudent("Batya", "Feldman", 0, 1);
    classChart.addStudent("Donny", "Feldman", 0, 2);
    classChart.addStudent("Shragi", "Smith", 0, 3);
    classChart.addStudent("John", "Smith", 1, 0);
    classChart.addStudent("Sarah", "Smile", 1, 2);
    classChart.addStudent("Cassidy", "Core", 1, 3);
    classChart.addStudent("Carol", "Borison", 2, 0);
    classChart.addStudent("Ashley", "Levy", 2, 3);
    classChart.addStudent("andrew", "johnson", 3, 0);
    classChart.addStudent("Jake", "Klein", 3, 3);
    classChart.addStudent("Audrey", "Tuck", 4, 0);
    classChart.addStudent("Tova", "Feldman", 4, 2);
    classChart.printChart();
    classChart.swapStudents("John", "Smith", 2, 0);
    classChart.swapStudents("Batya", "Feldman", 2, 2);
    classChart.addStudent("Carol", "Borison", 1, 0);
    classChart.printChart();
  }
}

