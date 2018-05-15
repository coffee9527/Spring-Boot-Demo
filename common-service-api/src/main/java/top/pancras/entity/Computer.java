package top.pancras.entity;

/**
 * Created by Administrator on 2018/4/14 0014.
 */
public class Computer {
    //机型
    private String type;
    //cpu信息
    private String cpu;
    //容量
    private int content;

    public Computer() {
    }

    public Computer(String type, String cpu, int content) {
        this.type = type;
        this.cpu = cpu;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
}
