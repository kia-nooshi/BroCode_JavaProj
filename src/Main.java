public class Main {
    public static void main(String[] args){
        //2D array = An array where each element is an array
        // Useful for storing a matrix of data

//        String[] fruits = {"apple", "orange", "banana"};
//        String[] vegetables = {"potato", "onion", "carrot"};
//        String[] meats = {"chicken", "pork", "beef", "fish"};
//
//        //to combine all arrays you combine them into a grid or matrix
//        String[][] groceries = {fruits, vegetables, meats};
//
//        //Works the same as above
//        String[][] groceries = {{"apple", "orange", "banana"},
//                                {"potato", "onion", "carrot"},
//                                {"chicken", "pork", "beef", "fish"}};
//
//        //to change an element you need 2 indices
//        //first index is row, second index is column
//        groceries[0][0] = "pineapple";
//        groceries[1][2] = "celery";
//        groceries[2][1] = "eggs";
//
//
//        //to display the data you need a nested loop
//        for(String[] foods : groceries){
//            for(String food : foods){
//                System.out.print(food + " ");
//            }
//            System.out.println();
//        }

        //printing a phone dialpad
        char[][] telephone = {  {'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'}};

        for(char[] row: telephone){
            for(char number: row){
                System.out.print(number + " ");
            }
            System.out.println();

        }



    }
}
