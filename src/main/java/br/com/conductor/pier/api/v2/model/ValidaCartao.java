package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00A3o
 **/
@ApiModel(description = "Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00A3o")
public class ValidaCartao  {
  
  @SerializedName("criptogramaResposta")
  private String criptogramaResposta = null;
  @SerializedName("statusCartao")
  private String statusCartao = null;
  @SerializedName("statusConta")
  private String statusConta = null;

  
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
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da conta
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da conta")
  public String getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(String statusConta) {
    this.statusConta = statusConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidaCartao {\n");
    
    sb.append("  criptogramaResposta: ").append(criptogramaResposta).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


