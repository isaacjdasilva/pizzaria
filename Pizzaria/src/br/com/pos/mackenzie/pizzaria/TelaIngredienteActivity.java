package br.com.pos.mackenzie.pizzaria;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class TelaIngredienteActivity extends PizzariaActivity {
	
	private static final Integer CODIGO = R.layout.activity_tela_ingrediente;
	
	private ImageButton imagemBotao;
	
	@Override
	public void mapeiaComponentes() {
		
		imagemBotao = (ImageButton) findViewById(R.id.botao_tela_ingrediete);
		
		imagemBotao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				proximaTela();
			}
		});
		
	}

	public void proximaTela() {
		Intent intent = new Intent(TelaIngredienteActivity.this, TelaPrincipalActivity.class);
		startActivityForResult(intent, CODIGO);
	}

	@Override
	public int getLayoutContentView() {
		return CODIGO;
	}

	@Override
	public int getCodigoMenuInflater() {
		return R.menu.tela_ingrediente;
	}


	@Override
	public void setaResultadoActivity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void obtemExtras() {
		// TODO Auto-generated method stub
		
	}

}
