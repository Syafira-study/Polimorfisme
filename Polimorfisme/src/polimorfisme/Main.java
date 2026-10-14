/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] argv) {
        Pegawai p = new Pegawai();
        p = new Programmer(); //polimorfisme
        p = new Manajer(); //polimorfisme
        
        //Manajer m = new Programmer(); 
        //tidak bisa karena programmer bukan subclass manajer
        
        Manajer m = new Manajer();
        m.gajipokok = 10000;
        m.nama = "Sean";
        m.tunjangan = 5000;
        
        p = m; //polimorfisme
        p.tampilData(); //VIRTUAL METHOD INOCATION-VMI
        m.tampilData(); //Bukan VMI, krn m bukan objek polimorfisme
        
        Pegawai[] arrPeg = new Pegawai[3];
        Programmer pr = new Programmer();
        pr.nama = "Aciel";
        pr.gajipokok = 100000;
        pr.bonus = 120000;
        pr.tampilData();
        
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Programmer();
        
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);
    }
    
    public static void hitungGajiTotal(Pegawai p){ //(Pegawai p - polimorfisme
        if(p instanceof Programmer){
            Programmer prog = (Programmer) p; //(Programmer)p = Casting Objek
            int gajiTot = prog.bonus+prog.gajipokok;
            System.out.println("Gaji Total Programmer = "+gajiTot);
        }else if(p instanceof Manajer){
            Manajer man = (Manajer) p;
            int gajiTot = man.tunjangan+man.gajipokok;
            System.out.println("Gaji Total Menejer = "+gajiTot);
        }
    }   
}
