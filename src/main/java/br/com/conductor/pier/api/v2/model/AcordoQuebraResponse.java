package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Response for agreement breaking
 **/
@ApiModel(description = "Representation Object Response for agreement breaking")
public class AcordoQuebraResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("statusConta")
  private Long statusConta = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("dataQuebraAcordo")
  private String dataQuebraAcordo = null;

  
  /**
   * Identification code of the agreement (id)
   **/
  @ApiModelProperty(value = "Identification code of the agreement (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Account Identification Code (idConta)
   **/
  @ApiModelProperty(value = "Account Identification Code (idConta)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Agreement Account Status
   **/
  @ApiModelProperty(value = "Agreement Account Status")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Account Current Current Balance
   **/
  @ApiModelProperty(value = "Account Current Current Balance")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Date of breach of agreement
   **/
  @ApiModelProperty(value = "Date of breach of agreement")
  public String getDataQuebraAcordo() {
    return dataQuebraAcordo;
  }
  public void setDataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoQuebraResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  dataQuebraAcordo: ").append(dataQuebraAcordo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
