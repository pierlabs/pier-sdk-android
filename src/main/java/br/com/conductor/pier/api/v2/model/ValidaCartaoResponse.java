package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para a valida\u00E7\u00E3o de cart\u00E3o
 **/
@ApiModel(description = "Objeto de resposta para a valida\u00E7\u00E3o de cart\u00E3o")
public class ValidaCartaoResponse  {
  
  @SerializedName("idStatusCartao")
  private Long idStatusCartao = null;
  @SerializedName("statusCartao")
  private String statusCartao = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("statusConta")
  private String statusConta = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("criptogramaResposta")
  private String criptogramaResposta = null;

  
  /**
   * Descri\u00E7\u00E3o do status do cart\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status do cart\u00E3o")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Descri\u00E7\u00E3o do status do cart\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status do cart\u00E3o")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status da conta")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * Descri\u00E7\u00E3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do status da conta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * C\u00F3digo identificador da conta.
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia.
   **/
  @ApiModelProperty(value = "N\u00FAmero da ag\u00EAncia.")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente.
   **/
  @ApiModelProperty(value = "N\u00FAmero da conta corrente.")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Criptograma de resposta
   **/
  @ApiModelProperty(value = "Criptograma de resposta")
  public String getCriptogramaResposta() {
    return criptogramaResposta;
  }
  public void setCriptogramaResposta(String criptogramaResposta) {
    this.criptogramaResposta = criptogramaResposta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCartaoResponse {\n");
    
    sb.append("  idStatusCartao: ").append(idStatusCartao).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  criptogramaResposta: ").append(criptogramaResposta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
