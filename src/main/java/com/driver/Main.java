package com.driver;

public class Main {
    public void main(String[] args) {
        Product p=new Product();
       System.out.print(p.product(2,3));
        p.product(4,5,6);
        p.product(5,7);

    }

    class Product {

        public int product(int x, int y) {

            return x * y;
        }

        public int product(int x, int y, int z) {

            return x * y * z;
        }
        public double product(double x, double y) {

            return x*y;
        }

    }
}
