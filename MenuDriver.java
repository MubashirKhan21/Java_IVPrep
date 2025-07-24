package Training;

import java.util.Scanner;

	public class MenuDriver {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n======= JAVA PROGRAM MENU =======");
	            System.out.println("1. Calculator");
	            System.out.println("2. CircularShift");
	            System.out.println("3. CompoundInterestArray");
	            System.out.println("4. CoordinateGeometry");
	            System.out.println("5. CountNumbers");
	            System.out.println("6. DecisionControl");
	            System.out.println("7. DistanceConversion");
	            System.out.println("8. Factorial");
	            System.out.println("9. GrossSalary");
	            System.out.println("10. IntelligenceTable");
	            System.out.println("11. Largest_Triangle_Area");
	            System.out.println("12. LeapYearCheck");
	            System.out.println("13. Point");
	            System.out.println("14. ReverseNumber");
	            System.out.println("15. ReverseNumberCheck");
	            System.out.println("16. SteelGrade");
	            System.out.println("17. StraightLineCheck");
	            System.out.println("0. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    Calculator.main(null);
	                    break;
	                case 2:
	                    CircularShift.main(null);
	                    break;
	                case 3:
	                    CompoundInterestArray.main(null);
	                    break;
	                case 4:
	                    CoordinateGeometry.main(null);
	                    break;
	                case 5:
	                    CountNumbers.main(null);
	                    break;
	                case 6:
	                    DecisionControl.main(null);
	                    break;
	                case 7:
	                    DistanceConversion.main(null);
	                    break;
	                case 8:
	                    Factorial.main(null);
	                    break;
	                case 9:
	                    GrossSalary.main(null);
	                    break;
	                case 10:
	                    IntelligenceTable.main(null);
	                    break;
	                case 11:
	                    Largest_Triangle_Area.main(null);
	                    break;
	                case 12:
	                    LeapYearCheck.main(null);
	                    break;
	                case 13:
	                    Point.main(null);
	                    break;
	                case 14:
	                    ReverseNumber.main(null);
	                    break;
	                case 15:
	                    ReverseNumberCheck.main(null);
	                    break;
	                case 16:
	                    SteelGrade.main(null);
	                    break;
	                case 17:
	                    StraightLineCheck.main(null);
	                    break;
	                case 0:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 0);

	        scanner.close();
	    }
	}