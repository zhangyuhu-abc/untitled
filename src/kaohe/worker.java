package kaohe;

public class worker extends employee implements work{

    @Override
    public void work() {
        System.out.println("工号："+getId()+"姓名："+getId()+"正在上班");
    }
}
