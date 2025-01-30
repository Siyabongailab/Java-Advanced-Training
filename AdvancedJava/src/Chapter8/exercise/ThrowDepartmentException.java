package Chapter8.exercise;

public class ThrowDepartmentException {
    public static void main(String[] args) {
        Department[] departments = new Department[6];  //array of 6 department objects
        String[][] testCases = {
                {"IT", "101", "5"},
                {"HR", "200", "6"},
                {"FIN", "99", "7"},  // Invalid ID
                {"MK", "400", "3"},  // Invalid employees
                {"AI", "450", "9"},
                {"SDE", "300", "11"}  // Invalid employees
        };

        for (int i = 0; i < testCases.length; i++) {
            try {
                departments[i] = new Department(testCases[i][0], Integer.parseInt(testCases[i][1]), Integer.parseInt(testCases[i][2]));
            } catch (DepartmentException e) {
                System.out.println("Failed to create department: " + e.getMessage());
            }
        }
    }
}
