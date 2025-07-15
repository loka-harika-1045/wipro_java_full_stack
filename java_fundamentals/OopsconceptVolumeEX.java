import java.util.Scanner;
class OopsconceptVolumeEX{
    double volume;
    void volume(int width,int height,int depth){
        this.volume= width*height*depth;
    }
    void display(){
        System.out.println("Volume "+volume);
    }
    public static void main(String args[]){
        OopsconceptVolumeEX boxvolume= new OopsconceptVolumeEX();
        boxvolume.volume(100,20,10);
        boxvolume.display();
    }
}
