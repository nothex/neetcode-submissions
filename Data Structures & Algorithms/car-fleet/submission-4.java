class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][]cars=new double[speed.length][2];
        for(int i=0;i<speed.length;i++){
            cars[i][0]=position[i];
            cars[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars,(a,b)->Double.compare(b[0],a[0]));
        int res=0;
        double time=0;
        for(double []car:cars){
            if(car[1]>time){
                res++;
                time=car[1];
            }
        }
        return res;
    }
}
