package org.example;

public class Point {
    private int x; // iki değişken atandı x ve y olarak.
    private int y;// private yazarak sadece bu sınıf içerisinden erişilebilir oldu.

    public Point( int x, int y){ // constructer yazımı
    this.x = x; //this.setX();
    this.y = y; //this.setY();
    //setterlar ile burayı yazabiliriz.
    }

    // x y değişkenine sadece bu sınıftan erişim vardı.
    // getter metodu ile dışardan erişim yapabiliriz.
    public int getX(){
        return this.x;
    }
    public  int getY(){
        return this.y;
    }

    public void setX(int x){
     this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    // point sınıfı içerisinde metod tanımlama
    // iki noktanın birbirine olan uzaklığı proplemi
    public double distance(){// a=this.x, b=(0,0)
        //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        //(0 - this.x)*(0 - this.x)+ (0 - this.y)*(0 - this.y)
        //Math.pow(this.x, 2) + Math.pow(this.y, 2) math.pow karesini almak
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    // verilen noktaya göre uzaklık

    public  double distance(Point p){
        // a=point(this.x,this.y), b=(p.x,p.y)
        //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        //(p.x - this.x)*(p.x - this.x)+ (p.y - this.y)*(p.y - this.y)
        //Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2)
    return Math.sqrt(Math.pow((p.x - this.x),2) + Math.pow((p.y - this.y),2));
    }
    // (a,b) ye göre uzaklık bulunmalı.
    public double distance(int a, int b){
        // a=(this.x,this.y), b=(a, b)
        //(a- this.x)*(a - this.x)+ (b - this.y)*(b- this.y)
        return Math.sqrt(Math.pow((a - this.x),2) + Math.pow((b - this.y),2));
    }
}
