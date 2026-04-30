class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][]cars=new double[speed.length][2];
        for(int i=0;i<speed.length;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars,(b,a)->Double.compare(a[0],b[0]));
        int count=0;
        double time=0;
        for(double []car:cars){
            if(time<car[1]){
                time=car[1];
                count++;
            }
        }
        return count;
    }
}
