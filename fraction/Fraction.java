/*
   TO DO
   PRIVATE VARIABLE NUMERATOR AND DEMNONIATOR -
   CONSTRUCTOR THAT HAS THE VARIABLES -
   GETTERS AND SETTERS -
   REAL VALUE METHOD -
   MULTIPLY AND ADD METHOD
   implement a reduce method
 */

public class Fraction {

    int numerator;
    int denominator;

    public int getNum() {
        return numerator;
    }

    public int getDen() {
        return denominator;
    }

    public Fraction(int numerator, int denominator){//constructor for fractions
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction frac2){
        if(frac2.denominator == 0 || this.denominator == 0){
            throw new IllegalArgumentException("THERE IS A 0 IN THE PASSED IN DENOMINATOR");
        }

        if(this.denominator == frac2.denominator){
            int sumNum = this.numerator + this.numerator;
            return new Fraction(sumNum, this.denominator);
        }else{
            int lcd = getLcd(this.denominator,frac2.denominator);//grabbing LCD
            //lol long statement for adding and getting the denominators matching...
            return new Fraction(this.numerator*lcd + frac2.numerator*lcd, this.denominator*lcd);
        }
    }

    public Fraction multiply(Fraction frac2){//needs reduce method implemented
        if(frac2.denominator == 0 || this.denominator == 0){
            throw new IllegalArgumentException("THERE IS A 0 IN THE PASSED IN DENOMINATOR");
        }

        int num = this.numerator * frac2.numerator;
        int dem = this.denominator * frac2.denominator;

        return new Fraction(num,dem);
    }

    private int getLcd(int den1, int den2){//adding and subtracting
        if(den1 == 0 || den2 == 0){
            throw new IllegalArgumentException("The denominators are zero... plz fix");
        }

        int factor = den1;

        while ((den1 % den2) != 0)
            den1 += factor;

        return den1;
    }

    public Fraction reduce(){//in development
        return null;
    }

    public int getGcd(int den1, int den2){//in development
        return 0;
    }



    public double realValue() {
        return (double) this.numerator / (double) this.denominator;
    }

    public int compareTo(Fraction fraction) {


        return 0;
    }

    @Override
    public String toString(){
        return this.numerator + "/" + this.denominator;
    }
}
