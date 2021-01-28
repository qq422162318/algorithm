package java设计模式.代理模式.静态代理;

public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao iTeacherDao;
    public TeacherDaoProxy(ITeacherDao iTeacherDao){
        this.iTeacherDao=iTeacherDao;
    }
    @Override
    public void teach() {
       iTeacherDao.teach();
    }
}
