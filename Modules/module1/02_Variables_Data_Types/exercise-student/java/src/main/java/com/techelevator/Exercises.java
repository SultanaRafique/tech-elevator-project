package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsPlaying = 3;
		int numberOfRaccoonsWent = 2;
		int numberOfRaccoonsLeft = numberOfRaccoonsPlaying  - numberOfRaccoonsWent;
		System.out.println(numberOfRaccoonsLeft);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlower = 5 ;
		int numberOfBees = 3;
		int numberOfLessBees = numberOfFlower - numberOfBees;
		System.out.println(numberOfLessBees);


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int numberOfPigeon = 1;
		int numberOfPigeonJoined = 1;
		int totalNumberOfPigeon = numberOfPigeon + numberOfPigeonJoined;
		System.out.println(totalNumberOfPigeon);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int numberOfOwlOnFence = 3;
		int numberOfOwlsJoined = 2;
		int totalNumberOfOwls = numberOfOwlOnFence + numberOfOwlsJoined ;
		System.out.println(totalNumberOfOwls);

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int numberOfWorkingBeavers = 2;
		int numberOfBeaversLeft = 1;
		int numberOfBeaversStillWorking = numberOfWorkingBeavers - numberOfBeaversLeft;
		System.out.println(numberOfBeaversStillWorking);


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int numberOfToucansOnTree = 2;
		int numberOfToucans = 1;
		int totalNumberOfToucans = numberOfToucansOnTree + numberOfToucans;
		System.out.println(totalNumberOfToucans);


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int numberOfSquirrels = 4;
		int  numberOfNuts = 2;
		int numberOfExtraSquirrels = numberOfSquirrels - numberOfNuts ;
		System.out.println(numberOfExtraSquirrels );


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int numberOfQuarter = 1;
		int numberOfDime = 1;
		int numberOfNickels = 2;

		int numberOfCentsInDime = 10;
		int numberOfCentsInNickels =  5;
		int numberOfCentsInQuarter =  25;

		double totalMoney = (( numberOfDime * numberOfCentsInDime )+ (numberOfNickels * numberOfCentsInNickels) + (numberOfQuarter * numberOfCentsInQuarter))/100.00;
		System.out.println(totalMoney);





        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int numberOfMuffinsByBrierClass = 18;
		int numberOfMuffinsByMacAdamClass = 20;
		int numberOfMuffinsByFlanneryClass = 17;
		int numberOfTotalMuffinsBaked = numberOfMuffinsByBrierClass + numberOfMuffinsByMacAdamClass + numberOfMuffinsByFlanneryClass;
		System.out.println(numberOfTotalMuffinsBaked);



        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		int yoyoCentPrice = 24;
		int whistelCentPrice = 14;
		double toysTotalPrice = (whistelCentPrice + yoyoCentPrice ) / 100.00;
		System.out.println(toysTotalPrice);



        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int snowAtHiltHouse = 29;
		int snowAtSchool = 17;
		int extraSnowAtHiltHouse = snowAtHiltHouse - snowAtSchool;

        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		double toyPrice = 3;
		double pencilCasePrice= 2;
		double moneyLeft = (10 - (toyPrice + pencilCasePrice));
		System.out.println(moneyLeft);



        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int totalMarblesEarlier = 16;
		int lostMarbles = 7;
		int totalMarblesNow = totalMarblesEarlier - lostMarbles;
		System.out.println(totalMarblesNow);


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int numberOfSeashells = 19;
		int  numberOfSeashellsNeeded = 25 - numberOfSeashells;
		System.out.println(numberOfSeashellsNeeded);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int totalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = totalBalloons - redBalloons  ;
		System.out.println(greenBalloons);

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int numberOfBooksOnShelf = 38;
		int numberOfBooksAdded = 10;
		int totalNumberOfBooksOnShelf = numberOfBooksOnShelf + numberOfBooksAdded;
		System.out.println(totalNumberOfBooksOnShelf);

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int numberOfBeeLegs = 6;
		int numberOfTotalBeeLegs = 8 * numberOfBeeLegs;
		System.out.println(numberOfTotalBeeLegs);

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		int iceCreamConePrice = 99;
		double totalIceCreamConePrice = (2 * iceCreamConePrice) / 100.00;
		System.out.println(totalIceCreamConePrice);

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalNumberOfRocksRequired = 125;
		int numberOfRocksHas = 64;
		int numberOfRocksNeeded = totalNumberOfRocksRequired - numberOfRocksHas;
		System.out.println(numberOfRocksNeeded);

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int totalMarbles = 38;
		int marblesLost = 15;
		int marblesLeft = totalMarbles - marblesLost ;
		System.out.println(marblesLeft);

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalMiles = 78;
		int milesDrove = 32;
		int milesLeftToDrive = totalMiles - milesDrove;
		System.out.println(milesLeftToDrive);

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		int morningShovelTime = 90;
		int afternoonShovelTime = 45;
		int totalShovelTime = morningShovelTime + afternoonShovelTime;
		System.out.println(totalShovelTime);

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numberOfHotDog = 6;
		int hotDogCentPrice = 50;
		double totalHotDogCentPrice = (numberOfHotDog * hotDogCentPrice) / 100.00;
		System.out.println(totalHotDogCentPrice);

        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		int centHas = 50;
		int pencilCentPrice = 7;
		int numberOfPencil = centHas / pencilCentPrice;
		System.out.println(numberOfPencil);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		 int butterfliesSeen = 33;
		 int orangeButterflies = 20;
		 int redButterflies = butterfliesSeen - orangeButterflies;
		System.out.println(redButterflies);

        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double moneyGiven = 1.00;
		double candyPrice = 0.54;
		double change = moneyGiven - candyPrice;
		System.out.println(change);

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int totalTreesHad = 13;
		int plantedMore = 12;
		int totalTreesHave = totalTreesHad + plantedMore;
		System.out.println(totalTreesHave);

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int numberOfDays= 2;
		int numberOfHoursInDay = 24;
		int totalNumberOfHours =  numberOfDays * numberOfHoursInDay;
		System.out.println(totalNumberOfHours);

        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int totalGumPiecesNeeded = 5 * numberOfCousins;
		System.out.println(totalGumPiecesNeeded);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		double moneyDanHas = 3.00;
		double candyBarPrice = 1.00;
		double moneyLeftWith = moneyDanHas  - candyBarPrice;
		System.out.println(moneyLeftWith);

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		int numberOfBoats = 5;
		int peopleBoatHas = 3;
		int totalPeopleOnBoats = numberOfBoats * peopleBoatHas;
		System.out.println(totalPeopleOnBoats);

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int totalLegos = 380;
		int legosLost = 57;
		int legosLeft =  totalLegos - legosLost;
		System.out.println(legosLeft);

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinBaked = 35;
		int muffinNeedToBake = 83 - muffinBaked;
		System.out.println(muffinNeedToBake);

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int willyExtraCrayons = willyCrayons - lucyCrayons;
		System.out.println(willyExtraCrayons);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersOnPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersOnPage * numberOfPages;
		System.out.println(totalStickers);

        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		double totalCupCakes = 96;
		int totalChildren = 8;
		double cupCakesPerChild = totalCupCakes / totalChildren;
		System.out.println(cupCakesPerChild);

        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int numberOfCookie = 47;
		int cookiesPerJar = 6;
		int cookieLeft = numberOfCookie % cookiesPerJar;
		System.out.println(cookieLeft);

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int numberOfCroissants = 59;
		int numberOfNeighbor = 8;
		int croissantsLeft = numberOfCroissants % numberOfNeighbor;
		System.out.println(croissantsLeft);

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalCookies = 276;
		int cookiesPerTray = 12;
		int numberOfTrays = totalCookies / cookiesPerTray;
		System.out.println(numberOfTrays);

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int numberOfPretzels = 480;
		int onePretzelsServing = 12;
		int totalPretzelsServings = numberOfPretzels / onePretzelsServing;
		System.out.println(totalPretzelsServings);

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int totalLemonCupCakes = 53;
		int cupCakesPerBox = 3;
		int numberOfCupCakeBox = totalLemonCupCakes / cupCakesPerBox ;
		System.out.println(numberOfCupCakeBox);

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int numberOfCarrotSticks = 74;
		int numberOfPeople = 12;
		int carrotSticksLeft = numberOfCarrotSticks % numberOfPeople;
		System.out.println(carrotSticksLeft);

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int numberOfTeddyBears = 98;
		int numberOfBearsPerShelf = 7;
		int numberOfFilledShelves = numberOfTeddyBears / numberOfBearsPerShelf ;
		System.out.println(numberOfFilledShelves);

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictures = 480;
		int picturesPerAlbum = 20;
		int totalAlbum = totalPictures / picturesPerAlbum ;
		System.out.println(totalAlbum);

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int totalCards = 94;
		int cardsPerBox = 8;
		int totalBoxes = totalCards / cardsPerBox ;
		System.out.println(totalBoxes);
		int cardsInUnfilledBox = totalCards % cardsPerBox ;
		System.out.println(cardsInUnfilledBox);

        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int totalBooks = 210;
		int totalShelves = 10;
		int booksPerShelf =  totalBooks / totalShelves;
		System.out.println(booksPerShelf);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		double totalCroissants = 17;
		double totalGuest = 7;
		double croissantsPerGuest = totalCroissants / totalGuest;
		System.out.println(croissantsPerGuest);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?

	    Hint:

        Calculate the hourly rate for each painter by calculating the linear feet of the room and figuring out
        how many feet each painter can paint per hour. You can combine the number of feet the 
        two painters can paint per hour and use that value to figure out how long it would take for them to
        paint the total wall space of the rooms they will be painting together.
	    */

		double hourlyRateBill = (12 * 14 )/ 2.15;
		double hourlyRateJill = (12 * 14 )/ 1.90;
		double combinedHourlyRate = hourlyRateBill + hourlyRateJill;
		int totalFeetToPaint = 5 * 12 * 14 ;
		double totalHour = totalFeetToPaint / combinedHourlyRate;
		System.out.println(totalHour);



	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */

		String firstName = "Grace ";
		String lastName = "Hopper, ";
		String middleInitial ="B.";

		String fullName =  lastName + firstName + middleInitial;
		System.out.println(fullName);

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

		double totalDistanceInMiles = 800.00;
		double milesTraveled = 537.00;
		int distanceTravelledInPercent = (int)((milesTraveled / totalDistanceInMiles) * 100);
		System.out.println(distanceTravelledInPercent);




	}

}
