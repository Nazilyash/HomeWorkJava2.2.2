public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodyMassIndex = service.calculate(49.5F,1.58F);
        System.out.println("Body Mass Index:");
        System.out.println(bodyMassIndex);
    }
    }
