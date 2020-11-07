package all.demo1;

public class Proxy implements Rent{
    private Host host;

    public Proxy() {}
    public Proxy(Host host) {

        this.host = host;
    }


    public void rent() {
        seeHost();
        host.rent();
        heTong();
        fare();
    }




    public void seeHost(){
        System.out.println("中介带你看房");
    }
    public void heTong(){
        System.out.println("中介带你签合同");
    }
    public void fare(){
        System.out.println("中介带你交钱");
    }

}
