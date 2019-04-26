package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Header do Webhook
 **/
@ApiModel(description = "Objeto Header do Webhook")
public class WebhookHeaderPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("valor")
  private String valor = null;

  
  /**
   * Nome do header
   **/
  @ApiModelProperty(value = "Nome do header")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Valor do header
   **/
  @ApiModelProperty(value = "Valor do header")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookHeaderPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
