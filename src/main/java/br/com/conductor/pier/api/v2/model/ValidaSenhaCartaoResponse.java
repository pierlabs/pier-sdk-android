package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{valida_senha_cartao_response_description}}}
 **/
@ApiModel(description = "{{{valida_senha_cartao_response_description}}}")
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
   * {{{valida_senha_cartao_response_mensagem_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_senha_cartao_response_mensagem_value}}}")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * {{{valida_senha_cartao_response_id_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_senha_cartao_response_id_status_cartao_value}}}")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * {{{valida_senha_cartao_response_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_senha_cartao_response_status_cartao_value}}}")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * {{{valida_senha_cartao_response_quantidade_tentativas_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_senha_cartao_response_quantidade_tentativas_value}}}")
  public Integer getQuantidadeTentativas() {
    return quantidadeTentativas;
  }
  public void setQuantidadeTentativas(Integer quantidadeTentativas) {
    this.quantidadeTentativas = quantidadeTentativas;
  }

  
  /**
   * {{{valida_senha_cartao_response_quantidade_maxima_tentativas_value}}}
   **/
  @ApiModelProperty(value = "{{{valida_senha_cartao_response_quantidade_maxima_tentativas_value}}}")
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
