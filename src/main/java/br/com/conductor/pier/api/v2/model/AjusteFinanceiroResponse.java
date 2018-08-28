package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{ajuste_financeiro_response_description}}}
 **/
@ApiModel(description = "{{{ajuste_financeiro_response_description}}}")
public class AjusteFinanceiroResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoAjuste")
  private Long idTipoAjuste = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataAjuste")
  private String dataAjuste = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("identificadorExterno")
  private String identificadorExterno = null;
  @SerializedName("status")
  private Long status = null;

  
  /**
   * {{{ajuste_financeiro_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{ajuste_financeiro_response_id_tipo_ajuste_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_id_tipo_ajuste_value}}}")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * {{{ajuste_financeiro_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{ajuste_financeiro_response_data_ajuste_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_data_ajuste_value}}}")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * {{{ajuste_financeiro_response_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{ajuste_financeiro_response_identificador_externo_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_identificador_externo_value}}}")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * {{{ajuste_financeiro_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{ajuste_financeiro_response_status_value}}}")
  public Long getStatus() {
    return status;
  }
  public void setStatus(Long status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjusteFinanceiroResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoAjuste: ").append(idTipoAjuste).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  dataAjuste: ").append(dataAjuste).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  identificadorExterno: ").append(identificadorExterno).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
