package Adapter;

public class Ypay implements Xpay{

    public String name = " sedat";

    public void  setName(String s){
        this.name = s;
    }



    @Override
    public String getCreditCardNo() {
        return null;
    }

    @Override
    public String getCustomerName() {
        return null;
    }

    @Override
    public String getCardExpMonth() {
        return null;
    }

    @Override
    public String getCardExpYear() {
        return null;
    }

    @Override
    public Short getCardCVVNo() {
        return null;
    }

    @Override
    public Double getAmount() {
        return null;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {

    }

    @Override
    public void setCustomerName(String customerName) {

    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {

    }

    @Override
    public void setCardExpYear(String cardExpYear) {

    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {

    }

    @Override
    public void setAmount(Double amount) {

    }
}
