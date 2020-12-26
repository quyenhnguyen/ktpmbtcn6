import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {
    @Test
    public void TestcaseDiem1() {
        Diem A=new Diem(4.3,5);
        Diem B=new Diem(1,-2.4);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(d,8.10246,0.00001);
    }
    @Test
    public void TestcaseDiem2() {
        Diem A=new Diem(0,0);
        Diem B=new Diem(-5,0);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(d,0,0.00001);
    }

    //**Testcase khong phai tam giac
    //3 diem thang hang
    @Test
    public void TestcaseTamGiac1() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(10,0));
        Assert.assertEquals("Khong phai tam giac", t.LoaiTamGiac());
    }
    //3 diem trung nhau
    @Test
    public void TestcaseTamGiac2() {
        TamGiac t =new TamGiac(new Diem(3.701,7.9), new Diem(3.701,7.9), new Diem(3.701,7.9));
        Assert.assertEquals("Khong phai tam giac", t.LoaiTamGiac());
    }


    //**Testcase la tam giac
    //Tam giac vuong
    @Test
    public void TestcaseTamGiac10() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(0,5));
        Assert.assertEquals("Tam giac vuong can", t.LoaiTamGiac());
    }


}
