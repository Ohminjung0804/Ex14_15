package kr.hs.emirim.w2009.ex14_15;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] fruitsArr = {"수박","참외","복숭아"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnDialog = findViewById(R.id.btn_dialog);
        Button btnFruits = findViewById(R.id.btn_fruits);
        btnDialog.setOnClickListener(btnListener);
        btnFruits.setOnClickListener(btnListener);
        //DialogInterface.OnClickListener(fruitsMultiItemListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(getApplicationContext());
            dialog.setTitle(R.string.btn_fruits);
            dialog.setMessage(R.string.dialog_message);
            dialog.setItems(fruitsArr, fruitsItemListener);
            dialog.setIcon(R.drawable.watermelon);
            dialog.setPositiveButton("닫기",null);
            dialog.show();

        }
    };

    DialogInterface.OnMultiChoiceClickListener fruitsMultiItemListener = new DialogInterface.OnMultiChoiceClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
            //btnFruits.setText(fruitsArr[which]);
        }
    };
    DialogInterface.OnClickListener fruitsItemListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {

        }
    };
    DialogInterface.OnClickListener btnPositiveListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(MainActivity.this, "대화상자 확인 버튼을 클릭하셨어요.",Toast.LENGTH_SHORT).show();

        }
    };
}