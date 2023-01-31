package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        So sánh từng cặp giá trị lần lượt trong array ở đây cụ thể là xếp ascendent thì cứ phần tử phía trước lớn
        hơn thì hoán đổi ra đằng sau thì cứ sau mỗi vòng loop chạy hết array thì sẽ kéo được phần tử to nhất
        ra cuối array
         */
        int [] array = {1,7,4,56,4,4,14,24};
        bubbleSort(array);

        for(int i: array){
            System.out.print(i + " ");
        }

    }


    private static void bubbleSort (int[] array){
        for(int i = 0; i<= array.length -1; i++){
            for(int j =0; j<= array.length - i - 2; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}