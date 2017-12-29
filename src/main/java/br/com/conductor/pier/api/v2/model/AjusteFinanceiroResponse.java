package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do ajuste
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do ajuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data do ajuste
   **/
  @ApiModelProperty(value = "Data do ajuste")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * Valor do ajuste
   **/
  @ApiModelProperty(value = "Valor do ajuste")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do status da autoriza\u00C3\u00A7\u00C3\u00A3o da compra.")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * Status do ajuste.
   **/
  @ApiModelProperty(value = "Status do ajuste.")
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
