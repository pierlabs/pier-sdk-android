package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{dados_bancarios_conta_update_description}}}
 **/
@ApiModel(description = "{{{dados_bancarios_conta_update_description}}}")
public class DadosBancariosContaUpdate  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("numeroAgencia")
  private Long numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("idTipoContaBancaria")
  private Long idTipoContaBancaria = null;

  
  /**
   * {{{dados_bancarios_conta_update_idConta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_update_idConta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_bancarios_conta_update_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_update_banco_value}}}")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * {{{dados_bancarios_conta_update_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_update_agencia_value}}}")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{dados_bancarios_conta_update_contaCorrente_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_update_contaCorrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{dados_bancarios_conta_update_idTipoContaBancaria_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_bancarios_conta_update_idTipoContaBancaria_value}}}")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaUpdate {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  idTipoContaBancaria: ").append(idTipoContaBancaria).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
