class Solution {
    private static class Car {
        int pos;
        double tim;
        Car(int pos,double tim){
            this.pos=pos;
            this.tim=tim;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
    int n=position.length;
    if(n==0) return 0;
    Car[] cars=new Car[n];

    for(int i=0;i<n;i++){
        double t=(double)(target-position[i])/speed[i];
        cars[i]=new Car(position[i],t);
    }

    Arrays.sort(cars,Comparator.comparingInt(car->car.pos));

    int res=0;
    double tp=0;
    for(int i=n-1;i>=0;i--){
      if(cars[i].tim>tp){
        tp=cars[i].tim;
        res++;
      }
    }
    return res;
    }
}
