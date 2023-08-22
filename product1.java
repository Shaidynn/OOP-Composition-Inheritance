public class product1 extends phone {

    private screen screen;
    private CPU cpu;
    private Motherboard motherboard;

    public product1(String model, String company, int year, String colour, int width, int height, int depth, screen screen, CPU cpu, Motherboard motherboard) {
        super(model, company, year, colour, width, height, depth);
        this.screen = screen;
        this.cpu = cpu;
        this.motherboard = motherboard;
    }
    private void drawAppleLogo() {
        screen.PaintAt(2796, 1290, "White", "Black");
    }
    public void StartUp () {
        motherboard.PowerButton();
        drawAppleLogo();
    }
    public void ProgramStart () {
        motherboard.loadProgram();
    }
    public void ProgramStart2 () {
        motherboard.loadProgram2();
    }
    public void TotalGHz() {
        cpu.GHZnumber();
    }
}
