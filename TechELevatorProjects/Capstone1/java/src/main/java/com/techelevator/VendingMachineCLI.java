package com.techelevator;

import com.techelevator.Items.Inventory;
import com.techelevator.Items.Item;
import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;

public class VendingMachineCLI {



	public static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	public static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	public static final String MAIN_MENU_OPTION_Exit = "Exit";

	public static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_Exit };

	public static final String ONE_DOLLAR = "$1";
	public static final String FIVE_DOLLARS = "$5";
	public static final String TEN_DOLLARS = "$10";
	public static final String [] MONEY_SELECTION_OPTIONS = {ONE_DOLLAR,FIVE_DOLLARS,TEN_DOLLARS};

	public static final String FEED_MONEY = "Feed Money";
	public static final String SELECT_PRODUCT = "Select Product";
	public static final String FINISH_TRANSACTION = "Finish Transaction";
	public static final String [] PURCHASE_MENU_OPTIONS = {FEED_MONEY,SELECT_PRODUCT,FINISH_TRANSACTION};


	private Menu menu;
	private Scanner scanner = new Scanner(System.in);

	LocalDateTime  localDateTime = LocalDateTime.now();

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}


	private Register register = new Register();

	File logFile = new File("log.txt");
	boolean append = logFile.exists() ? true : false;


	public void run() {

		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equalsIgnoreCase(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {

				displayItems(register.inventory);

			} else if (choice.equalsIgnoreCase(MAIN_MENU_OPTION_PURCHASE)) {

				boolean isPurchase = true;

				while(isPurchase) {

					String purChaseMenuChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);

					if (purChaseMenuChoice.equalsIgnoreCase(FEED_MONEY)) {

						String feedMoneyChoice = (String) menu.getChoiceFromOptions(MONEY_SELECTION_OPTIONS);
						register.moneyFeed(feedMoneyChoice);

						register.printLog("FEED MONEY");


					} else if (purChaseMenuChoice.equalsIgnoreCase(SELECT_PRODUCT)) {

						register.inventory.purchaseDisplayItems();
						register.selectProduct();

						isPurchase = true;

					} else if (purChaseMenuChoice.equalsIgnoreCase(FINISH_TRANSACTION)) {

						register.finishTransaction();
						isPurchase = false;

					}

				}

			}else if(choice.equalsIgnoreCase(MAIN_MENU_OPTION_Exit)){

				System.out.println("Thanks for Using Vendo-Matic 800");
				System.exit(0);
			}

		}

	}


	public void displayItems(Inventory inventory){
		Map<String, Item> itemList = inventory.getInventoryMap();

		for(String s : itemList.keySet()){

			String name = itemList.get(s).getName();
			int quantity = itemList.get(s).getQuantity();
			if(quantity == 0){

				String soldOut = "SOLD OUT";
				System.out.println(String.format("%-20s  %-20s",name, soldOut));
			}else{
				System.out.println(String.format("%-20s  %-20s",name, quantity));
			}

		}
	}


	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
