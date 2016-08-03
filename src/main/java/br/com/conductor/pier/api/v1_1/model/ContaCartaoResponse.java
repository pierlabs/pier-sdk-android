package br.com.conductor.pier.api.v1_1.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ContaCartaoResponse  {
  
  @SerializedName("cnpjLoja")
  private String cnpjLoja = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataCadastroConta")
  private Date dataCadastroConta = null;
  @SerializedName("dataEmissaoIdentidade")
  private Date dataEmissaoIdentidade = null;
  @SerializedName("dataNascimento")
  private Date dataNascimento = null;
  @SerializedName("dddCelular")
  private String dddCelular = null;
  @SerializedName("idConta")
  private Integer idConta = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("numeroCelular")
  private String numeroCelular = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoIdentidade")
  private String orgaoIdentidade = null;
  @SerializedName("possuiCompraAprovada")
  private String possuiCompraAprovada = null;
  @SerializedName("statusConta")
  private Integer statusConta = null;
  @SerializedName("ufIdentidade")
  private String ufIdentidade = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCnpjLoja() {
    return cnpjLoja;
  }
  public void setCnpjLoja(String cnpjLoja) {
    this.cnpjLoja = cnpjLoja;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataCadastroConta() {
    return dataCadastroConta;
  }
  public void setDataCadastroConta(Date dataCadastroConta) {
    this.dataCadastroConta = dataCadastroConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(Date dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDddCelular() {
    return dddCelular;
  }
  public void setDddCelular(String dddCelular) {
    this.dddCelular = dddCelular;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroCelular() {
    return numeroCelular;
  }
  public void setNumeroCelular(String numeroCelular) {
    this.numeroCelular = numeroCelular;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrgaoIdentidade() {
    return orgaoIdentidade;
  }
  public void setOrgaoIdentidade(String orgaoIdentidade) {
    this.orgaoIdentidade = orgaoIdentidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPossuiCompraAprovada() {
    return possuiCompraAprovada;
  }
  public void setPossuiCompraAprovada(String possuiCompraAprovada) {
    this.possuiCompraAprovada = possuiCompraAprovada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Integer statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUfIdentidade() {
    return ufIdentidade;
  }
  public void setUfIdentidade(String ufIdentidade) {
    this.ufIdentidade = ufIdentidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaCartaoResponse {\n");
    
    sb.append("  cnpjLoja: ").append(cnpjLoja).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataCadastroConta: ").append(dataCadastroConta).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  dddCelular: ").append(dddCelular).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  numeroCelular: ").append(numeroCelular).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoIdentidade: ").append(orgaoIdentidade).append("\n");
    sb.append("  possuiCompraAprovada: ").append(possuiCompraAprovada).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  ufIdentidade: ").append(ufIdentidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


