package com.example.desen.gestoradetarefas;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdicionarFragment extends Fragment {
    private EditText txtTitulo;
    private EditText txtDescricao;
    private Button btnSalvarNota;

    public AdicionarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_adicionar, container, false);

        txtTitulo = v.findViewById(R.id.txtTitulo);
        txtDescricao = v.findViewById(R.id.txtDescricao);
        btnSalvarNota = v.findViewById(R.id.btnSalvarNota);

        Tarefas tarefas = TarefaSingleton.getInstance().getTarefas();

        View.OnClickListener listenerTarefa = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tarefas tarefas = new Tarefas();
                tarefas.setTitulo(txtTitulo.getText().toString());
                tarefas.setDescricao(txtDescricao.getText().toString());

                TarefaSingleton.getInstance().setTarefas(tarefas);

                Tarefas tarefa = TarefaSingleton.getInstance().getTarefas();/* não está no plural */
                //teste.setText(note.getTitulo());

                Snackbar.make(v, "Tarefa salva!", Snackbar.LENGTH_SHORT)
                        .setAction("Ação", null).show();


                MainActivity main = (MainActivity) getActivity();
               // main.retornar();

                String textoTitulo = tarefas.getTitulo();
                String textoMensagem = tarefas.getDescricao();

                /* addItem(textoTitulo, textoMensagem);*/



            }
        };
        btnSalvarNota.setOnClickListener(listenerTarefa);
        return v;
    }

}
