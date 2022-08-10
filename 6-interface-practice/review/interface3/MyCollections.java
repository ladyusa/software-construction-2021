package review.interface3;

public class MyCollections {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {// i แบง่ สว่ นเรียงแลว้ กับยังไมเ่ รียง
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) { // วนลูปหาคา่ นอ้ ยสุด
                if (a[j].compareTo(a[minPos]) < 0) { //    a[j] < a[minPos]
                    minPos = j;
                }
            }
            // สลับขอ้ มูลใน minPos และ i ทําใหข้ อ้ มูลใน minPos ไปอยสู่ ว่ นที่เรียงแลว้
            Comparable temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] data = { 1, 8, 4, 6};
        MyCollections.sort(data);
        for (int i : data)
            System.out.print(i + " ");
        System.out.println();

        Product[] products = {
                new Product("Big Java", 500),
                new Product("Intro to CS", 250),
                new Product("Data Structure is Fun", 900)
        };
        MyCollections.sort(products);
        for (Product p : products)
            System.out.print(p.getPrice() + " ");
        System.out.println();
    }
}
