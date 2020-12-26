public class Diem {
    public Diem(double  x, double  y) {
        this.x = x;
        this.y = y;
    }

    public double  getX() {
        return x;
    }

    public void setX(double  x) {
        this.x = x;
    }

    public double  getY() {
        return y;
    }

    public void setY(double  y) {
        this.y = y;
    }

    public double  tinhKhoangCach(Diem point2)
    {
        return (double ) Math.sqrt(Math.pow(point2.getX()-this.getX(),2)+Math.pow(point2.getY()-this.getY(),2));
    }

    double  x;
    double  y;

}
