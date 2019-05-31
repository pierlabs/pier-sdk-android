package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa um objeto para cadastrar uma nova indica\u00E7\u00E3o
 **/
@ApiModel(description = "Representa um objeto para cadastrar uma nova indica\u00E7\u00E3o")
public class IndicacaoAmigoPersist  {
  
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("cpfIndicado")
  private String cpfIndicado = null;
  @SerializedName("emailIndicado")
  private String emailIndicado = null;
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * Data de validade da indica\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Data de validade da indica\u00E7\u00E3o")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * N\u00FAmero do CPF do amigo indicado
   **/
  @ApiModelProperty(value = "N\u00FAmero do CPF do amigo indicado")
  public String getCpfIndicado() {
    return cpfIndicado;
  }
  public void setCpfIndicado(String cpfIndicado) {
    this.cpfIndicado = cpfIndicado;
  }

  
  /**
   * Email do amigo indicado
   **/
  @ApiModelProperty(value = "Email do amigo indicado")
  public String getEmailIndicado() {
    return emailIndicado;
  }
  public void setEmailIndicado(String emailIndicado) {
    this.emailIndicado = emailIndicado;
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
    sb.append("class IndicacaoAmigoPersist {\n");
    
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  cpfIndicado: ").append(cpfIndicado).append("\n");
    sb.append("  emailIndicado: ").append(emailIndicado).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
