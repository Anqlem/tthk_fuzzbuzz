package tthk_FuzzBuzz;

public class FuzzBuzz {

	public static void main(String[] args) {
        for (int i = 1; i < 100; i++){
            System.out.println(of(i));
        }
    }

    public static String of(int i) {
        return String.valueOf(i);
    }

}