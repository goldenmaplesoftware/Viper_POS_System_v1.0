package POS;
import POS.StockLists.VideoGamesPrices;
import POS.UserControl.NameOfUser;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) ///This is where the user is prompted to make their selections
    {
        System.out.println("****VIPER POINT OF SALES SYSTEM--BETA V 1.0****\n");
        ///Introduction Message when app is opened
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to A$APGAMEGUYS Video Game Store:\nPlease Enter Your Name Below!\n");
        NameOfUser userEntries=new NameOfUser(input.nextLine());

        Scanner moneyInput=new Scanner(System.in);

        ///Display Menu prompt
        InventoryMenuAdd(userEntries,input);
    }

    private static <videoGameTotalPrice> double InventoryMenuAdd(NameOfUser userEntries, Scanner input) ///This is the main menu where all the action happens...
    {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();

        char userInput2=0; ///Controls the switch case the dominates the options
        double totalOwed=0;

        do  //Loops until the user wants to terminate the session
        {
            System.out.println("******************************\n" +"Products Menu:");
            System.out.println("******************************\n");
            System.out.println("******************************\n" +"Main Menu:");
            System.out.println("******************************\n");
            System.out.println("Please select the following options\n" + "Look at shopping cart (S)\n" + "Add products (P)\n" + "Remove products(R)\n" + "Get total(T)\n" + "Checkout customers goods (E)\n" + "Please enter an corresponding letter:\n ");
            userInput2 = input.nextLine().trim().toUpperCase().charAt(0);

            ///Quantity of titles
            int title1Quantity=3;
            int title2Quantity=5;

            switch (userInput2)
            {

                case 'S': ///Inventory that was selected
                    System.out.println("Welcome to your shopping cart\n" + userEntries);
                    System.out.println("This is the current inventory:\nProduct Title List" + products + "\nProduct Price List" + productPrices + "\n");
                    break;

                case 'P': ///Purchase Products

                    ///Array field that populates for titles available
                    System.out.println("\n******************************\nTITLES IN STOCK:\n******************************\n");

                    ///Title Names inputted in field
                    String title1Name = "Super Mario 3D World";
                    String title2Name = "Resident Evil New Village";
                    String title3Name = "Call of Duty: Vanguard";
                    String title4Name = "Halo Infinite";
                    String title5Name = "Battlefield 2042";
                    String title6Name = "Metroid Dread";

                    ///Titles prices inputted in field
                    double title1Value = 55.00;
                    double title2Value = 70.00;
                    double title3Value = 70.00;
                    double title4Value = 80.00;
                    double title5Value = 80.00;
                    double title6Value = 70.00;



                    ///Description fields
                    String title1_description="Super Mario 3D World is a platform game developed and published by Nintendo for the Wii U in November 2013. It is the sixth original 3D platform game in the Super Mario series and the sequel to Super Mario 3D Land for the Nintendo 3DS.";
                    String title2_description="Resident Evil Village is a 2021 first-person survival horror game developed and published by Capcom. It is the sequel to Resident Evil 7: Biohazard.";
                    String title3_description="Call of Duty: Vanguard is an upcoming 2021 first-person shooter video game developed by Sledgehammer Games and published by Activision.";
                    String title4_description="Halo Infinite is an upcoming first-person shooter game developed by 343 Industries and published by Xbox Game Studios for Microsoft Windows, Xbox One, and Xbox Series X and Series S. The sixth main entry of the Halo series and the sixteenth Halo game overall, it continues the story of the Master Chief, following Halo 5: Guardians (2015).";
                    String title5_description="Battlefield 2042 is an upcoming first-person shooter video game developed by DICE and published by Electronic Arts";
                    String title6_description="Metroid Dread is the first new 2D Metroid game to arrive in 19 years, and will finally wrap up the story arc originally started in 1986. Arriving later this year, the game is introducing several new elements for this Switch release, and pinching a few ideas and mechanics from the 2017 3DS release, Metroid: Samus Returns (including free-aiming). ";



                    ///Array List for Prices
                    VideoGamesPrices<Integer, String> title1_name = new VideoGamesPrices<>(1, title1Name);
                    VideoGamesPrices<Integer, String> title2_name = new VideoGamesPrices<>(2, title2Name);
                    VideoGamesPrices<Integer, String> title3_name = new VideoGamesPrices<>(3, title3Name);
                    VideoGamesPrices<Integer, String> title4_name = new VideoGamesPrices<>(4, title4Name);
                    VideoGamesPrices<Integer, String> title5_name = new VideoGamesPrices<>(5, title5Name);
                    VideoGamesPrices<Integer, String> title6_name = new VideoGamesPrices<>(6, title6Name);



                    ///Array List for Prices
                    VideoGamesPrices<Integer, Double> title1_price = new VideoGamesPrices<>(1, title1Value);
                    VideoGamesPrices<Integer, Double> title2_price = new VideoGamesPrices<>(2, title2Value);
                    VideoGamesPrices<Integer, Double> title3_price = new VideoGamesPrices<>(3, title3Value);
                    VideoGamesPrices<Integer, Double> title4_price = new VideoGamesPrices<>(4, title4Value);
                    VideoGamesPrices<Integer, Double> title5_price = new VideoGamesPrices<>(5, title5Value);
                    VideoGamesPrices<Integer, Double> title6_price = new VideoGamesPrices<>(6, title6Value);

                    ///Array List for Descriptions
                    VideoGamesPrices<Integer, String> title1_desc = new VideoGamesPrices<>(1, title1_description);
                    VideoGamesPrices<Integer, String> title2_desc = new VideoGamesPrices<>(2, title2_description);
                    VideoGamesPrices<Integer, String> title3_desc = new VideoGamesPrices<>(3, title3_description);
                    VideoGamesPrices<Integer, String> title4_desc = new VideoGamesPrices<>(4, title4_description);
                    VideoGamesPrices<Integer, String> title5_desc = new VideoGamesPrices<>(5, title5_description);
                    VideoGamesPrices<Integer, String> title6_desc = new VideoGamesPrices<>(6, title6_description);





                    ///Global List From Store

                    ///Title List to Populate
                    ArrayList<VideoGamesPrices<Integer, String>> gameTitlesGlobalStore = new ArrayList<>();
                    /*
                    System.out.println("DEBUG OF TITLE LIST ARRAY");
                    gameTitlesGlobalStore.add(title1_name);
                    gameTitlesGlobalStore.add(title2_name);
                    System.out.println(gameTitlesGlobalStore.size()); ///This will test if the main array of the pairing will remove the elements
                    gameTitlesGlobalStore.remove(title1_name);
                    System.out.println(gameTitlesGlobalStore.size());
                    */
                    ///Price List To Populate
                    ArrayList<VideoGamesPrices<Integer, Double>> gamePricesGlobalStore = new ArrayList<>();

                    ///Description List to Populate
                    ArrayList<VideoGamesPrices<Integer, String>> gameDescriptionsGlobalStore = new ArrayList<>();


                    /*
                    System.out.println("DEBUG OF PRICE LIST ARRAY");
                    gamePricesGlobalStore.add(title1_price);
                    gamePricesGlobalStore.add(title2_price);
                    System.out.println(gamePricesGlobalStore.size()); ///This will test if the main array of the pairing will remove the elements
                    gamePricesGlobalStore.remove(title1_price);
                    System.out.println(gamePricesGlobalStore.size());
                    */

                    ///Console outputs to show the user the properties of the products they want to select
                    System.out.println("|TITLE UPC|    |NAME|   |PRICE|     |Description|");
                    System.out.println(title1_name.getKey() + " --- " + title1_name.getValue() + " ---$ " + title1_price.getValue() + "     --- " +title1_desc.getValue());
                    System.out.println(title2_name.getKey() + " --- " + title2_name.getValue() + " ---$ " + title2_price.getValue() + " --- "  +title2_desc.getValue());
                    System.out.println(title3_name.getKey() + " --- " + title3_name.getValue() + " ---$ " + title3_price.getValue() + " --- "  +title3_desc.getValue());
                    System.out.println(title4_name.getKey() + " --- " + title4_name.getValue() + " ---$ " + title4_price.getValue() + " --- "  +title4_desc.getValue());
                    System.out.println(title5_name.getKey() + " --- " + title5_name.getValue() + " ---$ " + title5_price.getValue() + " --- "  +title5_desc.getValue());
                    System.out.println(title6_name.getKey() + " --- " + title6_name.getValue() + " ---$ " + title6_price.getValue() + " --- "  +title6_desc.getValue());

                    ///END OF LIST

                    System.out.println("******************************\n");
                    System.out.println("Please make your selection by entering the corresponding UPC number in the list");

                    Scanner videoGameSelection = new Scanner(System.in); ///This controls which element is going to be picked in the list
                    int elementPicked = videoGameSelection.nextInt(); ///Element that is picked in the below conditional

                    if (elementPicked == title1_name.getKey()) ///If first title is selected
                    {
                        ///Title Added to Array
                        products.add(title1Name);
                        System.out.println("Updated List Of Entries:\n" + products + "\n");

                        ///Value Added To Array
                        productPrices.add(title1Value);
                        System.out.println("Updated List Of Entries:\n" + productPrices + "\n");

                        ///Total Calculated
                        totalOwed=totalOwed+title1Value;
                        System.out.printf("Updated Total Price:\n$" +"%.2f\n", totalOwed);


                    }

                    else if (elementPicked == title2_name.getKey()) ///If second title is selected
                    {
                        ///Title Added to Array
                        products.add(title2Name);
                        System.out.println("Updated List Of Entries:\n" + products + "\n");

                        ///Value Added To Array
                        productPrices.add(title2Value);
                        System.out.println("Updated List Of Entries:\n" + productPrices + "\n");

                        ///Total Calculated
                        totalOwed=totalOwed+title2Value;
                        System.out.printf("Updated Total Price:\n$" +"%.2f\n", totalOwed);

                    }

                    else if (elementPicked == title3_name.getKey()) ///If third title is selected
                    {
                        ///Title Added to Array
                        products.add(title3Name);
                        System.out.println("Updated List Of Entries:\n" + products + "\n");

                        ///Value Added To Array
                        productPrices.add(title3Value);
                        System.out.println("Updated List Of Entries:\n" + productPrices + "\n");

                        ///Total Calculated
                        totalOwed=totalOwed+title3Value;
                        System.out.printf("Updated Total Price:\n$" +"%.2f\n", totalOwed);

                    }

                    else if (elementPicked == title4_name.getKey()) ///If fourth title is selected
                    {
                        ///Title Added to Array
                        products.add(title4Name);
                        System.out.println("Updated List Of Entries:\n" + products + "\n");

                        ///Value Added To Array
                        productPrices.add(title4Value);
                        System.out.println("Updated List Of Entries:\n" + productPrices + "\n");

                        ///Total Calculated
                        totalOwed=totalOwed+title4Value;
                        System.out.printf("Updated Total Price:\n$" +"%.2f\n", totalOwed);

                    }

                    else if (elementPicked == title5_name.getKey()) ///If fifth title is selected
                    {
                        ///Title Added to Array
                        products.add(title5Name);
                        System.out.println("Updated List Of Entries:\n" + products + "\n");

                        ///Value Added To Array
                        productPrices.add(title5Value);
                        System.out.println("Updated List Of Entries:\n" + productPrices + "\n");

                        ///Total Calculated
                        totalOwed=totalOwed+title5Value;
                        System.out.printf("Updated Total Price:\n$" +"%.2f\n", totalOwed);

                    }

                    else if (elementPicked == title6_name.getKey()) ///If sixth title is selected
                    {
                        ///Title Added to Array
                        products.add(title6Name);
                        System.out.println("Updated List Of Entries:\n" + products + "\n");

                        ///Value Added To Array
                        productPrices.add(title6Value);
                        System.out.println("Updated List Of Entries:\n" + productPrices + "\n");

                        ///Total Calculated
                        totalOwed=totalOwed+title6Value;
                        System.out.printf("Updated Total Price:\n$" +"%.2f\n", totalOwed);

                    }

                    ///This condition gets generated when none of the above options that are selected that have been hardcoded
                    else if(!(elementPicked ==title1_name.getKey())||!(elementPicked ==title2_name.getKey())||!(elementPicked ==title3_name.getKey())||!(elementPicked ==title4_name.getKey())||!(elementPicked ==title5_name.getKey())||!(elementPicked ==title6_name.getKey()))
                    {
                        System.out.println("UPC unidentified, please make another selection! \nRedirecting back to main menu!\n");
                    }

                    break;

                    /*TEMPORARLY OMMITED
                ///TODO PROGRAM THE REMOVE PRODUCTS FROM THE MAIN LOOP CONDITION
                case 'R': ///Remove products

                    break;
                    */
                case 'T': ///Get total
                    System.out.printf("Total Price Without Taxes:\n$" +"%.2f\n", totalOwed);
                    double taxRate=0.13;
                    double totalOwedTaxes= (totalOwed*0.13);
                    double totalOwedFinal=totalOwed+totalOwedTaxes;
                    System.out.printf("Total Price Factoring in Taxes:\n$%.2f\n",totalOwedFinal);



                    break;
            }

        }
        while(userInput2!='E'); ///Terminates Loop

        ///Tax rate is calculated
        double taxRate=0.13;
        double totalOwedTaxes= (totalOwed*0.13);
        double totalOwedFinal=totalOwed+totalOwedTaxes;
        System.out.printf("Checkout Price is owed in cash: $%.2f\n",totalOwedFinal);

        ///Change is calculated
        double cashCustomer;
        Scanner inputCashPaid = new Scanner(System.in);
        System.out.println("Input what the customer paid in cash:");
        cashCustomer = inputCashPaid.nextDouble();
        double change=cashCustomer-totalOwedFinal;
        System.out.printf("The customers change:\n$%.2f",change);
        System.out.println("\nThank you using our application, have an excellent day!");

        return totalOwed;
    }





}