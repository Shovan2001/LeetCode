class Solution {
    public double angleClock(int hour, int minutes) {
        
        double degreeMinHand=(double)minutes*6; //as in 60 min, 360 degree --> so 1 min, 360/60=6 degree
        
        // as in 12 hr, 360 degree --> so 1 hr, 360/12=30 degree
        // so in 60 min 30 degree --> so 30/60=0.5 degree
        double degreeHourHand=30*(hour%12)+minutes*0.5;

        double diff_clockwise=Math.abs(degreeMinHand-degreeHourHand);
        double diff_anti_clockwise=Math.abs((360-degreeMinHand)-(360-degreeHourHand));

        double diff=Math.min(diff_clockwise,360-diff_anti_clockwise);

        return diff;
    }
}