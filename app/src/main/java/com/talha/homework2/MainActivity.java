package com.talha.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EditTextBirinciSayi, EditTextIkinciSayi;
    private TextView txtSonuc;
    private String birinciSayi, ikinciSayi;
    private float s1, s2, sonuc;
    private Hesapla hesapla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextBirinciSayi = (EditText) findViewById(R.id.EditTextBirinciSayi);
        EditTextIkinciSayi = (EditText) findViewById(R.id.EditTextIkinciSayi);
        txtSonuc = (TextView) findViewById(R.id.txtViewSonuc);
    }

    public void btnHesapla(View v) {
        birinciSayi = EditTextBirinciSayi.getText().toString();
        ikinciSayi = EditTextIkinciSayi.getText().toString();

        if (!TextUtils.isEmpty(birinciSayi) && !TextUtils.isEmpty(ikinciSayi)) {
            s1 = Float.valueOf(birinciSayi);
            s2 = Float.valueOf(ikinciSayi);
            hesapla = new Hesapla(s1, s2);

            switch (v.getId()) {
                case R.id.btnTopla:
                    sonuc = hesapla.toplam();
                    break;
                case R.id.btnCikar:
                    sonuc = hesapla.fark();
                    break;
                case R.id.btnBol:
                    sonuc = hesapla.bolum();
                    break;
                case R.id.btnCarp:
                    sonuc = hesapla.carpım();
                    break;

            }
            txtSonuc.setText("Sonuç:" + sonuc);
        } else
                txtSonuc.setText("Girilen değerler boş olamaz");



    }
}