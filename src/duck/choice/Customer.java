package duck.choice;

public class Customer {
     String name;
     String size;

     public clothing [] items;

     public void addItems(clothing[] someItems){
         items= someItems;
     }
     public clothing[] getItems(){
         return items;
     }
     public double getTotalClothingCost() {
         double total = 0.0;
         for (clothing item : items) {
//             if (c1.size.equals(item.getSize())) {
                 total = total + item.getPrice();
//                 System.out.println("item = " + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());
//                 total = total + total * tax;
//                 if (total > 15) {
//                     break;
//                 }
             }
             return total;
         }

         public String getName () {
             return name;
         }

         public void setName (String name){
             this.name = name;
         }

         public String getSize () {
             return size;
         }

         public void setSize (String size){
             this.size = size;
         }
         public void setSize ( int measurement){
             switch (measurement) {
                 case 1:
                 case 2:
                 case 3:
                     setSize("s");
                     break;
                 case 4:
                 case 5:
                 case 6:
                     setSize("M");
                     break;
                 case 7:
                 case 8:
                 case 9:
                     setSize("L");
                     break;
                 default:
                     setSize("XL");
             }
         }
     }

