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

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccoonsPlaying=3;
		int numberOfRaccoonsGoHome=2;
		int numberOfRaccoonsLeft= numberOfRaccoonsPlaying-numberOfRaccoonsGoHome;


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers=5;
		int numberOfBees=3;
		int numberOfBeesLees= numberOfFlowers-numberOfBees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int numberOfPigeon=1;
		int totalPigeon= numberOfPigeon + numberOfPigeon;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwls_Sitiing=3;
		int numberOfOwls_Joined=2;
		int totalOwls= numberOfOwls_Joined + numberOfOwls_Sitiing;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int numberOfBeaversHome=2;
		int numberOfBreverSwim=1;
		int totalBeavers=numberOfBeaversHome-numberOfBreverSwim;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int numberOfToucansSitting=2;
		int numberOfToucanJoin=1;
		int totalToucan=numberOfToucanJoin+numberOfToucansSitting;

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int numberOfSquirrels=4;
		int numberOfNuts=2;
		int moreSquirrels=numberOfSquirrels-numberOfNuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double hilt_Quarter=0.25;
		double hilt_Dime=0.10;
		double hilt_Nickel=0.05;
		double totalMoney= hilt_Quarter+hilt_Dime+(hilt_Nickel*2);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int numberOfMuffinsbyBrier=18;
		int numberOfMuffinsbyMacAdam=20;
		int numberOfMuffinsbyFlannery=17;
		int totalMuffins=numberOfMuffinsbyMacAdam+numberOfMuffinsbyFlannery+numberOfMuffinsbyBrier;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double costOfYoyo=0.24;
		double costOfWhistle=0.14;
		double totalCost=costOfYoyo+costOfWhistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int numberOfLargeNarshmallows=8;
		int numberOfMiniMarshmallows=10;
		int totalMarshmallows=numberOfMiniMarshmallows+numberOfLargeNarshmallows;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltHouse=29;
		int snowAtSchool=17;
		int differenceSnow=snowAtHiltHouse-snowAtSchool;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int initialHiltMoney = 10;
		int toyTruckCost = 3;
		int pencilCaseCost = 2;
		double hiltMoneyLeft = initialHiltMoney - toyTruckCost - pencilCaseCost;


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int numberOfMarbles = 16;
		int numberOflostMarbles = 7;
		int marblesRemaining = numberOfMarbles - numberOflostMarbles;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int numberOfMeganSeashells = 19;
		int numberOfTotalSeashells = 25;
		int seashellsNeeded= numberOfTotalSeashells - numberOfMeganSeashells;


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int numberOfBrasBalloons=17;
		int numberOfRedBalloons=8;
		int numberOfGreenBalloons=numberOfBrasBalloons-numberOfRedBalloons;



        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int totalBook=38;
		int addedBook=10;
		int numberOfShelfBooks=totalBook+addedBook;


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfBeeLeg=6;
		int numberOfBee=8;
		int totalLegsOfBees=numberOfBee*numberOfBeeLeg;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfCone=0.99;
		int numberOfIceCream=2;
		double totalCostOfCone=numberOfIceCream*costOfCone;



        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int numberOfTotalRocks=125;
		int numberOfRocks=64;
		int numberOfNeededRock=numberOfTotalRocks-numberOfRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int numberOfTotalMarbles=38;
		int numberOfLostMarbles=15;
		int numberOfLeftMarbles=numberOfTotalMarbles-numberOfLostMarbles;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertDistance = 78;
		int driveDistance = 32;
		int distanceRemaining = concertDistance - driveDistance;



        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		double totalShovelingInMorning=(1*60)+30;
		int totalShovelingInAfternoon=45;
		int totalShoveInDay=totalShovelingInAfternoon + (int)totalShovelingInMorning;

        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double numberOfBoughtHotDog=6;
		double costOfHotDog=0.5;
		double totalPurchaseHotDog=costOfHotDog * numberOfBoughtHotDog;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double costOfAPencil=0.07;
		double moneyToBuyPencil=0.50;
		double totalPencil= moneyToBuyPencil / costOfAPencil;
		int buyPencil= (int) totalPencil;


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int numberOfButterflies=33;
		int numberOfOrangeButterflies=20;
		int numberOfRedButterflies=numberOfButterflies-numberOfOrangeButterflies;



        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double costOfCandy =0.54;
		double moneyKateGave=1.00;
		double moneyKateReceive= moneyKateGave-costOfCandy;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int numberOfTrees = 13;
		int numberOfPlants = 12;
		int totalTreeInBackyard =(numberOfTrees + numberOfPlants);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int totalDaysToMeetGrandMa=2;
		int totalHoursToMeetGrandMa=totalDaysToMeetGrandMa*24;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfKimCousins=4;
		int numberOfGum=5;
		int totalGumForCousins=numberOfKimCousins*numberOfGum;



        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double totalDanMoney = 3.00;
		double costOfDanCandy = 1.00;
		double danMoneyRemaining = (totalDanMoney - costOfDanCandy);


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberOfBoat=5;
		int numberOfPeopleInBoat=3;
		int totalPeopleInLake=numberOfPeopleInBoat*numberOfBoat;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int numberOfEllenLegos=380;
		int numberOfEllenLostLegos=57;
		int ellenLegosRemaining=numberOfEllenLegos-numberOfEllenLostLegos;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int numberOfArthurMuffins=35;
		int totalNeedArthurMuffins=83;
		int totalRemainingMuffins=totalNeedArthurMuffins-numberOfArthurMuffins;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int numberOfWillyCrayons=1400;
		int numberOfLucyCrayons=290;
		int crayonsDifference= numberOfWillyCrayons-numberOfLucyCrayons;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickers=10;
		int numberOfStickersPages=22;
		int totalStickersPages = (numberOfStickersPages * numberOfStickers);



        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakes = 100;
		int numberOfChildren = 8;
		double cupcakeForEachChild = (numberOfCupcakes / (double) numberOfChildren);



        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int numberOfGingerbread=47;
		int eachJayContainCookies=6;
		int numberOfCookiesNotInJar= numberOfGingerbread%eachJayContainCookies;



        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int numberOfCroissants=59;
		int numberOfNeighbours=8;
		int croissantsLeftForMarian=numberOfCroissants % numberOfNeighbours;



        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int numberOfOatmealCookiesOnTray=12;
		int numberOfTotal_OatmealCookies=276;
		int numberOfTrayNeed=numberOfTotal_OatmealCookies/numberOfOatmealCookiesOnTray;



        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int numberOfPretzels=480;
		int oneServingPerPretzels=12;
		int totalPretzels=numberOfPretzels/oneServingPerPretzels;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int numberOfLemonCupcakes=53;
		int numberOfLemonCupcakesLeftAtHome=2;
		int numberOfLemonCupcakesPreBox=3;
		int totalBoxesForLemonCupcakes= (numberOfLemonCupcakes-numberOfLemonCupcakesLeftAtHome) / numberOfLemonCupcakesPreBox;


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int numberOfCarrotSticks=74;
		int numberOfServedCarrotSticks=12;
		int carrotSticksRemaining=numberOfCarrotSticks % numberOfServedCarrotSticks;



        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int numberOfTeddyBears=98;
		int maxTeddyBearsInShelf=7;
		int filledShelves= numberOfTeddyBears / maxTeddyBearsInShelf;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int numberOfPictures=480;
		int numberOfPicturesPreAlbum=20;
		int albumsNeeded=numberOfPictures/numberOfPicturesPreAlbum;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int numberOfTradingCards = 94;
		int maxCardsInABox = 8;
		int cardBoxesunFilled = (numberOfTradingCards % maxCardsInABox);


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numberOfBooks=210;
		int booksDistributePreShelf=10;
		int bookInBookshelves=numberOfBooks / booksDistributePreShelf;



        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int numberOfCristinaCroissants = 17;
		int numberOfCristinaGuest = 7;
		double eachGuestsGetCroissants = (numberOfCristinaCroissants / (double)numberOfCristinaGuest);



	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double hoursTakeByBill=1/2.15; // room per hours
		double hoursTakeByJill=1/1.90; //room per hours
		double combineHoursByBoth = hoursTakeByBill+hoursTakeByJill;
		double hoursToPaint5Rooms = 5 / combineHoursByBoth;

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName="Grace";
		String lastName="Hopper";
		String middleInitial="B";
		String fullName = lastName + ", " + firstName+ " " + middleInitial + ".";





	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		float newYorkToChicagoMiles = 800f;
		float milesAlreadyTraveled = 537f;
		int percentOfTripCompleted = (int) ((milesAlreadyTraveled / newYorkToChicagoMiles)*100);

	}

}
