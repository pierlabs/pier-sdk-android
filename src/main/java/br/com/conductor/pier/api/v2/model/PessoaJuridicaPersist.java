package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PessoaJuridicaPersist  {
  
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoContaCorrente")
  private String digitoContaCorrente = null;

  
  /**
   * {{{pessoa_juridica_persist_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_persist_contato_value}}}")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{pessoa_juridica_persist_razao_social_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_persist_razao_social_value}}}")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * {{{pessoa_juridica_persist_CGC_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_persist_CGC_value}}}")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{pessoa_juridica_persist_inscricao_estadual_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_persist_inscricao_estadual_value}}}")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * {{{pessoa_juridica_persist_banco_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_persist_banco_value}}}")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * {{{pessoa_juridica_persist_agencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{pessoa_juridica_persist_agencia_value}}}")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * {{{pessoa_juridica_persist_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_persist_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{pessoa_juridica_persist_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_persist_conta_corrente_value}}}")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * {{{pessoa_juridica_persist_digito_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{pessoa_juridica_persist_digito_conta_corrente_value}}}")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaPersist {\n");
    
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
