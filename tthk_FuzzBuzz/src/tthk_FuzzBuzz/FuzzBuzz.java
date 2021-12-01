package tthk_FuzzBuzz;

public class FuzzBuzz {

	public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            System.out.println(of(i));
        }
    }

    public static String of(int i) {
    	if(i % 3 == 0) return "Fizz";
    	if(i % 5 == 0) return "Buzz";
        return String.valueOf(i);
    }

}