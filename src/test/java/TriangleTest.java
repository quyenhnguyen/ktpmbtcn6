import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {
    @Test
    public void TestcaseDiem1() {
        Diem A=new Diem(4.3,5);
        Diem B=new Diem(1,-2.4);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(8.10246,d,0.00001);
    }
    @Test
    public void TestcaseDiem2() {
        Diem A=new Diem(0,0);
        Diem B=new Diem(-5,0);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(5,d,0.00001);
    }
    @Test
    public void TestcaseDiem3() {
        Diem A=new Diem(1,0);
        Diem B=new Diem(0,0.1);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(1.0049875621,d,0.0000000001);
    }

    //**Testcase khong phai tam giac
    //3 diem thang hang
    @Test
    public void TestcaseNotTamGiac1() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(10,0));
        Assert.assertEquals("Khong phai tam giac", t.LoaiTamGiac());
    }
    //3 diem trung nhau
    @Test
    public void TestcaseNotTamGiac2() {
        TamGiac t =new TamGiac(new Diem(3.701,7.9), new Diem(3.701,7.9), new Diem(3.701,7.9));
        Assert.assertEquals("Khong phai tam giac", t.LoaiTamGiac());
    }
    //2 diem trung nhau
    @Test
    public void TestcaseNotTamGiac3() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(-3.701,7.9), new Diem(-3.701,7.9));
        Assert.assertEquals("Khong phai tam giac", t.LoaiTamGiac());
    }



    //**Testcase la tam giac
    //Tam giac vuong
    @Test
    public void TestcaseTamGiacVuong1() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(0,8));
        Assert.assertEquals("Tam giac vuong", t.LoaiTamGiac());
    }
    @Test
    public void TestcaseTamGiacVuong2() {
        TamGiac t =new TamGiac(new Diem(-1,1), new Diem(2,4), new Diem(6,0));
        Assert.assertEquals("Tam giac vuong", t.LoaiTamGiac());
    }

    //Tam giac nhon
    @Test
    public void TestcaseTamGiacNhon1() {
        TamGiac t =new TamGiac(new Diem(3,0), new Diem(0,4), new Diem(-2,1));
        Assert.assertEquals("Tam giac nhon", t.LoaiTamGiac());
    }
    @Test//gan thang hang
    public void TestcaseTamGiacNhon2() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(-3.10333333333333333333,7.7215843961085), new Diem(-3.10333333333333333,7.7215843961085));
        Assert.assertEquals("Tam giac nhon", t.LoaiTamGiac());
    }
    @Test//2 diem gan trung nhau
    public void TestcaseTamGiacNhon3() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(0.00000000000000001,7), new Diem(0,7));
        Assert.assertEquals("Tam giac nhon", t.LoaiTamGiac());
    }

    @Test//giong tam giac can
    public void TestcaseTamGiacNhon4() {
        TamGiac t =new TamGiac(new Diem(-10,1), new Diem(-10,5), new Diem(0,3.0000000991));
        Assert.assertEquals("Tam giac nhon", t.LoaiTamGiac());
    }

    //Tam giac tu
    @Test
    public void TestcaseTamGiacTu1() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(1,1), new Diem(1,2));
        Assert.assertEquals("Tam giac tu", t.LoaiTamGiac());
    }
    @Test//gan tam giac vuong
    public void TestcaseTamGiacTu2() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(0,7.1854), new Diem(0,-0.0000000001));
        Assert.assertEquals("Tam giac tu", t.LoaiTamGiac());
    }
    @Test//gan thang hang
    public void TestcaseTamGiacTu3() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(0,7.1854), new Diem(0.0000000001,-7.1854));
        Assert.assertEquals("Tam giac tu", t.LoaiTamGiac());
    }

    //Tam giac deu A(0,0),  B(a,0), C(a/2;a*sqrt(3)/2)
    @Test
    public void TestcaseTamGiacDeu1() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(6,0), new Diem(3,3*Math.sqrt(3)));
        Assert.assertEquals("Tam giac deu", t.LoaiTamGiac());
    }

    //Tam giac can
    @Test
    public void TestcaseTamGiacCan1() {
        TamGiac t =new TamGiac(new Diem(-10,1), new Diem(-10,5), new Diem(0,3));
        Assert.assertEquals("Tam giac can", t.LoaiTamGiac());
    }
    @Test
    public void TestcaseTamGiacCan2() {
        TamGiac t =new TamGiac(new Diem(2,1), new Diem(4.5,5.3333333333333), new Diem(7,1));
        Assert.assertEquals("Tam giac can", t.LoaiTamGiac());
    }

    //Tinh chu vi tam giac
    @Test//khong phai tam giac
    public void TestcaseChuVi1() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(10,0));
        Assert.assertEquals(0, t.TinhChuVi(),0.0000001);
    }
    @Test//tam giac vuong
    public void TestcaseChuVi2() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(5,0), new Diem(0,8));
        Assert.assertEquals(22.4339811320566, t.TinhChuVi(),0.0000001);
    }

    @Test//tam giac nhon
    public void TestcaseChuVi3() {
        TamGiac t =new TamGiac(new Diem(3,0), new Diem(0,4), new Diem(-2,1));
        Assert.assertEquals(13.7045707890568, t.TinhChuVi(),0.0000001);
    }
    @Test//tam giac tu
    public void TestcaseChuVi4() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(1,1), new Diem(1,2));
        Assert.assertEquals(4.6502815398729, t.TinhChuVi(),0.0000001);
    }
    @Test//tam giac deu
    public void TestcaseChuVi5() {
        TamGiac t =new TamGiac(new Diem(0,0), new Diem(6,0), new Diem(3,3*Math.sqrt(3)));
        Assert.assertEquals(18, t.TinhChuVi(),0.0000001);
    }

    @Test//tam giac can
    public void TestcaseChuVi6() {
        TamGiac t =new TamGiac(new Diem(-10,1), new Diem(-10,5), new Diem(0,3));
        Assert.assertEquals(24.3960780543711, t.TinhChuVi(),0.0000001);
    }
}
