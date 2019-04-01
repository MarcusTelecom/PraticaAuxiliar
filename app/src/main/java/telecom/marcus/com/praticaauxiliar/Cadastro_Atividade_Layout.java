package telecom.marcus.com.praticaauxiliar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Cadastro_Atividade_Layout extends AppCompatActivity {

    Button btSalvar;
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6,
            radioGroup7, radioGroup8, radioGroup9, radioGroup10;
    RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5, radioButton6,
            radioButton7, radioButton8, radioButton9, radioButton10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__atividade__layout);

        btSalvar = (Button) findViewById(R.id.bt_salvar);
        radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup_atv_1);
        radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup_atv_2);
        radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup_atv_3);
        radioGroup4 = (RadioGroup) findViewById(R.id.radioGroup_atv_4);
        radioGroup5 = (RadioGroup) findViewById(R.id.radioGroup_atv_5);
        radioGroup6 = (RadioGroup) findViewById(R.id.radioGroup_atv_6);
        radioGroup7 = (RadioGroup) findViewById(R.id.radioGroup_atv_7);
        radioGroup8 = (RadioGroup) findViewById(R.id.radioGroup_atv_8);
        radioGroup9 = (RadioGroup) findViewById(R.id.radioGroup_atv_9);
        radioGroup10 = (RadioGroup) findViewById(R.id.radioGroup_atv_10);
    }

    public void salvar(View view) {
        radioButton1  = findViewById(radioGroup1.getCheckedRadioButtonId());
        int op_rad_1  = validar_op(radioButton1);

        radioButton2  = findViewById(radioGroup2.getCheckedRadioButtonId());
        int op_rad_2  = validar_op(radioButton2);

        radioButton3  = findViewById(radioGroup3.getCheckedRadioButtonId());
        int op_rad_3  = validar_op(radioButton3);

        radioButton4  = findViewById(radioGroup4.getCheckedRadioButtonId());
        int op_rad_4  = validar_op(radioButton4);

        radioButton5  = findViewById(radioGroup5.getCheckedRadioButtonId());
        int op_rad_5  = validar_op(radioButton5);

        radioButton6  = findViewById(radioGroup6.getCheckedRadioButtonId());
        int op_rad_6  = validar_op(radioButton6);

        radioButton7  = findViewById(radioGroup7.getCheckedRadioButtonId());
        int op_rad_7  = validar_op(radioButton7);

        radioButton8  = findViewById(radioGroup8.getCheckedRadioButtonId());
        int op_rad_8  = validar_op(radioButton8);

        radioButton9  = findViewById(radioGroup9.getCheckedRadioButtonId());
        int op_rad_9  = validar_op(radioButton9);

        radioButton10  = findViewById(radioGroup10.getCheckedRadioButtonId());
        int op_rad_10  = validar_op(radioButton10);
    }

    private int validar_op(RadioButton radioButton) {

        if (radioButton.getText().equals("Regular")) {
            return 1;
        } else if (radioButton.getText().equals("Bom")) {
            return 2;
        } else if (radioButton.getText().equals("Ótimo")) {
            return 3;
        } else {
            return 0;
        }

    }
}
