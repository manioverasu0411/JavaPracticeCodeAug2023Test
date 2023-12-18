package naveenautomation.BuilderPattern;

public class ShoppingTest {
    public static void main(String[] args) {

        ECommerce u1 = new ECommerce();
        u1.login("mani","Info@1234")
                .search("Mobile")
                    .selectProduct("iphone15")
                        .addToCart("iphone15")
                            .doPayment("5452110",1245)
                                .generateOrderId()
                                    .logout();

        u1.login("mani","Info@1234").search("Shoes","black")
                .selectProduct("NIKE").logout();

        u1.login("mani","Info@1234").search("TV").logout();





    }
}
