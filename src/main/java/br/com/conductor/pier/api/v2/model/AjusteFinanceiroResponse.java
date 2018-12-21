package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Response for Adjustment
 **/
@ApiModel(description = "Representation Object Response for Adjustment")
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
   * Identification Code of the Adjustment (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Adjustment (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Adjustment type
   **/
  @ApiModelProperty(value = "Identification Code of the Adjustment type")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * Identification Code of the Account (idConta)
   **/
  @ApiModelProperty(value = "Identification Code of the Account (idConta)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Date of adjustment
   **/
  @ApiModelProperty(value = "Date of adjustment")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * Value of Adjustment
   **/
  @ApiModelProperty(value = "Value of Adjustment")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Description of the shop authorization status
   **/
  @ApiModelProperty(value = "Description of the shop authorization status")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * Status of the adjustment
   **/
  @ApiModelProperty(value = "Status of the adjustment")
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
