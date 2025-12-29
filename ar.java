import java.util.Scanner;


public class ar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       // int[] numbers = {1,2,3,4,5,6,8,9};
        String[] fruits ={"coco","banana","apple"};
        String target;
        boolean isfound=false;



        System.out.println("enter target to be found");
        target = scanner.nextLine();

        for(int i=0;i< fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("target found at index " + i);
                isfound = true;
                break;
            }
        }
        if(!isfound) {
            System.out.println("target not found");
        }
            scanner.close();
        }

    }
