public class Foreach {
    public static void main(String[] args)
 {
     int[] arr={1,2,233,15,151,51,51,51,51,5};
     for (int i : arr) {
        System.out.println(i);
     }
     System.out.println("using for loop");
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }
 }

}
