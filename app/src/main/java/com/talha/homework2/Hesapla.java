package com.talha.homework2;

public class Hesapla {
    private float gelensayi1 , gelensayi2;

    public Hesapla(float gelensayi1 , float gelensayi2){
        this.gelensayi1 = gelensayi1;
        this.gelensayi2 = gelensayi2;
    }

    public float toplam(){
        return gelensayi1 + gelensayi2;
    }

    public float fark(){
        return gelensayi1 - gelensayi2;
    }

    public float bolum(){
        return gelensayi1 / gelensayi2;
    }

    public float carpım(){
        return gelensayi1 * gelensayi2;
    }
}
