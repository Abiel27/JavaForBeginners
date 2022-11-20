package duck.choice;

public class shopApp {
    public static void main(String[] args) {
        double tax = 0.02, total = 0.0;
        System.out.println("Well come to Abiel's Choice shop");

        Customer c1 = new Customer();

        c1.setName("AbielPinky");
        c1.setSize("s");



        clothing item1 = new clothing();
        clothing item2 = new clothing();

        clothing[] items ={item1, item2,new clothing(), new clothing()	};


        item1.setDescription("Blue Jacket");
        item1.setPrice(20.09);
        item1.setSize("s");

        item2.setDescription("Yellow Scarf");
        item2.setPrice(10.5);
        item2.setSize("s");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("s");

        items[3].setDescription("Orange Scarf");
        items[3].setPrice(10.5);
        items[3].setSize("s");



        /*System.out.println("item1 = " + item1.getDescription()+ ","+ item1.getPrice()+","+item1.getSize());
        System.out.println("item1 = " + item2.getDescription()+ ","+ item2.getPrice()+","+item2.getSize());
*/
//        total = (item1.getPrice() + ( item2.getPrice() )* 2 )*(1 + tax);
//        System.out.println("total= "+ total);

        int measurement = 8;

        c1.addItems(items);
        c1.setSize(measurement);
        System.out.println("Customer id =" + c1.getName()+", "+ c1.getSize()+" ,"+c1.getTotalClothingCost());


        for (clothing item : c1.getItems()){
            System.out.println("item = " + item.getDescription());


            }

        }



        }





    