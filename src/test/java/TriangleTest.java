import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {
    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    @Test
    public void Testcase1() {
        Diem A=new Diem(4.3,5);
        Diem B=new Diem(1,-2.4);
        double d=A.tinhKhoangCach(B);
        Assert.assertEquals(d,8.10246,0.00001); }
}
