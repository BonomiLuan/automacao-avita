# language: pt
# encoding: utf-8

@BaixarFotos
Funcionalidade: Baixar as fotos do site

	@AcessarSite
	Cenario: Acessar o site e baixar as fotos dele
		Dado que estou no site da Avita
		Quando fechar o aviso do covid
		Entao fecho navegador

	@AcessarMoradaMorumbi
	Cenario: Acessar o site e baixar as fotos dele
		Dado que estou no site da Avita
		Quando fechar o aviso do covid
		E seleciono morada morumbi
		Entao fecho navegador