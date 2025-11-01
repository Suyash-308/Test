package Q_2;

public class SecondLargeNum {
    public static void main(String[] args) {
        int[] array={1,3,5,8,7,2};

        int max= Integer.MIN_VALUE;
        int secMax=max;
        for (int i = 0; i < array.length; i++) {
              if (array[i]>max){
                  secMax=max;
                  max=array[i];
//                  secMax=max
              }
              if (array[i]<max && array[i]>secMax ){
                  secMax=array[i];

              }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
