package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{dados_cartao_response_description}}}
 **/
@ApiModel(description = "{{{dados_cartao_response_description}}}")
public class DadosCartaoResponse  {
  
  @SerializedName("flagVirtual")
  private Integer flagVirtual = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("cvv2")
  private String cvv2 = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("numeroAgencia")
  private Integer numeroAgencia = null;
  @SerializedName("numeroContaCorente")
  private String numeroContaCorente = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("statusConta")
  private String statusConta = null;
  @SerializedName("idStatusCartao")
  private Long idStatusCartao = null;
  @SerializedName("statusCartao")
  private String statusCartao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagVirtual() {
    return flagVirtual;
  }
  public void setFlagVirtual(Integer flagVirtual) {
    this.flagVirtual = flagVirtual;
  }

  
  /**
   * {{{dados_cartao_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{dados_cartao_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_data_validade_value}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{dados_cartao_response_cvv2_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_cvv2_value}}}")
  public String getCvv2() {
    return cvv2;
  }
  public void setCvv2(String cvv2) {
    this.cvv2 = cvv2;
  }

  
  /**
   * {{{dados_cartao_response_nome_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_nome_plastico_value}}}")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{dados_cartao_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{dados_cartao_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{dados_cartao_response_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_numero_agencia_value}}}")
  public Integer getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Integer numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{dados_cartao_response_numero_conta_corente_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_numero_conta_corente_value}}}")
  public String getNumeroContaCorente() {
    return numeroContaCorente;
  }
  public void setNumeroContaCorente(String numeroContaCorente) {
    this.numeroContaCorente = numeroContaCorente;
  }

  
  /**
   * {{{dados_cartao_response_id_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_id_status_conta_value}}}")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{dados_cartao_response_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_status_conta_value}}}")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{dados_cartao_response_id_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_id_status_cartao_value}}}")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * {{{dados_cartao_response_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_cartao_response_status_cartao_value}}}")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosCartaoResponse {\n");
    
    sb.append("  flagVirtual: ").append(flagVirtual).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cvv2: ").append(cvv2).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorente: ").append(numeroContaCorente).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  idStatusCartao: ").append(idStatusCartao).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


