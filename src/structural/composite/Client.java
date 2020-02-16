package structural.composite;

/**
 * @author 朱志军
 * @create 2020-02-13 16:23
 * @desc 终端测试
 **/
public class Client {
    public static void main(String[] args) {
        Folder f1,f11;
        AbstractFile f2,f3,f4,f5;

        f1 = new Folder("我的收藏");
        f11 = new Folder("电影");
        f2 = new ImageFile("我的头像.jpg");
        f3 = new TextFile("日记.txt");
        f4 = new VideoFile("笑傲江湖.avi");
        f5 = new VideoFile("神雕侠侣.avi");

        f1.add(f2);
        f1.add(f3);
        f11.add(f4);
        f11.add(f5);
        f1.add(f11);

        f1.killVirus();


    }
}
