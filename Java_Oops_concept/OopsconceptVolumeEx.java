import java.util.Scanner;
class OopsconceptVolumeEx {
    double volume;
    void volume(int width,int height,int depth){
        this.volume= width*height*depth;
    }
    void display(){
        System.out.println("Volume "+volume);
    }
    public static void main(String args[]){
        OopsconceptVolumeEx boxvolume= new OopsconceptVolumeEx();
        boxvolume.volume(100,20,10);
        boxvolume.display();
    }
}
