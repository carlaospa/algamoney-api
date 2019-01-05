package com.example.algamoney.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("algamomey")
public class AlgamoneyApiProperty {
	
	private String originPermitida = "http://localhost:8000";
	
	private final Seguranca seguranca = new Seguranca();
	
	
	public String getOriginPermitida() {
		return originPermitida;
	}


	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}


	public Seguranca getSeguranca() {
		return seguranca;
	}

	public static class Seguranca{
		
		private boolean enabledHttps;

		public boolean isEnabledHttps() {
			return enabledHttps;
		}

		public void setEnabledHttps(boolean enabledHttps) {
			this.enabledHttps = enabledHttps;
		}	
		
	}
}
