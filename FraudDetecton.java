public class FraudDetecton {
    private boolean is_suspicious = false;

    FraudDetecton(boolean is_suspicious){
        this.is_suspicious = is_suspicious;
    }

    FraudDetecton(){}

    boolean get_is_suspicious(){
        return is_suspicious;
    }


}
