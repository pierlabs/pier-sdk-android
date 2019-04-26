package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros para atualizar dados da conta banc\u00E1ria
 **/
@ApiModel(description = "Par\u00E2metros para atualizar dados da conta banc\u00E1ria")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmerdo do Banco
   **/
  @ApiModelProperty(value = "N\u00FAmerdo do Banco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * N\u00FAmero da Ag\u00EAncia
   **/
  @ApiModelProperty(value = "N\u00FAmero da Ag\u00EAncia")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * n\u00FAmero da Conta
   **/
  @ApiModelProperty(value = "n\u00FAmero da Conta")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de conta banc\u00E1ria do registro (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de conta banc\u00E1ria do registro (id)")
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
