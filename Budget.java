/**
* @author  Anurag Dasari // 
* ITSC1212 - 001, Mazumder
* @version 1.0 // add .1 for each update
* @since   2021-02-22 // date last updated
* Project 1A(M1-M2)
* This application is a budget planner that calculates required Hours a grader/TA at CCI needs to
//work to cover their living expenses.
*/
public class Budget {
    public static void main(String[] args) {
        // *************
        // Project 1
        // *************
        int hrlyWage= 10;                                       //Hourly wage
        int mntRent= 625;                                       //Monthly Rent of apartment
        int intServ= 27;                                        //Monthly internet service bill
        int grocBill= 250;                                      //Monthly grocery bill
        int fun= 150;                                           //Monthly 'Fun' allowance
        int total=mntRent+intServ+grocBill+fun;                 //Total monthly expenses
        double even=((total)/(double) hrlyWage)/4.0;            //Formula for total hours need to work per week
        int additional= (total+100)/ hrlyWage;                  //Formula for total hours need to work in order
                                                                //to save an additional $100

        System.out.println("The hourly wage is $"+hrlyWage);
        System.out.println("Monthly cost of rent = $"+mntRent);
        System.out.println("Monthly cost of internet service = $"+intServ);
        System.out.println("Monthly cost of groceries = $"+grocBill);
        System.out.println("Monthly 'fun' allowance = $"+fun);
        System.out.println("Total monthly expenses are $"+total);
        System.out.println("Student should work "+even+" hours to break even");
        System.out.println("To save an additional $100, student should work "+additional+" hours a month");
    }
    
}
