public class Main2 {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("H7 Flow", "NZXT", "240");

        Monitor theMonitor = new Monitor("27inch Monster", "Asus", 27, "3840 x 2160" );

        Motherboard theMotherBoard = new Motherboard("Z790 Aorus Xtreme", "Gigabyte", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("H7 Flow", "NZXT", theCase, theMonitor, theMotherBoard);

        //thePC.getMonitor().drawPixelAt(10, 10, "red");
        //thePC.getMotherboard().loadProgram(("Windows OS"));
        //thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

    }

}
