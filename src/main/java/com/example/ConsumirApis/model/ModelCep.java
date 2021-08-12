package com.example.ConsumirApis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Cadcep")
public class ModelCep {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long id;
	   	public String cep;
		public String logradouro;
	    public String complemento;
	    public String bairro;
	    public String localidade;
	    public String uf;
	    public String ibge;
	    public String gia;
	    public String ddd;
	    public String siafi;

	    public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getLogradouro() {
			return logradouro;
		}
		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getLocalidade() {
			return localidade;
		}
		public void setLocalidade(String localidade) {
			this.localidade = localidade;
		}
		public String getUf() {
			return uf;
		}
		public void setUf(String uf) {
			this.uf = uf;
		}
		public String getIbge() {
			return ibge;
		}
		public void setIbge(String ibge) {
			this.ibge = ibge;
		}
		public String getGia() {
			return gia;
		}
		public void setGia(String gia) {
			this.gia = gia;
		}
		public String getDdd() {
			return ddd;
		}
		public void setDdd(String ddd) {
			this.ddd = ddd;
		}
		public String getSiafi() {
			return siafi;
		}
		public void setSiafi(String siafi) {
			this.siafi = siafi;
		}

}
