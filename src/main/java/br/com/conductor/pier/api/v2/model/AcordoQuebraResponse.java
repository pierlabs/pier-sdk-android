package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{acordo_quebra_response_description}}}
 **/
@ApiModel(description = "{{{acordo_quebra_response_description}}}")
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
   * {{{acordo_quebra_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_quebra_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{acordo_quebra_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_quebra_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{acordo_quebra_response_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_quebra_response_status_conta_value}}}")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * {{{acordo_quebra_response_saldo_atual_final_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_quebra_response_saldo_atual_final_value}}}")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * {{{acordo_quebra_response_data_quebra_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_quebra_response_data_quebra_acordo_value}}}")
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
