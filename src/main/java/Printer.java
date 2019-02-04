public class Printer {

    private int paper;
    private int toner;


    public Printer(int paper, int toner){
    this.paper = paper;
    this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public boolean hasPaper() {
        if (this.paper > 0){
            return true;
        }
        return false;
    }

    public void print(int numberOfPages, int copies) {
        this.paper -= (numberOfPages * copies);
        this.toner -= (numberOfPages * copies);
    }

    public int fillPaper() {return this.paper = 250; }

    public int fillToner() {return this.toner = 100; }
}

