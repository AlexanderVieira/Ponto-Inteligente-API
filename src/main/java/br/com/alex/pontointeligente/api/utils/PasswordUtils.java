package br.com.alex.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PasswordUtils {
	
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		
		//log.info("Gerando hash com Bcrypt.");
		//BcryptPasswordEncoder bcryptEncoder = new BcryptPasswordEncoder();
		return senha; 
	}

}
