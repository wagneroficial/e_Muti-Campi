package br.edu.ufopa.muticampi.ui.cobi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.edu.ufopa.muticampi.R;
import br.edu.ufopa.muticampi.Relatorio;
import br.edu.ufopa.muticampi.ui.cori.ContatoCori;
import br.edu.ufopa.muticampi.ui.cori.DadosCori;
import br.edu.ufopa.muticampi.ui.cori.EditaisCori;
import br.edu.ufopa.muticampi.ui.cori.acaoCori;
import br.edu.ufopa.muticampi.videos;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CobiFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CobiFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageButton acao, video, dados, editais, relatorio, contato;

    public CobiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CobiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CobiFragment newInstance(String param1, String param2) {
        CobiFragment fragment = new CobiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cobi, container, false);

        acao = view.findViewById(R.id.acao_cobi);
        video = view.findViewById(R.id.video_cobi);
        dados = view.findViewById(R.id.dados_cobi);
        editais = view.findViewById(R.id.editais_cobi);
        relatorio = view.findViewById(R.id.relatorio_cobi);
        contato = view.findViewById(R.id.contato_cobi);

        acao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AcaoCobi.class);
                startActivity(intent);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), videos.class);
                startActivity(intent);

            }
        });
        dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DadosCobi.class);
                startActivity(intent);

            }
        });

        editais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EditaisCobi.class);
                startActivity(intent);

            }
        });

        relatorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Relatorio.class);
                startActivity(intent);

            }
        });

        contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ContatoCobi.class);
                startActivity(intent);

            }
        });

        return view;
    }
}