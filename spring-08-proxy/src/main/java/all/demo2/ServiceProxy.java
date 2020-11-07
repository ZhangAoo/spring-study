package all.demo2;
//代理角色应该做的是代理真实角色
public class ServiceProxy implements Service{
    //放入真实角色
    private ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }


    public void add() {
        log("add");
        service.add();
    }

    public void delete() {

        service.add();
        log("delete");
    }

    public void update() {
        log("update");
        service.add();
    }

    public void query() {
        log("query");
        service.add();
    }

    public void log(String msg){
        System.out.println("使用了"+msg+"方法！！！");
    }
}
