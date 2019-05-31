package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa um objeto para atualizar uma indica\u00E7\u00E3o
 **/
@ApiModel(description = "Representa um objeto para atualizar uma indica\u00E7\u00E3o")
public class IndicacaoAmigoUpdate  {
  
  @SerializedName("cpfIndicado")
  private String cpfIndicado = null;
  @SerializedName("emailIndicado")
  private String emailIndicado = null;
  @SerializedName("dataUtilizacao")
  private String dataUtilizacao = null;
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * N\u00FAmero do CPF do amigo indicado
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do CPF do amigo indicado")
  public String getCpfIndicado() {
    return cpfIndicado;
  }
  public void setCpfIndicado(String cpfIndicado) {
    this.cpfIndicado = cpfIndicado;
  }

  
  /**
   * Email do amigo indicado
   **/
  @ApiModelProperty(required = true, value = "Email do amigo indicado")
  public String getEmailIndicado() {
    return emailIndicado;
  }
  public void setEmailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
  }

  
  /**
   * Data da utiliza\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da utiliza\u00E7\u00E3o")
  public String getDataUtilizacao() {
    return dataUtilizacao;
  }
  public void setDataUtilizacao(String dataUtilizacao) {
    this.dataUtilizacao = dataUtilizacao;
  }

  
  /**
   * Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)
   **/
  @ApiModelProperty(value = "Status da indica\u00E7\u00E3o (1 - CRIADO, 2 - UTILIZADO, 3 - PAGO)")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicacaoAmigoUpdate {\n");
    
    sb.append("  cpfIndicado: ").append(cpfIndicado).append("\n");
    sb.append("  emailIndicado: ").append(emailIndicado).append("\n");
    sb.append("  dataUtilizacao: ").append(dataUtilizacao).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
