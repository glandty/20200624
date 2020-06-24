public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        //myArrayList1.display();
        myArrayList1.add(10,55);
        //myArrayList1.display();
        //System.out.println(myArrayList1.cotains(55));
        //System.out.println(myArrayList1.getPos(10));
        //System.out.println(myArrayList1.size());
        //myArrayList1.display();
        //myArrayList1.remove(55);
        //myArrayList1.display();
        System.out.println("clear()");
        myArrayList1.clear();
        myArrayList1.display();
    }
}
