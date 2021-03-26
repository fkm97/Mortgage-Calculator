package ca.yorku.eecs.mcalc;

public class MortgageModel
{
    private double principle;
    private double amortization;
    private double interest;

    public MortgageModel(String p, String a, String i)
    {
        this.principle = Double.parseDouble(p);
        this.amortization = Double.parseDouble(a);
        this.interest = Double.parseDouble(i)*100;
    }

    public String computePayment()
    {
        double index = ((this.interest/12)*this.principle)/(1 - Math.pow((1 + (this.interest/12)),-(this.amortization*12)));
        String result = String.format("$%,.2f", index);
        return result;
    }

    public static void main(String[] args)
    {
        MortgageModel myModel = new MortgageModel("700000", "25", "2.75");
        System.out.println(myModel.computePayment());
    }
}
