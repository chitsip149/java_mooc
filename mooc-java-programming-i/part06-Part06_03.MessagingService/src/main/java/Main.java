
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();
        service.add(new Message("trang", "hi my name is trang nice to meet you!"));
        service.add(new Message("lingqi", "hi nice to meet you i'm lingqi i'm the main vocalist of fantasy boys"));
        System.out.println(service.getMessages());
    }
}
