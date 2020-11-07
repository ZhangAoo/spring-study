package all.demo2;

public class Client {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        ServiceProxy proxy = new ServiceProxy();
        proxy.setService(service);
        proxy.delete();

    }
}
