package day07;

import Utility.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_PlaceOrderFunctionalityElements {

    public _02_PlaceOrderFunctionalityElements() {
        PageFactory.initElements(DriverClass.driver,this);
    }

    //POM page object model/////we use iot to locate element and then we can call it in different classes so we wont have to locate it again and speen do much time.
    @FindBy(css = "input[name='search']")
    public WebElement searchBox;

    @FindBy(css = "button[class=\"btn btn-default btn-lg\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[text()='Shopping Cart']")
    public WebElement cartButton;

    @FindBy(linkText = "Checkout")
    public WebElement checkoutButton;

    @FindBy(id ="button-payment-addresss")
    public WebElement continueAddress;

    @FindBy(id = "button-shipping-address")
    public WebElement shippingMethod;

    @FindBy(css= "input[type='checkbox']")
    public WebElement paymentRadioButton;

    @FindBy(id= "button-payment-method")
    public WebElement paymentContinue;

    @FindBy(id="button-confirm")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//div[@id='content']/h1[text()='Your order has been placed!']")
    public WebElement successMessage;
}
