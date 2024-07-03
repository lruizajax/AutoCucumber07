package com.store.stepDefinitions;

import com.store.util.Base;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class CheckoutSteps extends Base {

	@Dado("que el usuario esta en la página de inicio de sesión")
	public void que_el_usuario_esta_en_la_página_de_inicio_de_sesión() {

	}

	@Cuando("pongo mi usuario y contraseña")
	public void pongo_mi_usuario_y_contraseña() {
	   }

	@Entonces("debería estar logeado")
	public void debería_estar_logeado() {

	}


	@Dado("que he agregado un artículo")
	public void que_he_agregado_un_artículo() {
	}

	@Cuando("voy carrito completo la informacion requerida")
	public void voy_carrito_completo_la_informacion_requerida() {
	}

	@Cuando("confirmo los detalles de mi orden")
	public void confirmo_los_detalles_de_mi_orden() {
	}

	@Entonces("soy redirigido a la página de agradecimiento.")
	public void soy_redirigido_a_la_página_de_agradecimiento() {
	}
}
