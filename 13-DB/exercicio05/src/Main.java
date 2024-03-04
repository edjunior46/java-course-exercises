import dao.DAOFactory;
import dao.SellerDAO;
import entities.Department;
import entities.Seller;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        


        List<Seller> sellers = sellerDAO.findAll();

        for (Seller seller : sellers) {
            System.out.println(seller);
        }

    }
}