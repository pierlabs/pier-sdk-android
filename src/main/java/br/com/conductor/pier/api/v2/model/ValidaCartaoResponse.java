package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{valida_cartao_response_description}}}
 **/
@ApiModel(description = "{{{valida_cartao_response_description}}}")
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
   * {{{valida_cartao_response_id_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_id_status_cartao_value}}}")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * {{{valida_cartao_response_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_status_cartao_value}}}")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * {{{valida_cartao_response_id_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_id_status_conta_value}}}")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{valida_cartao_response_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_status_conta_value}}}")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{valida_cartao_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{valida_cartao_response_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{valida_cartao_response_numero_conta_corrente_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_numero_conta_corrente_value}}}")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * {{{valida_cartao_response_criptograma_resposta_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_cartao_response_criptograma_resposta_value}}}")
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


