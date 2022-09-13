package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edtuser,edtpassword;
    Button btndangnhap;
    String ten,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Anhxa();
        btndangnhap = (Button) findViewById(R.id.buttonSignin);
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length() != 0 && edtpassword.getText().length() !=0){
                    if (edtuser.getText().toString().equals(ten) && edtpassword.getText().toString().equals(mk)){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,MainActivity.class);
                        startActivity(intent);
                    }else if (edtuser.getText().toString().equals("khanhle") && edtpassword.getText().toString().equals("12345")){
                        Toast.makeText(Login.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this,MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Login.this,"Sai mật khẩu",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Login.this,"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void Anhxa(){
        edtuser = (EditText) findViewById(R.id.edittextUser);
        edtpassword = (EditText) findViewById(R.id.edittextPassword);
        btndangnhap = (Button) findViewById(R.id.buttonSignin);
    }
}