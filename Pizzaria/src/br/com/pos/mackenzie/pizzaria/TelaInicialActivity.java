package br.com.pos.mackenzie.pizzaria;

import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class TelaInicialActivity extends PizzariaActivity {
	
	private static final Integer ACTIVITY_TELA = R.layout.activity_tela_inicial;
	
	private ImageButton imagemBotao;
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(getCodigoMenuInflater(), menu);
		return true;
	}

	@Override
	public int getLayoutContentView() {
		return ACTIVITY_TELA;
	}

	@Override
	public int getCodigoMenuInflater() {
		return R.menu.tela_inicial;
	}

	@Override
	public void mapeiaComponentes() {
		
		imagemBotao = (ImageButton) findViewById(R.id.bt_tela_incial_prox);
		
		imagemBotao.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				proximaTela();
			}
		});
		
	}
	
	private void proximaTela() {
		Intent intent = new Intent(TelaInicialActivity.this, TelaMontagemBasicaActivity.class);
		startActivityForResult(intent, ACTIVITY_TELA);
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
