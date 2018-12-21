package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of response for the validation of the card password
 **/
@ApiModel(description = "Object of response for the validation of the card password")
public class ValidaSenhaCartaoResponse  {
  
  @SerializedName("mensagem")
  private String mensagem = null;
  @SerializedName("idStatusCartao")
  private Long idStatusCartao = null;
  @SerializedName("statusCartao")
  private String statusCartao = null;
  @SerializedName("quantidadeTentativas")
  private Integer quantidadeTentativas = null;
  @SerializedName("quantidadeMaximaTentativas")
  private Integer quantidadeMaximaTentativas = null;

  
  /**
   * Message
   **/
  @ApiModelProperty(value = "Message")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Description of the card status
   **/
  @ApiModelProperty(value = "Description of the card status")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Description of the card status
   **/
  @ApiModelProperty(value = "Description of the card status")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * Quantity attempts
   **/
  @ApiModelProperty(value = "Quantity attempts")
  public Integer getQuantidadeTentativas() {
    return quantidadeTentativas;
  }
  public void setQuantidadeTentativas(Integer quantidadeTentativas) {
    this.quantidadeTentativas = quantidadeTentativas;
  }

  
  /**
   * Maximum Quantity of allowed attempts
   **/
  @ApiModelProperty(value = "Maximum Quantity of allowed attempts")
  public Integer getQuantidadeMaximaTentativas() {
    return quantidadeMaximaTentativas;
  }
  public void setQuantidadeMaximaTentativas(Integer quantidadeMaximaTentativas) {
    this.quantidadeMaximaTentativas = quantidadeMaximaTentativas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaSenhaCartaoResponse {\n");
    
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("  idStatusCartao: ").append(idStatusCartao).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("  quantidadeTentativas: ").append(quantidadeTentativas).append("\n");
    sb.append("  quantidadeMaximaTentativas: ").append(quantidadeMaximaTentativas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
