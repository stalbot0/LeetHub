class Solution {
    public double[] convertTemperature(double celsius) {
        double[] kf = new double[2];
        
        kf[0] = celsius + 273.15;
        kf[1] = celsius * 1.80 + 32.00;
        
        return kf;
    }
}