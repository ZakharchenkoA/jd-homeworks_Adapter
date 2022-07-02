public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public double sum(int arg0, int arg1) {
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
    }

    @Override
    public double sub(int a, int b){
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result;
    }

    @Override
    public double mult(int arg0, int arg1) {
        return target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
    }

    @Override
    public double div(int a, int b){
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result;
    }

    @Override
    public double pow(int a, int b) {
        return target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
    }
}