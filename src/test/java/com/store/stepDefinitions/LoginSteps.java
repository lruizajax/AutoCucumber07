package com.store.stepDefinitions;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.store.factory.LoginPage;
import com.store.util.Base;

import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class LoginSteps extends Base {

	LoginPage loginPage = new LoginPage(returnDriver());
	Faker fake = new Faker(new Locale("en-US"));

	@Dado("que el usuario esta en la pagina de login")
	public void que_el_usuario_esta_en_la_pagina_de_login() {
		loginPage.navigateToLoginPage();
	}

	@Cuando("el usario ingresa sus credencuales")
	public void el_usario_ingresa_sus_credencuales() {
		// loginPage.setEmail(fake.internet().emailAddress());
		// loginPage.setPassword(fake.internet().password());
		loginPage.setEmail("lruiz@gmail.com");
		loginPage.setPassword("password");
	}

	@Cuando("hace click en el botón de Log in")
	public void hace_click_en_el_botón_de_log_in() {
		loginPage.doLogin();
	}

	@Entonces("el sistema deberia mostrarle el menu de log out")
	public void el_sistema_deberia_mostrarle_el_menu_de_log_out() {
		loginPage.isDashboardPageDisplayed();
	}

	
