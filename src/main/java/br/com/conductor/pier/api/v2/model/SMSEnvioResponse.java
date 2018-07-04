package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{sms_envio_response_description}}}
 **/
@ApiModel(description = "{{{sms_envio_response_description}}}")
public class SMSEnvioResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("celular")
  private String celular = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("quantidadeTentativasEnvio")
  private Integer quantidadeTentativasEnvio = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;

  
  /**
   * {{{sms_envio_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{sms_envio_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{sms_envio_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{sms_envio_response_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{sms_envio_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{sms_envio_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{sms_envio_response_celular_value}}}
   **/
  @ApiModelProperty(value = "{{{sms_envio_response_celular_value}}}")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * {{{sms_envio_response_conteudo_value}}}
   **/
  @ApiModelProperty(value = "{{{sms_envio_response_conteudo_value}}}")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * {{{sms_envio_response_quantidade_tentativas_envio_value}}}
   **/
  @ApiModelProperty(value = "{{{sms_envio_response_quantidade_tentativas_envio_value}}}")
  public Integer getQuantidadeTentativasEnvio() {
    return quantidadeTentativasEnvio;
  }
  public void setQuantidadeTentativasEnvio(Integer quantidadeTentativasEnvio) {
    this.quantidadeTentativasEnvio = quantidadeTentativasEnvio;
  }

  
  /**
   * {{{s_m_s_envio_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{s_m_s_envio_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSEnvioResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  celular: ").append(celular).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  quantidadeTentativasEnvio: ").append(quantidadeTentativasEnvio).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


