import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductTest {

    Product p1, p2, p3;

    @BeforeEach
    void setUp() {
        p1 = new Product("000001", "Coke", "Soda", 2.0);
        p2 = new Product("00000C", "Hot Dog", "Food", 2.5);
        p3 = new Product("000001", "Popcorn", "Snack", 1.0);
    }

    @Test
    void setProdName() {
        p1.setProdName("Pepsi");
        assertEquals("Pepsi", p1.getProdName());
    }

    @Test
    void setProdDescription() {
        p2.setProdDescription("Entree");
        assertEquals("Entree", p2.getProdDescription());
    }

    @Test
    void setIDseed() {
        Product.setIDseed(4);
        assertEquals(4, Product.getIDseed());
    }

    @Test
    void setCost() {
        p3.setCost(3.00);
        assertEquals(3.00, p3.getCost());
    }

    @Test
    void testToString() {
        assertEquals("Product{ID='000001', prodName='Coke', prodDescription='Soda', cost=2.0}", p1.toString());
    }

    @Test
    void toCSV() {
        assertEquals("00000C,Hot Dog,Food,2.5", p2.toCSV());
    }

    @Test
    void toJSON() {
        assertEquals("{\"ID\":\"000001\",\"prodName\":\"Popcorn\",\"prodDescription\":\"Snack\",\"cost\":\"1.0\"}", p3.toJSON());
    }

    @Test
    void toXML() {
        assertEquals("<Product><ID>000001</ID><prodName>Coke</prodName><prodDescription>Soda</prodDescription><cost>2.0</cost></Product>", p1.toXML());
    }
}