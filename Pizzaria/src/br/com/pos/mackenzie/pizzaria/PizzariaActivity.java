/**
 * 
 */
package br.com.pos.mackenzie.pizzaria;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * @author Isaac
 *
 */
public abstract class PizzariaActivity extends Activity {
	
	public abstract int getLayoutContentView();
	
	public abstract int getCodigoMenuInflater();
	
	public abstract void mapeiaComponentes();
	
	public abstract void setaResultadoActivity();
	
	public abstract void obtemExtras();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getLayoutContentView());

		mapeiaComponentes();

		obtemExtras();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		int codigo = getCodigoMenuInflater();
		
		if (codigo > -1) {
			getMenuInflater().inflate(getCodigoMenuInflater(), menu);
			return true;
		} else {
			return false;
		}
	}

	public Integer getCodigoActivity() {
		return getLayoutContentView();
	}
}