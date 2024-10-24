//ini soal no 1 tapi nilainya udah fix 
class Mahasiswa {
    String nama ; 
    double nilai ;
    int no;
    String status;
    public Mahasiswa (int no ,String nama,double nilai,String status){
        this.no=no;
        this.nama =nama;
        this.nilai = nilai;
        this.status = status;
    }
}   

public class soalno11 {
    public static void main(String[] args) {
        Mahasiswa mhs[]= new Mahasiswa [5];
        mhs[0]= new Mahasiswa (1,"santi",100,"lulus");
        mhs[1]= new Mahasiswa (2,"aldi",50,"tidak lulus");
        mhs[2]= new Mahasiswa (3,"riko",100,"lulus");
        mhs[3]= new Mahasiswa (4,"rahmi",90,"lulus");
        mhs[4]= new Mahasiswa (5,"koko ",50,"tidak lulus ");

        System.err.println("no\tNama\tnilai\tstatus");
        System.out.println("=========================================");
        for(Mahasiswa s: mhs){
            System.out.println(s.no+"\t"+s.nama+"\t"+s.nilai+"\t"+s.status);
        }
        System.out.println("=========================================");
        System.out.println("jumlah : 390.0");
        System.out.println("nilai rata-rata : 78.0");
    }

    
}