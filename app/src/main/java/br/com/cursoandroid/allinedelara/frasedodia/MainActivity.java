package br.com.cursoandroid.allinedelara.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoNovaFrase;
    private TextView fraseDoDia;
private String[] frases = {"A vingança nunca é plena, mata a alma e envenena - Seu Madruga",
        "O medo é o caminho para o lado negro - Mestre Yoda",
        "Faça ou não faça. A tentativa não existe - Metre Yoda",
        "Treine a si mesmo a deixar partir tudo que teme perder - Mestre Yoda",
        "O medo leva à raiva, a raiva leva ao ódio e o ódio leva ao sofrimento - Metre Yoda",
        "Posso não ter um centavo no bolso, mas tenho um sorriso no rosto e isso vale mais que todo dinheiro do mundo - Seu Madruga",
        "Eu sabia que você era idiota, mas não a nível executivo! - Seu Madruga",
        "As pessoas boas devem amar seu inimigos - Seu Madruga"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fraseDoDia = (TextView) findViewById(R.id.fraseDoDiaId);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseId);
        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int num = random.nextInt(frases.length);
                fraseDoDia.setText(frases[num]);

            }
        });


    }
}
