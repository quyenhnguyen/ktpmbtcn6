public class TamGiac {
    public TamGiac(Diem diemA, Diem diemB, Diem diemC) {
        this.diemA = diemA;
        this.diemB = diemB;
        this.diemC = diemC;
    }

    public Diem getDiemA() {
        return diemA;
    }

    public void setDiemA(Diem diemA) {
        this.diemA = diemA;
    }

    public Diem getDiemB() {
        return diemB;
    }

    public void setDiemB(Diem diemB) {
        this.diemB = diemB;
    }

    public Diem getDiemC() {
        return diemC;
    }

    public void setDiemC(Diem diemC) {
        this.diemC = diemC;
    }

    Diem diemA;
    Diem diemB;
    Diem diemC;

    public boolean KiemTraTamGiac()
    {
        double  d1=diemA.tinhKhoangCach(diemB);
        double  d2=diemA.tinhKhoangCach(diemC);
        double  d3=diemB.tinhKhoangCach(diemC);

        return (d1<d2+d3&&d2<d1+d3&&d3<d1+d2);//true neu la tam giac

    }

    //
    public String LoaiTamGiac()
    {
        double  a=diemA.tinhKhoangCach(diemB);
        double  b=diemA.tinhKhoangCach(diemC);
        double  c=diemB.tinhKhoangCach(diemC);

        double aa=diemA.tinhBinhPhuongKhoangCach(diemB);
        double bb=diemA.tinhBinhPhuongKhoangCach(diemC);
        double cc=diemB.tinhBinhPhuongKhoangCach(diemC);

        if(KiemTraTamGiac()){
            if( aa==bb+cc || bb==aa+cc || cc== aa+bb)
                return "Tam giac vuong";
            else if(a==b && b==c)
                return "Tam giac deu";
            else if(a==b || a==c || b==c)
                return "Tam giac can";
            else if(aa > bb+cc || bb > aa+cc || cc > aa+bb)
                return "Tam giac tu";
            else
                return "Tam giac nhon";
        }
        return "Khong phai tam giac";
    }
    public double  TinhChuVi(){
        if(KiemTraTamGiac())
        {
            return diemA.tinhKhoangCach(diemB)+diemA.tinhKhoangCach(diemC)+diemB.tinhKhoangCach(diemC);
        }
        return 0;
    }
}
