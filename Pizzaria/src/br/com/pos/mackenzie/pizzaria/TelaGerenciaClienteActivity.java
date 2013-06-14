package br.com.pos.mackenzie.pizzaria;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import br.com.pos.mackenzie.pizzaria.domain.Restaurante;

public class TelaGerenciaClienteActivity extends PizzariaActivity {

	private static final Integer ACTIVITY_TELA = R.layout.activity_tela_gerencia_cliente;

	Button salvar;
	ImageButton botaoProximo;

	Restaurante r = new Restaurante();

	@Override
	public int getLayoutContentView() {
		return ACTIVITY_TELA;
	}

	@Override
	public int getCodigoMenuInflater() {
		return R.menu.tela_gerencia_cliente;
	}

	@Override
	public void mapeiaComponentes() {
		salvar = (Button) findViewById(R.id.salvar);
		salvar.setOnClickListener(onSave);

		botaoProximo = (ImageButton) findViewById(R.id.botao_tela_gerencia_cliente);
		salvar.setOnClickListener(proximaTela);
	}

	private OnClickListener onSave = new OnClickListener() {

		public void onClick(View arg0) {
			EditText nome = (EditText) findViewById(R.id.nome);
			EditText endereco = (EditText) findViewById(R.id.logradouro);

			r.setNome(nome.getText().toString());
			r.setEndereco(endereco.getText().toString());

			RadioGroup tipos = (RadioGroup) findViewById(R.id.tipos);

			switch (tipos.getCheckedRadioButtonId()) {
			case R.id.rodizio:
				r.setTipo("rodizio");
				break;
			case R.id.fast_food:
				r.setTipo("fast_food");
				break;
			case R.id.a_domicilio:
				r.setTipo("a_domicilio");
				break;
			}
		}

	};

	private OnClickListener proximaTela = new OnClickListener() {

		public void onClick(View arg0) {
			Intent intent = new Intent(TelaGerenciaClienteActivity.this,
					TelaInicialActivity.class);
			startActivityForResult(intent, ACTIVITY_TELA);
		}
	};

	@Override
	public void setaResultadoActivity() {
		// TODO Auto-generated method stub

	}

	@Override
	public void obtemExtras() {
		// TODO Auto-generated method stub

	}

}