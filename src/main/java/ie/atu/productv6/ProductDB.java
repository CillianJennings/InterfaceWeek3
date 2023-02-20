package ie.atu.productv6;

public class ProductDB {

    public static Productable getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Productable p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("gone bad")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Gone Bad Music Album");
            myMusic.setPrice(38.50);
            myMusic.setArtist("Rihanna");
            myMusic.setLabel("The Island");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("deluxe")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Deluxe Music Album");
            myMusic.setPrice(33.50);
            myMusic.setArtist("Ed Sheeran");
            myMusic.setLabel("Asylum Records");
            p = myMusic;
        } else if (productCode.equalsIgnoreCase("arrival")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Arrival Music Album");
            myMusic.setPrice(36.50);
            myMusic.setArtist("Abba");
            myMusic.setLabel("Polar Music");
            p = myMusic;
        }

        if (productCode.equalsIgnoreCase("S95B")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("4K OLED HDR");
            myTV.setPrice(1699.00);
            myTV.setScreen("55");
            myTV.setManufacture("Samsung");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("C2")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("4k OLED HDR");
            myTV.setPrice(4499.99);
            myTV.setScreen("83");
            myTV.setManufacture("LG");
            p = myTV;
        } else if (productCode.equalsIgnoreCase("A95K")) {
            TV myTV = new TV();
            myTV.setCode(productCode);
            myTV.setDescription("OLED 4k Ultra HD HDR");
            myTV.setPrice(3950.00);
            myTV.setScreen("65");
            myTV.setManufacture("Sony");
            p = myTV;
        }

        if (productCode.equalsIgnoreCase("mustang")) {
            Horse myHorse = new Horse();
            myHorse.setType("Horse");
            myHorse.setAge(5);
            myHorse.setBreed("Mustang");
            myHorse.setPrice(1000);
            myHorse.setDam("Jack");
            myHorse.setSire("Molly");
            myHorse.setHeight(3.5);
            p = myHorse;
        }else if(productCode.equalsIgnoreCase("thoroughbred")){
            Horse myHorse = new Horse();
            myHorse.setType("Horse");
            myHorse.setAge(8);
            myHorse.setBreed("Thoroughbred");
            myHorse.setPrice(1500);
            myHorse.setDam("Gavin");
            myHorse.setSire("Heather");
            myHorse.setHeight(2.5);
            p = myHorse;
        }

        if (productCode.equalsIgnoreCase("shepherd")) {
            Dog myDog = new Dog();
            myDog.setType("Dog");
            myDog.setAge(12);
            myDog.setBreed("German Shepherd");
            myDog.setPrice(150);
            myDog.setVaccination("Parvovirus");
            myDog.setShedding("Twice a year");
            myDog.setNeutered("No");
            p = myDog;
        }else if(productCode.equalsIgnoreCase("retriever")){
            Dog myDog = new Dog();
            myDog.setType("Dog");
            myDog.setAge(4);
            myDog.setBreed("Golden Retriever");
            myDog.setPrice(100);
            myDog.setVaccination("Heptatitis");
            myDog.setShedding("Year-round");
            myDog.setNeutered("Yes");
            p = myDog;
        }
        return p;
    }
}

