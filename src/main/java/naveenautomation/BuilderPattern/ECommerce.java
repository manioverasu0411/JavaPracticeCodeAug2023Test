package naveenautomation.BuilderPattern;

public class ECommerce {

    public ECommerce login(){
        System.out.println("user logged in");
        return this;
    }

    public ECommerce login(String UN, String pw){
        System.out.println("user logged in"+UN+" "+pw);
        return this;
    }

    public ECommerce search(String product){
        System.out.println("Searching product name is: "+product);
        return this;
    }

    public ECommerce search(String product,String color){
        System.out.println("Searching product name is: "+product+" "+color);
        return this;
    }

    public ECommerce selectProduct(String product){
        System.out.println("Selecting Product");
        return this;
    }

    public ECommerce addToCart(String product){
        System.out.println("Adding product to cart: "+product);
        return this;
    }

    public ECommerce doPayment(String cc, int cvv){
        System.out.println("Do payment using: "+cc+":"+cvv);
        return this;
    }

    public ECommerce generateOrderId(){
        System.out.println("Generate Order id is: "+12345);
        return this;
    }

    public ECommerce logout(){
        System.out.println("Logged out successfully");
        return this;
    }


}
