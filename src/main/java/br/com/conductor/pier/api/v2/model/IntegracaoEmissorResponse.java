package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Resposta do recurso de inclus\u00C3\u00A3o de registro para integra\u00C3\u00A7\u00C3\u00A3o
 **/
@ApiModel(description = "Resposta do recurso de inclus\u00C3\u00A3o de registro para integra\u00C3\u00A7\u00C3\u00A3o")
public class IntegracaoEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("dataEvento")
  private String dataEvento = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do registro na tabela Integra\u00C3\u00A7\u00C3\u00A3oEmissor.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do registro na tabela Integra\u00C3\u00A7\u00C3\u00A3oEmissor.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status do registro.
   **/
  @ApiModelProperty(value = "Status do registro.")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o do registro.
   **/
  @ApiModelProperty(value = "Data de inclus\u00C3\u00A3o do registro.")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataEvento: ").append(dataEvento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


