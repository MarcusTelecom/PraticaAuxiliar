package telecom.marcus.com.praticaauxiliar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Cadastro_Atividade_Layout extends AppCompatActivity {

    Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro__atividade__layout);
    }

    public void salvar(View view) {
        btSalvar = (Button) findViewById(R.id.bt_salvar);
        Toast.makeText(getApplicationContext(),"ss",Toast.LENGTH_SHORT).show();
    }
}
