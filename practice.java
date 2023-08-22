public class practice {
    public static void main(String[] args) {

        Motherboard theMotherboard = new Motherboard("A2893", "Apple INC.", 2022, "Black", 10, 6, 4, "UEFI");

        phone thePhone = new phone("14 mini", "Apple INC.", 2022, "Deep Purple", 12, 8, 6);

        screen theScreen = new screen("Liquid Retina Display", "Apple INC.", 2022, "Visual", 6, 4, 3, "2796 x 1290", "6.69”", "120 Hz (default)");

        CPU theCPU = new CPU("M1 MAX", "Apple INC.", 2022, "gold", 4, 5, 6, "3.22 GHz", 8);

        product1 theProduct = new product1("14 mini", "Apple INC.", 2022, "Deep purple", 9, 8, 4, theScreen, theCPU, theMotherboard);

        System.out.println(thePhone.getCompany());
        System.out.println(thePhone.getColour());
        System.out.println(thePhone.getModel());
        System.out.println(theMotherboard.getCompany());
        System.out.println(theMotherboard.getColour());
        System.out.println(theMotherboard.getModel());

        theProduct.StartUp();
        theProduct.ProgramStart();
        theProduct.TotalGHz();
        theProduct.ProgramStart2();
    }
}
