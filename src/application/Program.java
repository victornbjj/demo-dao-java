package application;

import java.util.Date;

import models.entities.Department;
import models.entities.Seller;

public class Program {

    public static void main(String[] args) {


        Department obj = new Department(1, "Books");


         Seller seller = new Seller(1, "Bob brown", "bob@gmail.com", new Date(), 1621.00, obj);


         System.out.println(seller);



    }
}
