public class Bookdata {

    String sku="";
    String title="";
    String author="";
    String description="";
    double price=0;

    public Bookdata() {
    }

    public Bookdata(String sku, String title, String author, String description, double price) {
        this.sku= sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String test(String test1){
        String author="";
        if(test1.equalsIgnoreCase("on")){

                    author= '\t'+getAuthor()+'\t'+getDescription();


        }else{author="Please enter a valid author name.";}
        return author;
    }


    public String populateDat(String keyedS) {

        Bookdata bookdata= new Bookdata("","","","",0);

        //String detail;
        if(keyedS.equalsIgnoreCase("Java1001")){
            bookdata=new Bookdata("Java1001","Head First Java","Kathy Sierra and Bert Bates","Easy to read Java workbook",47.50);


        }

        if(keyedS.equalsIgnoreCase("Java1002")){

            bookdata=new Bookdata("Java1002","Thinking in Java","Bruce Eckel","Details about Java under the hood",20.00);

        }

        if(keyedS.equalsIgnoreCase("Orcl1003")){

            bookdata=new Bookdata("Orcl1003","OCP: Oracle Certified Professional Java SE","Jeanne Boyarsky","Everything you need to know in one place",45/00);

        }

        if(keyedS.equalsIgnoreCase("Python1004")){

            bookdata=new Bookdata("Python1004","Automate the Boring Stuff with Python","Al Sweigart","Fun with Python",10.50);

        }

        if(keyedS.equalsIgnoreCase("Zombie1005")){

            bookdata=new Bookdata("Zombie1005","The Maker's Guide to the Zombie Apocalypse","Simon Monk","Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",16.50);

        }

        if(keyedS.equalsIgnoreCase("Rasp1006")){

            bookdata=new Bookdata("Rasp1006","Raspberry Pi Projects for the Evil Genius","Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!",14.75);

        }

        else{bookdata=new Bookdata("","not available","not available","not available",0.00);

        }

        return bookdata.getSku()+'\t'+bookdata.getTitle()+'\t'+bookdata.getAuthor()+'\t'+bookdata.getDescription()+'\t'+bookdata.getPrice();

    }
}