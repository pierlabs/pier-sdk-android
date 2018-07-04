package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{acordo_response_description}}}
 **/
@ApiModel(description = "{{{acordo_response_description}}}")
public class AcordoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("statusAcordo")
  private Long statusAcordo = null;
  @SerializedName("valorAcordo")
  private BigDecimal valorAcordo = null;
  @SerializedName("dataAcordo")
  private String dataAcordo = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("diasEmAtraso")
  private Integer diasEmAtraso = null;

  
  /**
   * {{{acordo_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{acordo_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{acordo_response_status_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_status_acordo_value}}}")
  public Long getStatusAcordo() {
    return statusAcordo;
  }
  public void setStatusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
  }

  
  /**
   * {{{acordo_response_valor_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_valor_acordo_value}}}")
  public BigDecimal getValorAcordo() {
    return valorAcordo;
  }
  public void setValorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
  }

  
  /**
   * {{{acordo_response_data_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_data_acordo_value}}}")
  public String getDataAcordo() {
    return dataAcordo;
  }
  public void setDataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
  }

  
  /**
   * {{{acordo_response_quantidade_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_quantidade_parcelas_value}}}")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{acordo_response_saldo_atual_final_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_saldo_atual_final_value}}}")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * {{{acordo_response_dias_em_atraso_value}}}
   **/
  @ApiModelProperty(value = "{{{acordo_response_dias_em_atraso_value}}}")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  statusAcordo: ").append(statusAcordo).append("\n");
    sb.append("  valorAcordo: ").append(valorAcordo).append("\n");
    sb.append("  dataAcordo: ").append(dataAcordo).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  diasEmAtraso: ").append(diasEmAtraso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


