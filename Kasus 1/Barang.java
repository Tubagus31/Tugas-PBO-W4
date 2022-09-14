package TugasPraktikum4_Kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public int getstok() {
		return stok;
	}
	
	public void setstok(int stok) {
		this.stok += stok;
	}
			
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	
}
