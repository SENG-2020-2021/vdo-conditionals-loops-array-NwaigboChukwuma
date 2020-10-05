class Main {
  public static void main(String[] args) {
     //declare an array variable and assign the days of the month debtor defaulted,
        byte[] Days_Defaulted = {1,2,6,9,};

    // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
        float Amount_To_Pay_Per_Day = 1300f;
        float Amount_Paid = 7800f;

    // declare all the variables needed for your calculations
        float Total_Amount_To_Pay = 0f;
        float Total_Amount = 0f;
        byte Days_Paid_For;
        float Amount_Left_To_Pay = 0f;
        float Amount_Left_To_Pay_For_Day = 0f;
        byte Number_Of_Days_Defaulted = 4;
        byte k;
        byte Days_Not_Paid_For;
        float Extra_Amount_Paid;

    // calculate and print total amount the debtor is to pay using for each loop
        for (byte daysDefaulted : Days_Defaulted) {
            Total_Amount += Amount_To_Pay_Per_Day;
            System.out.println("Total Amount to pay = " +Total_Amount);
        }


    // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day.
        Days_Paid_For = (byte) (Amount_Paid / Amount_To_Pay_Per_Day);
        System.out.println("The days the debtor paid for = " + Days_Paid_For + " Days");
        for(k=0;k<4 &&k<Days_Paid_For;k++) {
            for (k = 0; k < Number_Of_Days_Defaulted && k < Days_Paid_For; k++) {
                System.out.print(Days_Defaulted[k] + ",");
            }
        }

        if (Amount_Paid%Amount_To_Pay_Per_Day>0) {
            if (Amount_Paid % Amount_To_Pay_Per_Day > 0 &&k < Number_Of_Days_Defaulted) {
                Amount_Left_To_Pay = Amount_To_Pay_Per_Day - (Amount_Paid % Amount_To_Pay_Per_Day);
                System.out.println("Payment was not complete for day " + Days_Defaulted[k] + "the amount left to pay is " + Amount_Left_To_Pay);
            }
        }
        System.out.println(" ");

    // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
        if (Total_Amount>Amount_Paid){
            Total_Amount_To_Pay = Total_Amount_To_Pay - Amount_Paid;
            Days_Not_Paid_For = (byte) (Number_Of_Days_Defaulted - Days_Paid_For);
            System.out.println("The Amount Left to pay is = " + Amount_Left_To_Pay + "the days not payed for are " + Days_Not_Paid_For);

        }
        else if (Total_Amount==Amount_Paid){
            System.out.println("The amount you paid is enough");
        }
        else{
            Extra_Amount_Paid = Amount_Paid - Total_Amount;
        }

    }
}

  
