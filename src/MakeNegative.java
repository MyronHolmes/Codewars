public class MakeNegative {

//    In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?
    public static int makeNegative(final int x) {

        if (x > 0){
            return x * -1;
        }else if (x <= 0 ){
            return x;
        }

        return x;
    }

}