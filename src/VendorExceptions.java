public class VendorExceptions extends Exception {
    public VendorExceptions(String message){
        super(message);
    }
    static class ItemAlreadyExistsException extends VendorExceptions{
        public ItemAlreadyExistsException(String message){
            super(message);
        }
    }
}
