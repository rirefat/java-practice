public class middleOfTheLinkedList {
    public static void main(String[] args) {
        int[] head = {1,2,3,4,5};
        int size = head.length;
        int mid = 0;
        if(size%2 != 0){
            mid = (size-1)/2;
        }
        else{
            mid = (size/2);
        }
        for(int i=mid; i<size; i++){
            System.out.println(head[i]);
        }
    }
}
