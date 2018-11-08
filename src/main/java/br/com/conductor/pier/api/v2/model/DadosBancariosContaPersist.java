package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{dados_bancarios_conta_persist_description}}}
 **/
@ApiModel(description = "{{{dados_bancarios_conta_persist_description}}}")
public class DadosBancariosContaPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("numeroAgencia")
  private Long numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("idTipoContaBancaria")
  private Long idTipoContaBancaria = null;
  @SerializedName("dvContaCorrente")
  private String dvContaCorrente = null;
  @SerializedName("dvAgencia")
  private Integer dvAgencia = null;

  
  /**
   * {{{dados_bancarios_conta_persist_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_persist_numero_agencia_value}}}")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_numero_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_persist_numero_conta_corrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_codigo_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_persist_codigo_banco_value}}}")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * {{{dados_bancarios_conta_persist_id_tipo_conta_bancaria_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_persist_id_tipo_conta_bancaria_value}}}")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDvContaCorrente() {
    return dvContaCorrente;
  }
  public void setDvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDvAgencia() {
    return dvAgencia;
  }
  public void setDvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  idTipoContaBancaria: ").append(idTipoContaBancaria).append("\n");
    sb.append("  dvContaCorrente: ").append(dvContaCorrente).append("\n");
    sb.append("  dvAgencia: ").append(dvAgencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
