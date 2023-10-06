package Pr_7._4_;

public class MathFunc implements MathCalculable
{
    public double mRe, mIm;

    public double module(double mRe, double mIm){
        return Math.sqrt(mRe*mRe + mIm*mIm);
    }

    public int power(int base, int power) {
        int result = base;
        for (int i=1; i<power; i++)
        {
            result*=base;
        }
        return result;
    }
    public double circle_length(int r){
        return 2*MathCalculable.num_pi*r;
    }
}
