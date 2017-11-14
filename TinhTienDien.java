class TienDien
{
	private String tenKhachHang;
	private int chiSoCu;
	private int chiSoMoi;
	public TienDien(String tk,int csc,int csm)
	{
		tenKhachHang=tk;
		chiSoCu= csc;
		chiSoMoi= csm;
	}
	public int ganChiSo(int csm)
	{
		chiSoCu=chiSoMoi;
		chiSoMoi=csm;
		return csm;
	}
	public double tinhTien()
	{
		double t;
		int d;
		d=this.chiSoMoi-this.chiSoCu;
		if (d <= 100)
		{
			 t= d*500;
		}
		if (d <= d+50)
		{
			t = d*800;
		}
		if (d <= d+50)
		{
			 t = d*1300;
		}
		else t=d*2000;
		return t;
	}
	public void hienThi()
	{
		System.out.println("Ten khach hang: "+tenKhachHang+"\n"+"So dien tieu thu: "+(this.chiSoMoi-this.chiSoCu)+"kw"+"\n"+"So tien: "+this.tinhTien()+" dong");
	}
}
class SDTienDien
{
	public static void main(String agrs[])
	{
	TienDien a= new TienDien("Huyen", 100,200);
	TienDien b= new TienDien("Thanh",110,190);
	TienDien c= new TienDien("Phuong",120,180);
	TienDien d= new TienDien("Thao",200,400);
	TienDien e= new TienDien("Dinh",90,150);
	a.hienThi();
	b.hienThi();
	c.hienThi();
	d.hienThi();
	e.hienThi();
	a.ganChiSo(400);
	b.ganChiSo(250);
	c.ganChiSo(280);
	d.ganChiSo(550);
	e.ganChiSo(360);
	a.hienThi();
	b.hienThi();
	c.hienThi();
	d.hienThi();
	e.hienThi();
	double t;
	t=(a.tinhTien()+b.tinhTien()+c.tinhTien()+d.tinhTien()+e.tinhTien());
	System.out.println("Tong so tien cua cac tai khoang la: "+t+" dong");
	}
}