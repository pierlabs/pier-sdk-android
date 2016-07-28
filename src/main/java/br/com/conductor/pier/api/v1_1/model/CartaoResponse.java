package br.com.conductor.pier.api.v1_1.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class CartaoResponse  {
  
  @SerializedName("bin")
  private Integer bin = null;
  @SerializedName("codRetorno")
  private Integer codRetorno = null;
  @SerializedName("codigoDesbloqueio")
  private String codigoDesbloqueio = null;
  @SerializedName("criptografiaHSM")
  private String criptografiaHSM = null;
  @SerializedName("dataEmissao")
  private Date dataEmissao = null;
  @SerializedName("dataValidade")
  private Date dataValidade = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;
  @SerializedName("estagioCartao")
  private Integer estagioCartao = null;
  @SerializedName("estagioData")
  private Date estagioData = null;
  @SerializedName("flagReversao")
  private Boolean flagReversao = null;
  @SerializedName("flagSenha")
  private Boolean flagSenha = null;
  @SerializedName("idCartao")
  private Integer idCartao = null;
  @SerializedName("idConta")
  private Integer idConta = null;
  @SerializedName("idEmissor")
  private Integer idEmissor = null;
  @SerializedName("idLog")
  private String idLog = null;
  @SerializedName("idPessoaFisica")
  private Integer idPessoaFisica = null;
  @SerializedName("idProduto")
  private Integer idProduto = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("numeroCartaoReal")
  private String numeroCartaoReal = null;
  @SerializedName("statusCartao")
  private Integer statusCartao = null;
  @SerializedName("statusData")
  private Date statusData = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getBin() {
    return bin;
  }
  public void setBin(Integer bin) {
    this.bin = bin;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodRetorno() {
    return codRetorno;
  }
  public void setCodRetorno(Integer codRetorno) {
    this.codRetorno = codRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoDesbloqueio() {
    return codigoDesbloqueio;
  }
  public void setCodigoDesbloqueio(String codigoDesbloqueio) {
    this.codigoDesbloqueio = codigoDesbloqueio;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCriptografiaHSM() {
    return criptografiaHSM;
  }
  public void setCriptografiaHSM(String criptografiaHSM) {
    this.criptografiaHSM = criptografiaHSM;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataEmissao() {
    return dataEmissao;
  }
  public void setDataEmissao(Date dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getEstagioCartao() {
    return estagioCartao;
  }
  public void setEstagioCartao(Integer estagioCartao) {
    this.estagioCartao = estagioCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEstagioData() {
    return estagioData;
  }
  public void setEstagioData(Date estagioData) {
    this.estagioData = estagioData;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagReversao() {
    return flagReversao;
  }
  public void setFlagReversao(Boolean flagReversao) {
    this.flagReversao = flagReversao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagSenha() {
    return flagSenha;
  }
  public void setFlagSenha(Boolean flagSenha) {
    this.flagSenha = flagSenha;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
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
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getIdLog() {
    return idLog;
  }
  public void setIdLog(String idLog) {
    this.idLog = idLog;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Integer idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Integer idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroCartaoReal() {
    return numeroCartaoReal;
  }
  public void setNumeroCartaoReal(String numeroCartaoReal) {
    this.numeroCartaoReal = numeroCartaoReal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(Integer statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getStatusData() {
    return statusData;
  }
  public void setStatusData(Date statusData) {
    this.statusData = statusData;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoResponse {\n");
    
    sb.append("  bin: ").append(bin).append("\n");
    sb.append("  codRetorno: ").append(codRetorno).append("\n");
    sb.append("  codigoDesbloqueio: ").append(codigoDesbloqueio).append("\n");
    sb.append("  criptografiaHSM: ").append(criptografiaHSM).append("\n");
    sb.append("  dataEmissao: ").append(dataEmissao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("  estagioCartao: ").append(estagioCartao).append("\n");
    sb.append("  estagioData: ").append(estagioData).append("\n");
    sb.append("  flagReversao: ").append(flagReversao).append("\n");
    sb.append("  flagSenha: ").append(flagSenha).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idLog: ").append(idLog).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  numeroCartaoReal: ").append(numeroCartaoReal).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("  statusData: ").append(statusData).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


