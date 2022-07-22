public class Kata
{
    public static String rakeGarden(String garden)
    {
        String[] arr = garden.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("rock"))
                arr[i] = "gravel";
        }
        return String.join(" ", arr);
    }
}
class main1 {
    public static void main(String[] args) {
        System.out.println(Kata.rakeGarden("gravel slug gravel rock gravel ant rock "));
    }
}