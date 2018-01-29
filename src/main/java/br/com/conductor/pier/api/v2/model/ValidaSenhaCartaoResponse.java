package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de senha do cart\u00C3\u00A3o
 **/
@ApiModel(description = "Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de senha do cart\u00C3\u00A3o")
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
   * Mensagem
   **/
  @ApiModelProperty(value = "Mensagem")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o")
  public Long getIdStatusCartao() {
    return idStatusCartao;
  }
  public void setIdStatusCartao(Long idStatusCartao) {
    this.idStatusCartao = idStatusCartao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status do cart\u00C3\u00A3o")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * Quantidade tentativas
   **/
  @ApiModelProperty(value = "Quantidade tentativas")
  public Integer getQuantidadeTentativas() {
    return quantidadeTentativas;
  }
  public void setQuantidadeTentativas(Integer quantidadeTentativas) {
    this.quantidadeTentativas = quantidadeTentativas;
  }

  
  /**
   * Quantidade m\u00C3\u00A1xima tentativas permitidas
   **/
  @ApiModelProperty(value = "Quantidade m\u00C3\u00A1xima tentativas permitidas")
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
