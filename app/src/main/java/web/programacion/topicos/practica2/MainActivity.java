package web.programacion.topicos.practica2;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import web.programacion.topicos.practica2.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;

    List<Customer> items   = new ArrayList<Customer>();
    public static String consumer_key ="ck_9504739e63fdbdefa492559699298c92b10237ed";
    public static String consumer_secret = "cs_b374d814c0b933e991812a107fe184de7fd94db3";
    public static String url = "https://192.168.0.23/DeportesITC/wc-api/v3/customers";
    String auth_url = "https://192.168.0.23/wordpress/auth_users.php";

    String jsonResult, loginResult;
    Dialog dLogin;
    CustomerAdapter cAdapter;


    Button btnAceptar, btnCancelar;
    EditText txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
