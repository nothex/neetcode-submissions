class Solution {
    private static class CarData {
    int position;
    double timepass;
    CarData(int pos,double tim){
        this.position=pos;
        this.timepass=tim;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
     if(position.length==0 || speed.length==0) return 0;
     CarData[] cars=new CarData[position.length];
     for(int i=0;i<position.length;i++){
        double time=(double)(target-position[i])/speed[i];
        cars[i]=new CarData(position[i],time);
     }
     Arrays.sort(cars,Comparator.comparingInt(car->car.position));
     int count=0;double timestat=0;
     for(int i=position.length-1;i>=0;i--){
        if(cars[i].timepass>timestat){
            count++;
            timestat=cars[i].timepass;
        } 
     }
     return count;  
    }
}
