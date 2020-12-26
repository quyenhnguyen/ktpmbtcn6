import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {
    @Test
    public void Testcase1() {
        Diem A=new Diem(4.3,5);
        Diem B=new Diem(1,-2.4);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(d,8.10246,0.00001);
    }
    @Test
    public void Testcase2() {
        Diem A=new Diem(0,0);
        Diem B=new Diem(0,0);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(d,0,0.00001);
    }
    @Test
    public void Testcase3() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(0,5));
        Assert.assertEquals("Tam giac vuong can", t.LoaiTamGiac());
    }

}
