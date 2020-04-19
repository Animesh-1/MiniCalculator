public abstract class Calculator implements Multiplier,Divider{
    protected int total;

    public Calculator() {
        this.total = 1;
    }

    @Override
    public void divide(int y) {
        if(y == 0){
            this.total = 0;
            return;
        }
        this.total = this.total / y;
    }

    @Override
    public void multiply(int y) {
        this.total = this.total * y;
    }

    public abstract int calculate();
}
