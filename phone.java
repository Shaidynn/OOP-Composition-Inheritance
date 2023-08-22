public class phone {

    private String model;
    private String company;
    private int year;
    private String colour;
    private int width;
    private int height;
    private int depth;

    public phone(String model, String company, int year, String colour, int width, int height, int depth) {
        this.model = model;
        this.company = company;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
class screen extends phone {

        private String resolution;
        private String size;
        private String hertz;

        public screen(String model, String company, int year, String colour, int width, int height, int depth, String resolution, String size, String hertz) {
            super(model, company, year, colour, width, height, depth);
            this.resolution = resolution;
            this.size = size;
            this.hertz = hertz;
        }
        public void PaintAt(int x, int y, String colour, String outline) {
            System.out.printf("Generating pixels at %d and %d with the colour %s and outline colour %s. \n", x, y, colour, outline);
        }
        public String getResolution() {
            return resolution;
        }

        public String getSize() {
            return size;
        }

        public String getHertz() {
            return hertz;
        }
    }
class CPU extends phone {
    private String GHz;
    private int cores;

    public CPU(String model, String company, int year, String colour, int width, int height, int depth, String GHz, int cores) {
        super(model, company, year, colour, width, height, depth);
        this.GHz = GHz;
        this.cores = cores;
    }
    public void GHZnumber() {
        System.out.println("Your device is running at 2.50 GHz according to the current status...");
    }

    public String getGHz() {
        return GHz;
    }

    public int getCores() {
        return cores;
    }
}

class Motherboard extends phone {
    private String bios;

    public Motherboard(String model, String company, int year, String colour, int width, int height, int depth, String bios) {
        super(model, company, year, colour, width, height, depth);
        this.bios = bios;

    }

    public void PowerButton() {
        System.out.println("Turning on screen...");
    }

    public void loadProgram() {
        System.out.println("IOS is now loading...");
    }
    public void loadProgram2() {
        System.out.println("Welcome to IOS!");
    }

    public String getBios() {
        return bios;
    }
}







